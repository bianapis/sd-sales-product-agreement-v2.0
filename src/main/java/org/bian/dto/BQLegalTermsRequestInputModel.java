package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsRequestInputModelLegalTermsInstanceRecord;
import org.bian.dto.CRSalesProductAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRequestInputModel
 */
public class BQLegalTermsRequestInputModel   {
  private String salesProductAgreementInstanceReference = null;

  private String legalTermsInstanceReference = null;

  private BQLegalTermsRequestInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;

  private Object legalTermsRequestActionTaskRecord = null;

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

  public BQLegalTermsRequestInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsRequestInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return legalTermsRequestActionTaskRecord
  **/

  public Object getLegalTermsRequestActionTaskRecord() {
    return legalTermsRequestActionTaskRecord;
  }

  public void setLegalTermsRequestActionTaskRecord(Object legalTermsRequestActionTaskRecord) {
    this.legalTermsRequestActionTaskRecord = legalTermsRequestActionTaskRecord;
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

