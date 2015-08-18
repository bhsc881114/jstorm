/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-27")
public class WorkerUploadMetrics implements org.apache.thrift.TBase<WorkerUploadMetrics, WorkerUploadMetrics._Fields>, java.io.Serializable, Cloneable, Comparable<WorkerUploadMetrics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WorkerUploadMetrics");

  private static final org.apache.thrift.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("topology_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SUPERVISOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisor_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField WORKER_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("workerMetric", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField NETTY_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("nettyMetric", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField TASK_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("taskMetric", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WorkerUploadMetricsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WorkerUploadMetricsTupleSchemeFactory());
  }

  private String topology_id; // required
  private String supervisor_id; // required
  private int port; // required
  private MetricInfo workerMetric; // required
  private NettyMetric nettyMetric; // required
  private Map<Integer,MetricInfo> taskMetric; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPOLOGY_ID((short)1, "topology_id"),
    SUPERVISOR_ID((short)2, "supervisor_id"),
    PORT((short)3, "port"),
    WORKER_METRIC((short)4, "workerMetric"),
    NETTY_METRIC((short)5, "nettyMetric"),
    TASK_METRIC((short)6, "taskMetric");

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
        case 1: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 2: // SUPERVISOR_ID
          return SUPERVISOR_ID;
        case 3: // PORT
          return PORT;
        case 4: // WORKER_METRIC
          return WORKER_METRIC;
        case 5: // NETTY_METRIC
          return NETTY_METRIC;
        case 6: // TASK_METRIC
          return TASK_METRIC;
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
  private static final int __PORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.thrift.meta_data.FieldMetaData("topology_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUPERVISOR_ID, new org.apache.thrift.meta_data.FieldMetaData("supervisor_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WORKER_METRIC, new org.apache.thrift.meta_data.FieldMetaData("workerMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class)));
    tmpMap.put(_Fields.NETTY_METRIC, new org.apache.thrift.meta_data.FieldMetaData("nettyMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NettyMetric.class)));
    tmpMap.put(_Fields.TASK_METRIC, new org.apache.thrift.meta_data.FieldMetaData("taskMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WorkerUploadMetrics.class, metaDataMap);
  }

  public WorkerUploadMetrics() {
  }

  public WorkerUploadMetrics(
    String topology_id,
    String supervisor_id,
    int port,
    MetricInfo workerMetric,
    NettyMetric nettyMetric,
    Map<Integer,MetricInfo> taskMetric)
  {
    this();
    this.topology_id = topology_id;
    this.supervisor_id = supervisor_id;
    this.port = port;
    set_port_isSet(true);
    this.workerMetric = workerMetric;
    this.nettyMetric = nettyMetric;
    this.taskMetric = taskMetric;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkerUploadMetrics(WorkerUploadMetrics other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_topology_id()) {
      this.topology_id = other.topology_id;
    }
    if (other.is_set_supervisor_id()) {
      this.supervisor_id = other.supervisor_id;
    }
    this.port = other.port;
    if (other.is_set_workerMetric()) {
      this.workerMetric = new MetricInfo(other.workerMetric);
    }
    if (other.is_set_nettyMetric()) {
      this.nettyMetric = new NettyMetric(other.nettyMetric);
    }
    if (other.is_set_taskMetric()) {
      Map<Integer,MetricInfo> __this__taskMetric = new HashMap<Integer,MetricInfo>(other.taskMetric.size());
      for (Map.Entry<Integer, MetricInfo> other_element : other.taskMetric.entrySet()) {

        Integer other_element_key = other_element.getKey();
        MetricInfo other_element_value = other_element.getValue();

        Integer __this__taskMetric_copy_key = other_element_key;

        MetricInfo __this__taskMetric_copy_value = new MetricInfo(other_element_value);

        __this__taskMetric.put(__this__taskMetric_copy_key, __this__taskMetric_copy_value);
      }
      this.taskMetric = __this__taskMetric;
    }
  }

  public WorkerUploadMetrics deepCopy() {
    return new WorkerUploadMetrics(this);
  }

  @Override
  public void clear() {
    this.topology_id = null;
    this.supervisor_id = null;
    set_port_isSet(false);
    this.port = 0;
    this.workerMetric = null;
    this.nettyMetric = null;
    this.taskMetric = null;
  }

  public String get_topology_id() {
    return this.topology_id;
  }

  public void set_topology_id(String topology_id) {
    this.topology_id = topology_id;
  }

  public void unset_topology_id() {
    this.topology_id = null;
  }

  /** Returns true if field topology_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_topology_id() {
    return this.topology_id != null;
  }

  public void set_topology_id_isSet(boolean value) {
    if (!value) {
      this.topology_id = null;
    }
  }

  public String get_supervisor_id() {
    return this.supervisor_id;
  }

  public void set_supervisor_id(String supervisor_id) {
    this.supervisor_id = supervisor_id;
  }

  public void unset_supervisor_id() {
    this.supervisor_id = null;
  }

  /** Returns true if field supervisor_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisor_id() {
    return this.supervisor_id != null;
  }

  public void set_supervisor_id_isSet(boolean value) {
    if (!value) {
      this.supervisor_id = null;
    }
  }

  public int get_port() {
    return this.port;
  }

  public void set_port(int port) {
    this.port = port;
    set_port_isSet(true);
  }

  public void unset_port() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean is_set_port() {
    return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void set_port_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public MetricInfo get_workerMetric() {
    return this.workerMetric;
  }

  public void set_workerMetric(MetricInfo workerMetric) {
    this.workerMetric = workerMetric;
  }

  public void unset_workerMetric() {
    this.workerMetric = null;
  }

  /** Returns true if field workerMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_workerMetric() {
    return this.workerMetric != null;
  }

  public void set_workerMetric_isSet(boolean value) {
    if (!value) {
      this.workerMetric = null;
    }
  }

  public NettyMetric get_nettyMetric() {
    return this.nettyMetric;
  }

  public void set_nettyMetric(NettyMetric nettyMetric) {
    this.nettyMetric = nettyMetric;
  }

  public void unset_nettyMetric() {
    this.nettyMetric = null;
  }

  /** Returns true if field nettyMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_nettyMetric() {
    return this.nettyMetric != null;
  }

  public void set_nettyMetric_isSet(boolean value) {
    if (!value) {
      this.nettyMetric = null;
    }
  }

  public int get_taskMetric_size() {
    return (this.taskMetric == null) ? 0 : this.taskMetric.size();
  }

  public void put_to_taskMetric(int key, MetricInfo val) {
    if (this.taskMetric == null) {
      this.taskMetric = new HashMap<Integer,MetricInfo>();
    }
    this.taskMetric.put(key, val);
  }

  public Map<Integer,MetricInfo> get_taskMetric() {
    return this.taskMetric;
  }

  public void set_taskMetric(Map<Integer,MetricInfo> taskMetric) {
    this.taskMetric = taskMetric;
  }

  public void unset_taskMetric() {
    this.taskMetric = null;
  }

  /** Returns true if field taskMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_taskMetric() {
    return this.taskMetric != null;
  }

  public void set_taskMetric_isSet(boolean value) {
    if (!value) {
      this.taskMetric = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY_ID:
      if (value == null) {
        unset_topology_id();
      } else {
        set_topology_id((String)value);
      }
      break;

    case SUPERVISOR_ID:
      if (value == null) {
        unset_supervisor_id();
      } else {
        set_supervisor_id((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unset_port();
      } else {
        set_port((Integer)value);
      }
      break;

    case WORKER_METRIC:
      if (value == null) {
        unset_workerMetric();
      } else {
        set_workerMetric((MetricInfo)value);
      }
      break;

    case NETTY_METRIC:
      if (value == null) {
        unset_nettyMetric();
      } else {
        set_nettyMetric((NettyMetric)value);
      }
      break;

    case TASK_METRIC:
      if (value == null) {
        unset_taskMetric();
      } else {
        set_taskMetric((Map<Integer,MetricInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_ID:
      return get_topology_id();

    case SUPERVISOR_ID:
      return get_supervisor_id();

    case PORT:
      return Integer.valueOf(get_port());

    case WORKER_METRIC:
      return get_workerMetric();

    case NETTY_METRIC:
      return get_nettyMetric();

    case TASK_METRIC:
      return get_taskMetric();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY_ID:
      return is_set_topology_id();
    case SUPERVISOR_ID:
      return is_set_supervisor_id();
    case PORT:
      return is_set_port();
    case WORKER_METRIC:
      return is_set_workerMetric();
    case NETTY_METRIC:
      return is_set_nettyMetric();
    case TASK_METRIC:
      return is_set_taskMetric();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkerUploadMetrics)
      return this.equals((WorkerUploadMetrics)that);
    return false;
  }

  public boolean equals(WorkerUploadMetrics that) {
    if (that == null)
      return false;

    boolean this_present_topology_id = true && this.is_set_topology_id();
    boolean that_present_topology_id = true && that.is_set_topology_id();
    if (this_present_topology_id || that_present_topology_id) {
      if (!(this_present_topology_id && that_present_topology_id))
        return false;
      if (!this.topology_id.equals(that.topology_id))
        return false;
    }

    boolean this_present_supervisor_id = true && this.is_set_supervisor_id();
    boolean that_present_supervisor_id = true && that.is_set_supervisor_id();
    if (this_present_supervisor_id || that_present_supervisor_id) {
      if (!(this_present_supervisor_id && that_present_supervisor_id))
        return false;
      if (!this.supervisor_id.equals(that.supervisor_id))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_workerMetric = true && this.is_set_workerMetric();
    boolean that_present_workerMetric = true && that.is_set_workerMetric();
    if (this_present_workerMetric || that_present_workerMetric) {
      if (!(this_present_workerMetric && that_present_workerMetric))
        return false;
      if (!this.workerMetric.equals(that.workerMetric))
        return false;
    }

    boolean this_present_nettyMetric = true && this.is_set_nettyMetric();
    boolean that_present_nettyMetric = true && that.is_set_nettyMetric();
    if (this_present_nettyMetric || that_present_nettyMetric) {
      if (!(this_present_nettyMetric && that_present_nettyMetric))
        return false;
      if (!this.nettyMetric.equals(that.nettyMetric))
        return false;
    }

    boolean this_present_taskMetric = true && this.is_set_taskMetric();
    boolean that_present_taskMetric = true && that.is_set_taskMetric();
    if (this_present_taskMetric || that_present_taskMetric) {
      if (!(this_present_taskMetric && that_present_taskMetric))
        return false;
      if (!this.taskMetric.equals(that.taskMetric))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topology_id = true && (is_set_topology_id());
    list.add(present_topology_id);
    if (present_topology_id)
      list.add(topology_id);

    boolean present_supervisor_id = true && (is_set_supervisor_id());
    list.add(present_supervisor_id);
    if (present_supervisor_id)
      list.add(supervisor_id);

    boolean present_port = true;
    list.add(present_port);
    if (present_port)
      list.add(port);

    boolean present_workerMetric = true && (is_set_workerMetric());
    list.add(present_workerMetric);
    if (present_workerMetric)
      list.add(workerMetric);

    boolean present_nettyMetric = true && (is_set_nettyMetric());
    list.add(present_nettyMetric);
    if (present_nettyMetric)
      list.add(nettyMetric);

    boolean present_taskMetric = true && (is_set_taskMetric());
    list.add(present_taskMetric);
    if (present_taskMetric)
      list.add(taskMetric);

    return list.hashCode();
  }

  @Override
  public int compareTo(WorkerUploadMetrics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_topology_id()).compareTo(other.is_set_topology_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topology_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topology_id, other.topology_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_supervisor_id()).compareTo(other.is_set_supervisor_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisor_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisor_id, other.supervisor_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_port()).compareTo(other.is_set_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_workerMetric()).compareTo(other.is_set_workerMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_workerMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerMetric, other.workerMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_nettyMetric()).compareTo(other.is_set_nettyMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nettyMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nettyMetric, other.nettyMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_taskMetric()).compareTo(other.is_set_taskMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_taskMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskMetric, other.taskMetric);
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
    StringBuilder sb = new StringBuilder("WorkerUploadMetrics(");
    boolean first = true;

    sb.append("topology_id:");
    if (this.topology_id == null) {
      sb.append("null");
    } else {
      sb.append(this.topology_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("supervisor_id:");
    if (this.supervisor_id == null) {
      sb.append("null");
    } else {
      sb.append(this.supervisor_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("workerMetric:");
    if (this.workerMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.workerMetric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nettyMetric:");
    if (this.nettyMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.nettyMetric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskMetric:");
    if (this.taskMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.taskMetric);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_topology_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topology_id' is unset! Struct:" + toString());
    }

    if (!is_set_supervisor_id()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'supervisor_id' is unset! Struct:" + toString());
    }

    if (!is_set_port()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'port' is unset! Struct:" + toString());
    }

    if (!is_set_workerMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'workerMetric' is unset! Struct:" + toString());
    }

    if (!is_set_nettyMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nettyMetric' is unset! Struct:" + toString());
    }

    if (!is_set_taskMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskMetric' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (workerMetric != null) {
      workerMetric.validate();
    }
    if (nettyMetric != null) {
      nettyMetric.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WorkerUploadMetricsStandardSchemeFactory implements SchemeFactory {
    public WorkerUploadMetricsStandardScheme getScheme() {
      return new WorkerUploadMetricsStandardScheme();
    }
  }

  private static class WorkerUploadMetricsStandardScheme extends StandardScheme<WorkerUploadMetrics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topology_id = iprot.readString();
              struct.set_topology_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUPERVISOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.supervisor_id = iprot.readString();
              struct.set_supervisor_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.set_port_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WORKER_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.workerMetric = new MetricInfo();
              struct.workerMetric.read(iprot);
              struct.set_workerMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NETTY_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nettyMetric = new NettyMetric();
              struct.nettyMetric.read(iprot);
              struct.set_nettyMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TASK_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map284 = iprot.readMapBegin();
                struct.taskMetric = new HashMap<Integer,MetricInfo>(2*_map284.size);
                int _key285;
                MetricInfo _val286;
                for (int _i287 = 0; _i287 < _map284.size; ++_i287)
                {
                  _key285 = iprot.readI32();
                  _val286 = new MetricInfo();
                  _val286.read(iprot);
                  struct.taskMetric.put(_key285, _val286);
                }
                iprot.readMapEnd();
              }
              struct.set_taskMetric_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topology_id != null) {
        oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
        oprot.writeString(struct.topology_id);
        oprot.writeFieldEnd();
      }
      if (struct.supervisor_id != null) {
        oprot.writeFieldBegin(SUPERVISOR_ID_FIELD_DESC);
        oprot.writeString(struct.supervisor_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      if (struct.workerMetric != null) {
        oprot.writeFieldBegin(WORKER_METRIC_FIELD_DESC);
        struct.workerMetric.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.nettyMetric != null) {
        oprot.writeFieldBegin(NETTY_METRIC_FIELD_DESC);
        struct.nettyMetric.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.taskMetric != null) {
        oprot.writeFieldBegin(TASK_METRIC_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.taskMetric.size()));
          for (Map.Entry<Integer, MetricInfo> _iter288 : struct.taskMetric.entrySet())
          {
            oprot.writeI32(_iter288.getKey());
            _iter288.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WorkerUploadMetricsTupleSchemeFactory implements SchemeFactory {
    public WorkerUploadMetricsTupleScheme getScheme() {
      return new WorkerUploadMetricsTupleScheme();
    }
  }

  private static class WorkerUploadMetricsTupleScheme extends TupleScheme<WorkerUploadMetrics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topology_id);
      oprot.writeString(struct.supervisor_id);
      oprot.writeI32(struct.port);
      struct.workerMetric.write(oprot);
      struct.nettyMetric.write(oprot);
      {
        oprot.writeI32(struct.taskMetric.size());
        for (Map.Entry<Integer, MetricInfo> _iter289 : struct.taskMetric.entrySet())
        {
          oprot.writeI32(_iter289.getKey());
          _iter289.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WorkerUploadMetrics struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topology_id = iprot.readString();
      struct.set_topology_id_isSet(true);
      struct.supervisor_id = iprot.readString();
      struct.set_supervisor_id_isSet(true);
      struct.port = iprot.readI32();
      struct.set_port_isSet(true);
      struct.workerMetric = new MetricInfo();
      struct.workerMetric.read(iprot);
      struct.set_workerMetric_isSet(true);
      struct.nettyMetric = new NettyMetric();
      struct.nettyMetric.read(iprot);
      struct.set_nettyMetric_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map290 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.taskMetric = new HashMap<Integer,MetricInfo>(2*_map290.size);
        int _key291;
        MetricInfo _val292;
        for (int _i293 = 0; _i293 < _map290.size; ++_i293)
        {
          _key291 = iprot.readI32();
          _val292 = new MetricInfo();
          _val292.read(iprot);
          struct.taskMetric.put(_key291, _val292);
        }
      }
      struct.set_taskMetric_isSet(true);
    }
  }

}

