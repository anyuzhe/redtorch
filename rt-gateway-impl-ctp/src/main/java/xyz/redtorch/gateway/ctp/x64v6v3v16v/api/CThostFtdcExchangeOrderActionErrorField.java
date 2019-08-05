/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcExchangeOrderActionErrorField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOrderActionErrorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOrderActionErrorField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcExchangeOrderActionErrorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_OrderSysID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ActionLocalID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeOrderActionErrorField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderActionErrorField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcExchangeOrderActionErrorField(), true);
  }

}
