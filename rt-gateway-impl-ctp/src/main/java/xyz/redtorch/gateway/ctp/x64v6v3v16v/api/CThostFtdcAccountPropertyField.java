/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcAccountPropertyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAccountPropertyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAccountPropertyField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcAccountPropertyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_BankID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_BankAccount_get(swigCPtr, this);
  }

  public void setOpenName(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OpenName_set(swigCPtr, this, value);
  }

  public String getOpenName() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OpenName_get(swigCPtr, this);
  }

  public void setOpenBank(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OpenBank_set(swigCPtr, this, value);
  }

  public String getOpenBank() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OpenBank_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_IsActive_get(swigCPtr, this);
  }

  public void setAccountSourceType(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_AccountSourceType_set(swigCPtr, this, value);
  }

  public char getAccountSourceType() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_AccountSourceType_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OpenDate_get(swigCPtr, this);
  }

  public void setCancelDate(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_CancelDate_set(swigCPtr, this, value);
  }

  public String getCancelDate() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_CancelDate_get(swigCPtr, this);
  }

  public void setOperatorID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OperatorID_set(swigCPtr, this, value);
  }

  public String getOperatorID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OperatorID_get(swigCPtr, this);
  }

  public void setOperateDate(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OperateDate_set(swigCPtr, this, value);
  }

  public String getOperateDate() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OperateDate_get(swigCPtr, this);
  }

  public void setOperateTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OperateTime_set(swigCPtr, this, value);
  }

  public String getOperateTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_OperateTime_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcAccountPropertyField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcAccountPropertyField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcAccountPropertyField(), true);
  }

}
