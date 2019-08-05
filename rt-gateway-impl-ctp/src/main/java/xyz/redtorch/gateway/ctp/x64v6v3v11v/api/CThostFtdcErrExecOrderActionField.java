/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcErrExecOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcErrExecOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrExecOrderActionField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcErrExecOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setExecOrderActionRef(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExecOrderActionRef_set(swigCPtr, this, value);
  }

  public int getExecOrderActionRef() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExecOrderActionRef_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v3v11x64apiJNI.CThostFtdcErrExecOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcErrExecOrderActionField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcErrExecOrderActionField(), true);
  }

}
