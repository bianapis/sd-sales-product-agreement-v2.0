package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementControlOutputModel
 */
public class CRSalesProductAgreementControlOutputModel   {
  private String salesProductAgreementControlActionTaskReference = null;

  private Object salesProductAgreementControlActionTaskRecord = null;

  private String salesProductAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales Product Agreement instance control processing service call 
   * @return salesProductAgreementControlActionTaskReference
  **/

  public String getSalesProductAgreementControlActionTaskReference() {
    return salesProductAgreementControlActionTaskReference;
  }

  public void setSalesProductAgreementControlActionTaskReference(String salesProductAgreementControlActionTaskReference) {
    this.salesProductAgreementControlActionTaskReference = salesProductAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return salesProductAgreementControlActionTaskRecord
  **/

  public Object getSalesProductAgreementControlActionTaskRecord() {
    return salesProductAgreementControlActionTaskRecord;
  }

  public void setSalesProductAgreementControlActionTaskRecord(Object salesProductAgreementControlActionTaskRecord) {
    this.salesProductAgreementControlActionTaskRecord = salesProductAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return salesProductAgreementControlActionResponse
  **/

  public String getSalesProductAgreementControlActionResponse() {
    return salesProductAgreementControlActionResponse;
  }

  public void setSalesProductAgreementControlActionResponse(String salesProductAgreementControlActionResponse) {
    this.salesProductAgreementControlActionResponse = salesProductAgreementControlActionResponse;
  }


}

