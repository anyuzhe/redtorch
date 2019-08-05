/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcMarketDataStaticField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataStaticField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataStaticField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcMarketDataStaticField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOpenPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_LowestPrice_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_ClosePrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataStaticField_CurrDelta_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataStaticField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcMarketDataStaticField(), true);
  }

}
