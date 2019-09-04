package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsUpdateInputModelLegalTermsInstanceRecord;
import org.bian.dto.BQLegalTermsUpdateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsUpdateInputModel
 */
public class BQLegalTermsUpdateInputModel   {
  private BQLegalTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementInstanceReference = null;

  private String legalTermsInstanceReference = null;

  private BQLegalTermsUpdateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;

  private Object legalTermsUpdateActionTaskRecord = null;

  private String legalTermsUpdateActionRequest = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public BQLegalTermsUpdateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(BQLegalTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Legal Terms instance 
   * @return legalTermsInstanceReference
  **/

  public String getLegalTermsInstanceReference() {
    return legalTermsInstanceReference;
  }

  public void setLegalTermsInstanceReference(String legalTermsInstanceReference) {
    this.legalTermsInstanceReference = legalTermsInstanceReference;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsUpdateInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsUpdateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return legalTermsUpdateActionTaskRecord
  **/

  public Object getLegalTermsUpdateActionTaskRecord() {
    return legalTermsUpdateActionTaskRecord;
  }

  public void setLegalTermsUpdateActionTaskRecord(Object legalTermsUpdateActionTaskRecord) {
    this.legalTermsUpdateActionTaskRecord = legalTermsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return legalTermsUpdateActionRequest
  **/

  public String getLegalTermsUpdateActionRequest() {
    return legalTermsUpdateActionRequest;
  }

  public void setLegalTermsUpdateActionRequest(String legalTermsUpdateActionRequest) {
    this.legalTermsUpdateActionRequest = legalTermsUpdateActionRequest;
  }


}

