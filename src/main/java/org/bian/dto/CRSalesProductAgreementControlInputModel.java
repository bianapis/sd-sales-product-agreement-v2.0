package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementControlInputModelSalesProductAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementControlInputModel
 */
public class CRSalesProductAgreementControlInputModel   {
  private String salesProductAgreementServicingSessionReference = null;

  private String salesProductAgreementInstanceReference = null;

  private Object salesProductAgreementControlActionTaskRecord = null;

  private CRSalesProductAgreementControlInputModelSalesProductAgreementControlActionRequest salesProductAgreementControlActionRequest = null;


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
   * Get salesProductAgreementControlActionRequest
   * @return salesProductAgreementControlActionRequest
  **/

  public CRSalesProductAgreementControlInputModelSalesProductAgreementControlActionRequest getSalesProductAgreementControlActionRequest() {
    return salesProductAgreementControlActionRequest;
  }

  public void setSalesProductAgreementControlActionRequest(CRSalesProductAgreementControlInputModelSalesProductAgreementControlActionRequest salesProductAgreementControlActionRequest) {
    this.salesProductAgreementControlActionRequest = salesProductAgreementControlActionRequest;
  }


}

