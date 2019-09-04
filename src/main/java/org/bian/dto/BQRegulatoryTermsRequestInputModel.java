package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord;
import org.bian.dto.CRSalesProductAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRequestInputModel
 */
public class BQRegulatoryTermsRequestInputModel   {
  private String salesProductAgreementInstanceReference = null;

  private String regulatoryTermsInstanceReference = null;

  private BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private Object regulatoryTermsRequestActionTaskRecord = null;

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

  public BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return regulatoryTermsRequestActionTaskRecord
  **/

  public Object getRegulatoryTermsRequestActionTaskRecord() {
    return regulatoryTermsRequestActionTaskRecord;
  }

  public void setRegulatoryTermsRequestActionTaskRecord(Object regulatoryTermsRequestActionTaskRecord) {
    this.regulatoryTermsRequestActionTaskRecord = regulatoryTermsRequestActionTaskRecord;
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

