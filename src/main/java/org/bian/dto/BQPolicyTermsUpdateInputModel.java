package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord;
import org.bian.dto.BQPolicyTermsUpdateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsUpdateInputModel
 */
public class BQPolicyTermsUpdateInputModel   {
  private BQPolicyTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementInstanceReference = null;

  private String policyTermsInstanceReference = null;

  private BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;

  private Object policyTermsUpdateActionTaskRecord = null;

  private String policyTermsUpdateActionRequest = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public BQPolicyTermsUpdateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(BQPolicyTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
    this.salesProductAgreementInstanceRecord = salesProductAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Sales Product Agreement instance 
   * @return salesProductAgreementInstanceReference
  **/

  public String getSalesProductAgreementInstanceReference() {
    return salesProductAgreementInstanceReference;
  }

  public void setSalesProductAgreementInstanceReference(String salesProductAgreementInstanceReference) {
    this.salesProductAgreementInstanceReference = salesProductAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Policy Terms instance 
   * @return policyTermsInstanceReference
  **/

  public String getPolicyTermsInstanceReference() {
    return policyTermsInstanceReference;
  }

  public void setPolicyTermsInstanceReference(String policyTermsInstanceReference) {
    this.policyTermsInstanceReference = policyTermsInstanceReference;
  }


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return policyTermsUpdateActionTaskRecord
  **/

  public Object getPolicyTermsUpdateActionTaskRecord() {
    return policyTermsUpdateActionTaskRecord;
  }

  public void setPolicyTermsUpdateActionTaskRecord(Object policyTermsUpdateActionTaskRecord) {
    this.policyTermsUpdateActionTaskRecord = policyTermsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return policyTermsUpdateActionRequest
  **/

  public String getPolicyTermsUpdateActionRequest() {
    return policyTermsUpdateActionRequest;
  }

  public void setPolicyTermsUpdateActionRequest(String policyTermsUpdateActionRequest) {
    this.policyTermsUpdateActionRequest = policyTermsUpdateActionRequest;
  }


}

