package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsEvaluateInputModelPolicyTermsInstanceRecord;
import org.bian.dto.BQPolicyTermsEvaluateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsEvaluateInputModel
 */
public class BQPolicyTermsEvaluateInputModel   {
  private BQPolicyTermsEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementInstanceReference = null;

  private Object policyTermsInitiateActionRecord = null;

  private BQPolicyTermsEvaluateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public BQPolicyTermsEvaluateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(BQPolicyTermsEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return policyTermsInitiateActionRecord
  **/

  public Object getPolicyTermsInitiateActionRecord() {
    return policyTermsInitiateActionRecord;
  }

  public void setPolicyTermsInitiateActionRecord(Object policyTermsInitiateActionRecord) {
    this.policyTermsInitiateActionRecord = policyTermsInitiateActionRecord;
  }


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsEvaluateInputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsEvaluateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


}

