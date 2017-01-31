/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.jvm.java.abi;

import com.facebook.buck.io.ProjectFilesystem;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class StubJar {
  private final Supplier<LibraryReader<ClassMirror>> libraryReaderSupplier;

  public StubJar(Path toMirror) {
    libraryReaderSupplier = () ->
        new StubbingLibraryReader(LibraryReader.of(toMirror), BytecodeStubber::createStub);
  }

  public void writeTo(ProjectFilesystem filesystem, Path path) throws IOException {
    try (StubJarWriter writer = new FilesystemStubJarWriter(filesystem, path)) {
      writeTo(writer);
    }
  }

  private void writeTo(StubJarWriter writer) throws IOException {
    try (LibraryReader<ClassMirror> input = libraryReaderSupplier.get()) {
      List<Path> paths = new ArrayList<>(input.getRelativePaths());
      Collections.sort(paths);

      for (Path path : paths) {
        if (isStubbableResource(input, path)) {
          try (InputStream resourceContents = input.openResourceFile(path)) {
            writer.writeResource(path, resourceContents);
          }
        } else if (input.isClass(path)) {
          ClassMirror stub = input.openClass(path);
          writer.writeClass(path, stub);
        }
      }
    }
  }

  private boolean isStubbableResource(LibraryReader<?> input, Path path) {
    return input.isResource(path) && !path.endsWith("META-INF" + File.separator + "MANIFEST.MF");
  }
}
