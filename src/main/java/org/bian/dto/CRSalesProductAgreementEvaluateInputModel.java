package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementEvaluateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementEvaluateInputModel
 */
public class CRSalesProductAgreementEvaluateInputModel   {
  private String salesProductAgreementServicingSessionReference = null;

  private Object salesProductAgreementEvaluateActionRecord = null;

  private String salesProductAgreementInstanceStatus = null;

  private CRSalesProductAgreementEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return salesProductAgreementEvaluateActionRecord
  **/

  public Object getSalesProductAgreementEvaluateActionRecord() {
    return salesProductAgreementEvaluateActionRecord;
  }

  public void setSalesProductAgreementEvaluateActionRecord(Object salesProductAgreementEvaluateActionRecord) {
    this.salesProductAgreementEvaluateActionRecord = salesProductAgreementEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Sales Product Agreement instance (e.g. initialised, pending, active) 
   * @return salesProductAgreementInstanceStatus
  **/

  public String getSalesProductAgreementInstanceStatus() {
    return salesProductAgreementInstanceStatus;
  }

  public void setSalesProductAgreementInstanceStatus(String salesProductAgreementInstanceStatus) {
    this.salesProductAgreementInstanceStatus = salesProductAgreementInstanceStatus;
  }


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public CRSalesProductAgreementEvaluateInputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(CRSalesProductAgreementEvaluateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
    this.salesProductAgreementInstanceRecord = salesProductAgreementInstanceRecord;
  }


}

