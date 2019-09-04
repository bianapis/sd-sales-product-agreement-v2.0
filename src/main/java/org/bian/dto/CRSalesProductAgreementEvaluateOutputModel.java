package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementEvaluateOutputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementEvaluateOutputModel
 */
public class CRSalesProductAgreementEvaluateOutputModel   {
  private String salesProductAgreementInstanceReference = null;

  private String salesProductAgreementEvaluateActionReference = null;

  private Object salesProductAgreementEvaluateActionRecord = null;

  private String salesProductAgreementInstanceStatus = null;

  private CRSalesProductAgreementEvaluateOutputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return salesProductAgreementEvaluateActionReference
  **/

  public String getSalesProductAgreementEvaluateActionReference() {
    return salesProductAgreementEvaluateActionReference;
  }

  public void setSalesProductAgreementEvaluateActionReference(String salesProductAgreementEvaluateActionReference) {
    this.salesProductAgreementEvaluateActionReference = salesProductAgreementEvaluateActionReference;
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

  public CRSalesProductAgreementEvaluateOutputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(CRSalesProductAgreementEvaluateOutputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
    this.salesProductAgreementInstanceRecord = salesProductAgreementInstanceRecord;
  }


}

