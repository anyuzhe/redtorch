/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcBrokerUserOTPParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserOTPParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserOTPParamField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcBrokerUserOTPParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_UserID_get(swigCPtr, this);
  }

  public void setOTPVendorsID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_set(swigCPtr, this, value);
  }

  public String getOTPVendorsID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_get(swigCPtr, this);
  }

  public void setSerialNumber(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_set(swigCPtr, this, value);
  }

  public String getSerialNumber() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_get(swigCPtr, this);
  }

  public void setAuthKey(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_AuthKey_set(swigCPtr, this, value);
  }

  public String getAuthKey() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_AuthKey_get(swigCPtr, this);
  }

  public void setLastDrift(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_LastDrift_set(swigCPtr, this, value);
  }

  public int getLastDrift() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_LastDrift_get(swigCPtr, this);
  }

  public void setLastSuccess(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_set(swigCPtr, this, value);
  }

  public int getLastSuccess() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_get(swigCPtr, this);
  }

  public void setOTPType(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_OTPType_set(swigCPtr, this, value);
  }

  public char getOTPType() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBrokerUserOTPParamField_OTPType_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserOTPParamField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcBrokerUserOTPParamField(), true);
  }

}
