/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcMarketDataField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctpv6v3v11x64apiJNI.CThostFtdcMarketDataField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcMarketDataField(), true);
  }

}
