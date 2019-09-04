package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceAnalysis
 */
public class CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceAnalysis   {
  private String salesProductAgreementInstanceAnalysisData = null;

  private String salesProductAgreementInstanceAnalysisReportType = null;

  private Object salesProductAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return salesProductAgreementInstanceAnalysisData
  **/

  public String getSalesProductAgreementInstanceAnalysisData() {
    return salesProductAgreementInstanceAnalysisData;
  }

  public void setSalesProductAgreementInstanceAnalysisData(String salesProductAgreementInstanceAnalysisData) {
    this.salesProductAgreementInstanceAnalysisData = salesProductAgreementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return salesProductAgreementInstanceAnalysisReportType
  **/

  public String getSalesProductAgreementInstanceAnalysisReportType() {
    return salesProductAgreementInstanceAnalysisReportType;
  }

  public void setSalesProductAgreementInstanceAnalysisReportType(String salesProductAgreementInstanceAnalysisReportType) {
    this.salesProductAgreementInstanceAnalysisReportType = salesProductAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return salesProductAgreementInstanceAnalysisReport
  **/

  public Object getSalesProductAgreementInstanceAnalysisReport() {
    return salesProductAgreementInstanceAnalysisReport;
  }

  public void setSalesProductAgreementInstanceAnalysisReport(Object salesProductAgreementInstanceAnalysisReport) {
    this.salesProductAgreementInstanceAnalysisReport = salesProductAgreementInstanceAnalysisReport;
  }


}

