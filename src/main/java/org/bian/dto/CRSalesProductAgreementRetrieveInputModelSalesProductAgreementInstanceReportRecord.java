package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceReportRecord
 */
public class CRSalesProductAgreementRetrieveInputModelSalesProductAgreementInstanceReportRecord   {
  private String salesProductAgreementInstanceReportReference = null;

  private String salesProductAgreementInstanceReportType = null;

  private String salesProductAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return salesProductAgreementInstanceReportReference
  **/

  public String getSalesProductAgreementInstanceReportReference() {
    return salesProductAgreementInstanceReportReference;
  }

  public void setSalesProductAgreementInstanceReportReference(String salesProductAgreementInstanceReportReference) {
    this.salesProductAgreementInstanceReportReference = salesProductAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return salesProductAgreementInstanceReportType
  **/

  public String getSalesProductAgreementInstanceReportType() {
    return salesProductAgreementInstanceReportType;
  }

  public void setSalesProductAgreementInstanceReportType(String salesProductAgreementInstanceReportType) {
    this.salesProductAgreementInstanceReportType = salesProductAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return salesProductAgreementInstanceReportParameters
  **/

  public String getSalesProductAgreementInstanceReportParameters() {
    return salesProductAgreementInstanceReportParameters;
  }

  public void setSalesProductAgreementInstanceReportParameters(String salesProductAgreementInstanceReportParameters) {
    this.salesProductAgreementInstanceReportParameters = salesProductAgreementInstanceReportParameters;
  }


}

