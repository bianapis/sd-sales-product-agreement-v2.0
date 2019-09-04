package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementExchangeInputModelSalesProductAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementExchangeInputModel
 */
public class CRSalesProductAgreementExchangeInputModel   {
  private String salesProductAgreementServicingSessionReference = null;

  private String salesProductAgreementInstanceReference = null;

  private Object salesProductAgreementExchangeActionTaskRecord = null;

  private CRSalesProductAgreementExchangeInputModelSalesProductAgreementExchangeActionRequest salesProductAgreementExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return salesProductAgreementExchangeActionTaskRecord
  **/

  public Object getSalesProductAgreementExchangeActionTaskRecord() {
    return salesProductAgreementExchangeActionTaskRecord;
  }

  public void setSalesProductAgreementExchangeActionTaskRecord(Object salesProductAgreementExchangeActionTaskRecord) {
    this.salesProductAgreementExchangeActionTaskRecord = salesProductAgreementExchangeActionTaskRecord;
  }


  /**
   * Get salesProductAgreementExchangeActionRequest
   * @return salesProductAgreementExchangeActionRequest
  **/

  public CRSalesProductAgreementExchangeInputModelSalesProductAgreementExchangeActionRequest getSalesProductAgreementExchangeActionRequest() {
    return salesProductAgreementExchangeActionRequest;
  }

  public void setSalesProductAgreementExchangeActionRequest(CRSalesProductAgreementExchangeInputModelSalesProductAgreementExchangeActionRequest salesProductAgreementExchangeActionRequest) {
    this.salesProductAgreementExchangeActionRequest = salesProductAgreementExchangeActionRequest;
  }


}

