/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcRspUserLoginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserLoginField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcRspUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_FFEXTime_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspUserLoginField_INETime_get(swigCPtr, this);
  }

  public CThostFtdcRspUserLoginField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcRspUserLoginField(), true);
  }

}
