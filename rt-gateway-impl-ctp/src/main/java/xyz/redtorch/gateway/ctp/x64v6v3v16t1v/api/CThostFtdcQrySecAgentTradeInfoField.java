/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcQrySecAgentTradeInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySecAgentTradeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySecAgentTradeInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcQrySecAgentTradeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQrySecAgentTradeInfoField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public CThostFtdcQrySecAgentTradeInfoField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcQrySecAgentTradeInfoField(), true);
  }

}
