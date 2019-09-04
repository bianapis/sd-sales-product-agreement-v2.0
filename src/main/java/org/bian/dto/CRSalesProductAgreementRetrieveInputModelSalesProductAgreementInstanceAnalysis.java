package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceAnalysis
 */
public class CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceAnalysis   {
  private String salesProductAgreementInstanceAnalysisReference = null;

  private String salesProductAgreementInstanceAnalysisReportType = null;

  private String salesProductAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return salesProductAgreementInstanceAnalysisReference
  **/

  public String getSalesProductAgreementInstanceAnalysisReference() {
    return salesProductAgreementInstanceAnalysisReference;
  }

  public void setSalesProductAgreementInstanceAnalysisReference(String salesProductAgreementInstanceAnalysisReference) {
    this.salesProductAgreementInstanceAnalysisReference = salesProductAgreementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return salesProductAgreementInstanceAnalysisParameters
  **/

  public String getSalesProductAgreementInstanceAnalysisParameters() {
    return salesProductAgreementInstanceAnalysisParameters;
  }

  public void setSalesProductAgreementInstanceAnalysisParameters(String salesProductAgreementInstanceAnalysisParameters) {
    this.salesProductAgreementInstanceAnalysisParameters = salesProductAgreementInstanceAnalysisParameters;
  }


}

