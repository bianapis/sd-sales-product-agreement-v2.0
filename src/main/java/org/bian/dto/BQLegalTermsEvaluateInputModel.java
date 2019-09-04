package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord;
import org.bian.dto.BQLegalTermsEvaluateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsEvaluateInputModel
 */
public class BQLegalTermsEvaluateInputModel   {
  private BQLegalTermsEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementInstanceReference = null;

  private Object legalTermsInitiateActionRecord = null;

  private BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public BQLegalTermsEvaluateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(BQLegalTermsEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
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
   * @return legalTermsInitiateActionRecord
  **/

  public Object getLegalTermsInitiateActionRecord() {
    return legalTermsInitiateActionRecord;
  }

  public void setLegalTermsInitiateActionRecord(Object legalTermsInitiateActionRecord) {
    this.legalTermsInitiateActionRecord = legalTermsInitiateActionRecord;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


}

