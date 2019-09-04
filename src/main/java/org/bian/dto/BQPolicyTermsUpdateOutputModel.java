package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord;
import org.bian.dto.BQPolicyTermsUpdateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsUpdateOutputModel
 */
public class BQPolicyTermsUpdateOutputModel   {
  private BQPolicyTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;

  private String policyTermsUpdateActionTaskReference = null;

  private Object policyTermsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return policyTermsUpdateActionTaskReference
  **/

  public String getPolicyTermsUpdateActionTaskReference() {
    return policyTermsUpdateActionTaskReference;
  }

  public void setPolicyTermsUpdateActionTaskReference(String policyTermsUpdateActionTaskReference) {
    this.policyTermsUpdateActionTaskReference = policyTermsUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

