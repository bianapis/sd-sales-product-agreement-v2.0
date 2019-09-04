package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord;
import org.bian.dto.CRSalesProductAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRequestInputModel
 */
public class BQPolicyTermsRequestInputModel   {
  private String salesProductAgreementInstanceReference = null;

  private String policyTermsInstanceReference = null;

  private BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;

  private Object policyTermsRequestActionTaskRecord = null;

  private CRSalesProductAgreementRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return policyTermsRequestActionTaskRecord
  **/

  public Object getPolicyTermsRequestActionTaskRecord() {
    return policyTermsRequestActionTaskRecord;
  }

  public void setPolicyTermsRequestActionTaskRecord(Object policyTermsRequestActionTaskRecord) {
    this.policyTermsRequestActionTaskRecord = policyTermsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRSalesProductAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRSalesProductAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

