/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-28")
public class StoreLocalChangesRequest implements org.apache.thrift.TBase<StoreLocalChangesRequest, StoreLocalChangesRequest._Fields>, java.io.Serializable, Cloneable, Comparable<StoreLocalChangesRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StoreLocalChangesRequest");

  private static final org.apache.thrift.protocol.TField FILES_FIELD_DESC = new org.apache.thrift.protocol.TField("files", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StoreLocalChangesRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StoreLocalChangesRequestTupleSchemeFactory());
  }

  public List<FileInfo> files; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILES((short)1, "files");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILES
          return FILES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.FILES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILES, new org.apache.thrift.meta_data.FieldMetaData("files", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FileInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StoreLocalChangesRequest.class, metaDataMap);
  }

  public StoreLocalChangesRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StoreLocalChangesRequest(StoreLocalChangesRequest other) {
    if (other.isSetFiles()) {
      List<FileInfo> __this__files = new ArrayList<FileInfo>(other.files.size());
      for (FileInfo other_element : other.files) {
        __this__files.add(new FileInfo(other_element));
      }
      this.files = __this__files;
    }
  }

  public StoreLocalChangesRequest deepCopy() {
    return new StoreLocalChangesRequest(this);
  }

  @Override
  public void clear() {
    this.files = null;
  }

  public int getFilesSize() {
    return (this.files == null) ? 0 : this.files.size();
  }

  public java.util.Iterator<FileInfo> getFilesIterator() {
    return (this.files == null) ? null : this.files.iterator();
  }

  public void addToFiles(FileInfo elem) {
    if (this.files == null) {
      this.files = new ArrayList<FileInfo>();
    }
    this.files.add(elem);
  }

  public List<FileInfo> getFiles() {
    return this.files;
  }

  public StoreLocalChangesRequest setFiles(List<FileInfo> files) {
    this.files = files;
    return this;
  }

  public void unsetFiles() {
    this.files = null;
  }

  /** Returns true if field files is set (has been assigned a value) and false otherwise */
  public boolean isSetFiles() {
    return this.files != null;
  }

  public void setFilesIsSet(boolean value) {
    if (!value) {
      this.files = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILES:
      if (value == null) {
        unsetFiles();
      } else {
        setFiles((List<FileInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILES:
      return getFiles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILES:
      return isSetFiles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StoreLocalChangesRequest)
      return this.equals((StoreLocalChangesRequest)that);
    return false;
  }

  public boolean equals(StoreLocalChangesRequest that) {
    if (that == null)
      return false;

    boolean this_present_files = true && this.isSetFiles();
    boolean that_present_files = true && that.isSetFiles();
    if (this_present_files || that_present_files) {
      if (!(this_present_files && that_present_files))
        return false;
      if (!this.files.equals(that.files))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_files = true && (isSetFiles());
    list.add(present_files);
    if (present_files)
      list.add(files);

    return list.hashCode();
  }

  @Override
  public int compareTo(StoreLocalChangesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFiles()).compareTo(other.isSetFiles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.files, other.files);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StoreLocalChangesRequest(");
    boolean first = true;

    if (isSetFiles()) {
      sb.append("files:");
      if (this.files == null) {
        sb.append("null");
      } else {
        sb.append(this.files);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StoreLocalChangesRequestStandardSchemeFactory implements SchemeFactory {
    public StoreLocalChangesRequestStandardScheme getScheme() {
      return new StoreLocalChangesRequestStandardScheme();
    }
  }

  private static class StoreLocalChangesRequestStandardScheme extends StandardScheme<StoreLocalChangesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StoreLocalChangesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list74 = iprot.readListBegin();
                struct.files = new ArrayList<FileInfo>(_list74.size);
                FileInfo _elem75;
                for (int _i76 = 0; _i76 < _list74.size; ++_i76)
                {
                  _elem75 = new FileInfo();
                  _elem75.read(iprot);
                  struct.files.add(_elem75);
                }
                iprot.readListEnd();
              }
              struct.setFilesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StoreLocalChangesRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.files != null) {
        if (struct.isSetFiles()) {
          oprot.writeFieldBegin(FILES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.files.size()));
            for (FileInfo _iter77 : struct.files)
            {
              _iter77.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StoreLocalChangesRequestTupleSchemeFactory implements SchemeFactory {
    public StoreLocalChangesRequestTupleScheme getScheme() {
      return new StoreLocalChangesRequestTupleScheme();
    }
  }

  private static class StoreLocalChangesRequestTupleScheme extends TupleScheme<StoreLocalChangesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StoreLocalChangesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFiles()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFiles()) {
        {
          oprot.writeI32(struct.files.size());
          for (FileInfo _iter78 : struct.files)
          {
            _iter78.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StoreLocalChangesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list79 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.files = new ArrayList<FileInfo>(_list79.size);
          FileInfo _elem80;
          for (int _i81 = 0; _i81 < _list79.size; ++_i81)
          {
            _elem80 = new FileInfo();
            _elem80.read(iprot);
            struct.files.add(_elem80);
          }
        }
        struct.setFilesIsSet(true);
      }
    }
  }

}

