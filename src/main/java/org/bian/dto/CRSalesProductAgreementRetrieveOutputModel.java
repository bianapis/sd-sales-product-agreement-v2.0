package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceAnalysis;
import org.bian.dto.CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceRecord;
import org.bian.dto.CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRetrieveOutputModel
 */
public class CRSalesProductAgreementRetrieveOutputModel   {
  private CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementRetrieveActionTaskReference = null;

  private Object salesProductAgreementRetrieveActionTaskRecord = null;

  private String salesProductAgreementRetrieveActionResponse = null;

  private CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceReportRecord salesProductAgreementInstanceReportRecord = null;

  private CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceAnalysis salesProductAgreementInstanceAnalysis = null;


  /**
   * Get salesProductAgreementInstanceRecord
   * @return salesProductAgreementInstanceRecord
  **/

  public CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceRecord getSalesProductAgreementInstanceRecord() {
    return salesProductAgreementInstanceRecord;
  }

  public void setSalesProductAgreementInstanceRecord(CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord) {
    this.salesProductAgreementInstanceRecord = salesProductAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales Product Agreement instance retrieve service call 
   * @return salesProductAgreementRetrieveActionTaskReference
  **/

  public String getSalesProductAgreementRetrieveActionTaskReference() {
    return salesProductAgreementRetrieveActionTaskReference;
  }

  public void setSalesProductAgreementRetrieveActionTaskReference(String salesProductAgreementRetrieveActionTaskReference) {
    this.salesProductAgreementRetrieveActionTaskReference = salesProductAgreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return salesProductAgreementRetrieveActionTaskRecord
  **/

  public Object getSalesProductAgreementRetrieveActionTaskRecord() {
    return salesProductAgreementRetrieveActionTaskRecord;
  }

  public void setSalesProductAgreementRetrieveActionTaskRecord(Object salesProductAgreementRetrieveActionTaskRecord) {
    this.salesProductAgreementRetrieveActionTaskRecord = salesProductAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return salesProductAgreementRetrieveActionResponse
  **/

  public String getSalesProductAgreementRetrieveActionResponse() {
    return salesProductAgreementRetrieveActionResponse;
  }

  public void setSalesProductAgreementRetrieveActionResponse(String salesProductAgreementRetrieveActionResponse) {
    this.salesProductAgreementRetrieveActionResponse = salesProductAgreementRetrieveActionResponse;
  }


  /**
   * Get salesProductAgreementInstanceReportRecord
   * @return salesProductAgreementInstanceReportRecord
  **/

  public CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceReportRecord getSalesProductAgreementInstanceReportRecord() {
    return salesProductAgreementInstanceReportRecord;
  }

  public void setSalesProductAgreementInstanceReportRecord(CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceReportRecord salesProductAgreementInstanceReportRecord) {
    this.salesProductAgreementInstanceReportRecord = salesProductAgreementInstanceReportRecord;
  }


  /**
   * Get salesProductAgreementInstanceAnalysis
   * @return salesProductAgreementInstanceAnalysis
  **/

  public CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceAnalysis getSalesProductAgreementInstanceAnalysis() {
    return salesProductAgreementInstanceAnalysis;
  }

  public void setSalesProductAgreementInstanceAnalysis(CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceAnalysis salesProductAgreementInstanceAnalysis) {
    this.salesProductAgreementInstanceAnalysis = salesProductAgreementInstanceAnalysis;
  }


}

