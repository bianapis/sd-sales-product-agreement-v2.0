package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementExchangeOutputModel
 */
public class CRSalesProductAgreementExchangeOutputModel   {
  private String salesProductAgreementExchangeActionTaskReference = null;

  private Object salesProductAgreementExchangeActionTaskRecord = null;

  private String salesProductAgreementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales Product Agreement instance exchange service call 
   * @return salesProductAgreementExchangeActionTaskReference
  **/

  public String getSalesProductAgreementExchangeActionTaskReference() {
    return salesProductAgreementExchangeActionTaskReference;
  }

  public void setSalesProductAgreementExchangeActionTaskReference(String salesProductAgreementExchangeActionTaskReference) {
    this.salesProductAgreementExchangeActionTaskReference = salesProductAgreementExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return salesProductAgreementExchangeActionResponse
  **/

  public String getSalesProductAgreementExchangeActionResponse() {
    return salesProductAgreementExchangeActionResponse;
  }

  public void setSalesProductAgreementExchangeActionResponse(String salesProductAgreementExchangeActionResponse) {
    this.salesProductAgreementExchangeActionResponse = salesProductAgreementExchangeActionResponse;
  }


}

