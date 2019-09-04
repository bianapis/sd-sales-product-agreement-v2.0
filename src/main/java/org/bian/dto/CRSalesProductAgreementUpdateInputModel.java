package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementUpdateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementUpdateInputModel
 */
public class CRSalesProductAgreementUpdateInputModel   {
  private String salesProductAgreementServicingSessionReference = null;

  private String salesProductAgreementInstanceReference = null;

  private CRSalesProductAgreementUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private Object salesProductAgreementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRSalesProductAgreementUpdateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(CRSalesProductAgreementUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
    this.salesProductAgreementInstanceRecord = salesProductAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return salesProductAgreementUpdateActionTaskRecord
  **/

  public Object getSalesProductAgreementUpdateActionTaskRecord() {
    return salesProductAgreementUpdateActionTaskRecord;
  }

  public void setSalesProductAgreementUpdateActionTaskRecord(Object salesProductAgreementUpdateActionTaskRecord) {
    this.salesProductAgreementUpdateActionTaskRecord = salesProductAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

