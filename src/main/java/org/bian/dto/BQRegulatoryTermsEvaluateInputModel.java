package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord;
import org.bian.dto.BQRegulatoryTermsEvaluateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsEvaluateInputModel
 */
public class BQRegulatoryTermsEvaluateInputModel   {
  private BQRegulatoryTermsEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementInstanceReference = null;

  private Object regulatoryTermsInitiateActionRecord = null;

  private BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public BQRegulatoryTermsEvaluateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(BQRegulatoryTermsEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
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
   * @return regulatoryTermsInitiateActionRecord
  **/

  public Object getRegulatoryTermsInitiateActionRecord() {
    return regulatoryTermsInitiateActionRecord;
  }

  public void setRegulatoryTermsInitiateActionRecord(Object regulatoryTermsInitiateActionRecord) {
    this.regulatoryTermsInitiateActionRecord = regulatoryTermsInitiateActionRecord;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


}

