/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcDisseminationField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDisseminationField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDisseminationField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcDisseminationField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSequenceSeries(short value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDisseminationField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDisseminationField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcDisseminationField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v3v13x64apiJNI.CThostFtdcDisseminationField_SequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcDisseminationField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcDisseminationField(), true);
  }

}
