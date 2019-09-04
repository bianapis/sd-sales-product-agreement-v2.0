package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceAnalysis;
import org.bian.dto.CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRetrieveInputModel
 */
public class CRSalesProductAgreementRetrieveInputModel   {
  private Object salesProductAgreementRetrieveActionTaskRecord = null;

  private String salesProductAgreementRetrieveActionRequest = null;

  private CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceReportRecord salesProductAgreementInstanceReportRecord = null;

  private CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceAnalysis salesProductAgreementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return salesProductAgreementRetrieveActionRequest
  **/

  public String getSalesProductAgreementRetrieveActionRequest() {
    return salesProductAgreementRetrieveActionRequest;
  }

  public void setSalesProductAgreementRetrieveActionRequest(String salesProductAgreementRetrieveActionRequest) {
    this.salesProductAgreementRetrieveActionRequest = salesProductAgreementRetrieveActionRequest;
  }


  /**
   * Get salesProductAgreementInstanceReportRecord
   * @return salesProductAgreementInstanceReportRecord
  **/

  public CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceReportRecord getSalesProductAgreementInstanceReportRecord() {
    return salesProductAgreementInstanceReportRecord;
  }

  public void setSalesProductAgreementInstanceReportRecord(CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceReportRecord salesProductAgreementInstanceReportRecord) {
    this.salesProductAgreementInstanceReportRecord = salesProductAgreementInstanceReportRecord;
  }


  /**
   * Get salesProductAgreementInstanceAnalysis
   * @return salesProductAgreementInstanceAnalysis
  **/

  public CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceAnalysis getSalesProductAgreementInstanceAnalysis() {
    return salesProductAgreementInstanceAnalysis;
  }

  public void setSalesProductAgreementInstanceAnalysis(CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceAnalysis salesProductAgreementInstanceAnalysis) {
    this.salesProductAgreementInstanceAnalysis = salesProductAgreementInstanceAnalysis;
  }


}

