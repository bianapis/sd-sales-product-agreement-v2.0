package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord;
import org.bian.dto.BQRegulatoryTermsUpdateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsUpdateInputModel
 */
public class BQRegulatoryTermsUpdateInputModel   {
  private BQRegulatoryTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementInstanceReference = null;

  private String regulatoryTermsInstanceReference = null;

  private BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private Object regulatoryTermsUpdateActionTaskRecord = null;

  private String regulatoryTermsUpdateActionRequest = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public BQRegulatoryTermsUpdateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(BQRegulatoryTermsUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory Terms instance 
   * @return regulatoryTermsInstanceReference
  **/

  public String getRegulatoryTermsInstanceReference() {
    return regulatoryTermsInstanceReference;
  }

  public void setRegulatoryTermsInstanceReference(String regulatoryTermsInstanceReference) {
    this.regulatoryTermsInstanceReference = regulatoryTermsInstanceReference;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return regulatoryTermsUpdateActionTaskRecord
  **/

  public Object getRegulatoryTermsUpdateActionTaskRecord() {
    return regulatoryTermsUpdateActionTaskRecord;
  }

  public void setRegulatoryTermsUpdateActionTaskRecord(Object regulatoryTermsUpdateActionTaskRecord) {
    this.regulatoryTermsUpdateActionTaskRecord = regulatoryTermsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return regulatoryTermsUpdateActionRequest
  **/

  public String getRegulatoryTermsUpdateActionRequest() {
    return regulatoryTermsUpdateActionRequest;
  }

  public void setRegulatoryTermsUpdateActionRequest(String regulatoryTermsUpdateActionRequest) {
    this.regulatoryTermsUpdateActionRequest = regulatoryTermsUpdateActionRequest;
  }


}

