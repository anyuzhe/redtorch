/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcQryContractBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryContractBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryContractBankField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcQryContractBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryContractBankField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryContractBankField_BrokerID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryContractBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryContractBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryContractBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryContractBankField_BankBrchID_get(swigCPtr, this);
  }

  public CThostFtdcQryContractBankField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcQryContractBankField(), true);
  }

}
