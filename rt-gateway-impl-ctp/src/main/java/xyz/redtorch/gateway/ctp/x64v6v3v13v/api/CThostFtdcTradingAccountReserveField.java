/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcTradingAccountReserveField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingAccountReserveField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountReserveField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcTradingAccountReserveField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_AccountID_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_Reserve_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcTradingAccountReserveField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountReserveField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcTradingAccountReserveField(), true);
  }

}