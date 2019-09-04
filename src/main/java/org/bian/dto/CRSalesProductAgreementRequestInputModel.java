package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementRequestInputModelRequestRecordType;
import org.bian.dto.CRSalesProductAgreementRequestInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRequestInputModel
 */
public class CRSalesProductAgreementRequestInputModel   {
  private String salesProductAgreementServicingSessionReference = null;

  private String salesProductAgreementInstanceReference = null;

  private CRSalesProductAgreementRequestInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private Object salesProductAgreementRequestActionTaskRecord = null;

  private CRSalesProductAgreementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return salesProductAgreementServicingSessionReference
  **/

  public String getSalesProductAgreementServicingSessionReference() {
    return salesProductAgreementServicingSessionReference;
  }

  public void setSalesProductAgreementServicingSessionReference(String salesProductAgreementServicingSessionReference) {
    this.salesProductAgreementServicingSessionReference = salesProductAgreementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales Product Agreement instance 
   * @return salesProductAgreementInstanceReference
  **/

  public String getSalesProductAgreementInstanceReference() {
    return salesProductAgreementInstanceReference;
  }

  public void setSalesProductAgreementInstanceReference(String salesProductAgreementInstanceReference) {
    this.salesProductAgreementInstanceReference = salesProductAgreementInstanceReference;
  }


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public CRSalesProductAgreementRequestInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(CRSalesProductAgreementRequestInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
    this.salesProductAgreementInstanceRecord = salesProductAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return salesProductAgreementRequestActionTaskRecord
  **/

  public Object getSalesProductAgreementRequestActionTaskRecord() {
    return salesProductAgreementRequestActionTaskRecord;
  }

  public void setSalesProductAgreementRequestActionTaskRecord(Object salesProductAgreementRequestActionTaskRecord) {
    this.salesProductAgreementRequestActionTaskRecord = salesProductAgreementRequestActionTaskRecord;
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

