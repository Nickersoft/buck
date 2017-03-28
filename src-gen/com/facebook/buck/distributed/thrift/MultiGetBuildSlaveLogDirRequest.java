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
public class MultiGetBuildSlaveLogDirRequest implements org.apache.thrift.TBase<MultiGetBuildSlaveLogDirRequest, MultiGetBuildSlaveLogDirRequest._Fields>, java.io.Serializable, Cloneable, Comparable<MultiGetBuildSlaveLogDirRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MultiGetBuildSlaveLogDirRequest");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RUN_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("runIds", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MultiGetBuildSlaveLogDirRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MultiGetBuildSlaveLogDirRequestTupleSchemeFactory());
  }

  public StampedeId stampedeId; // optional
  public List<RunId> runIds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    RUN_IDS((short)2, "runIds");

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
        case 1: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 2: // RUN_IDS
          return RUN_IDS;
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
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.RUN_IDS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.RUN_IDS, new org.apache.thrift.meta_data.FieldMetaData("runIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RunId.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MultiGetBuildSlaveLogDirRequest.class, metaDataMap);
  }

  public MultiGetBuildSlaveLogDirRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiGetBuildSlaveLogDirRequest(MultiGetBuildSlaveLogDirRequest other) {
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetRunIds()) {
      List<RunId> __this__runIds = new ArrayList<RunId>(other.runIds.size());
      for (RunId other_element : other.runIds) {
        __this__runIds.add(new RunId(other_element));
      }
      this.runIds = __this__runIds;
    }
  }

  public MultiGetBuildSlaveLogDirRequest deepCopy() {
    return new MultiGetBuildSlaveLogDirRequest(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.runIds = null;
  }

  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public MultiGetBuildSlaveLogDirRequest setStampedeId(StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  public int getRunIdsSize() {
    return (this.runIds == null) ? 0 : this.runIds.size();
  }

  public java.util.Iterator<RunId> getRunIdsIterator() {
    return (this.runIds == null) ? null : this.runIds.iterator();
  }

  public void addToRunIds(RunId elem) {
    if (this.runIds == null) {
      this.runIds = new ArrayList<RunId>();
    }
    this.runIds.add(elem);
  }

  public List<RunId> getRunIds() {
    return this.runIds;
  }

  public MultiGetBuildSlaveLogDirRequest setRunIds(List<RunId> runIds) {
    this.runIds = runIds;
    return this;
  }

  public void unsetRunIds() {
    this.runIds = null;
  }

  /** Returns true if field runIds is set (has been assigned a value) and false otherwise */
  public boolean isSetRunIds() {
    return this.runIds != null;
  }

  public void setRunIdsIsSet(boolean value) {
    if (!value) {
      this.runIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((StampedeId)value);
      }
      break;

    case RUN_IDS:
      if (value == null) {
        unsetRunIds();
      } else {
        setRunIds((List<RunId>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case RUN_IDS:
      return getRunIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STAMPEDE_ID:
      return isSetStampedeId();
    case RUN_IDS:
      return isSetRunIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiGetBuildSlaveLogDirRequest)
      return this.equals((MultiGetBuildSlaveLogDirRequest)that);
    return false;
  }

  public boolean equals(MultiGetBuildSlaveLogDirRequest that) {
    if (that == null)
      return false;

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_runIds = true && this.isSetRunIds();
    boolean that_present_runIds = true && that.isSetRunIds();
    if (this_present_runIds || that_present_runIds) {
      if (!(this_present_runIds && that_present_runIds))
        return false;
      if (!this.runIds.equals(that.runIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    boolean present_runIds = true && (isSetRunIds());
    list.add(present_runIds);
    if (present_runIds)
      list.add(runIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(MultiGetBuildSlaveLogDirRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunIds()).compareTo(other.isSetRunIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runIds, other.runIds);
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
    StringBuilder sb = new StringBuilder("MultiGetBuildSlaveLogDirRequest(");
    boolean first = true;

    if (isSetStampedeId()) {
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetRunIds()) {
      if (!first) sb.append(", ");
      sb.append("runIds:");
      if (this.runIds == null) {
        sb.append("null");
      } else {
        sb.append(this.runIds);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
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

  private static class MultiGetBuildSlaveLogDirRequestStandardSchemeFactory implements SchemeFactory {
    public MultiGetBuildSlaveLogDirRequestStandardScheme getScheme() {
      return new MultiGetBuildSlaveLogDirRequestStandardScheme();
    }
  }

  private static class MultiGetBuildSlaveLogDirRequestStandardScheme extends StandardScheme<MultiGetBuildSlaveLogDirRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RUN_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list106 = iprot.readListBegin();
                struct.runIds = new ArrayList<RunId>(_list106.size);
                RunId _elem107;
                for (int _i108 = 0; _i108 < _list106.size; ++_i108)
                {
                  _elem107 = new RunId();
                  _elem107.read(iprot);
                  struct.runIds.add(_elem107);
                }
                iprot.readListEnd();
              }
              struct.setRunIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.runIds != null) {
        if (struct.isSetRunIds()) {
          oprot.writeFieldBegin(RUN_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.runIds.size()));
            for (RunId _iter109 : struct.runIds)
            {
              _iter109.write(oprot);
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

  private static class MultiGetBuildSlaveLogDirRequestTupleSchemeFactory implements SchemeFactory {
    public MultiGetBuildSlaveLogDirRequestTupleScheme getScheme() {
      return new MultiGetBuildSlaveLogDirRequestTupleScheme();
    }
  }

  private static class MultiGetBuildSlaveLogDirRequestTupleScheme extends TupleScheme<MultiGetBuildSlaveLogDirRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetRunIds()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetRunIds()) {
        {
          oprot.writeI32(struct.runIds.size());
          for (RunId _iter110 : struct.runIds)
          {
            _iter110.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MultiGetBuildSlaveLogDirRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list111 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.runIds = new ArrayList<RunId>(_list111.size);
          RunId _elem112;
          for (int _i113 = 0; _i113 < _list111.size; ++_i113)
          {
            _elem112 = new RunId();
            _elem112.read(iprot);
            struct.runIds.add(_elem112);
          }
        }
        struct.setRunIdsIsSet(true);
      }
    }
  }

}

