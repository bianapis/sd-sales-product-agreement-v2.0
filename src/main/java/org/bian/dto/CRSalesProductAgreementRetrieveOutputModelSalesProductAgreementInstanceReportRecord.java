package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceReportRecord
 */
public class CRSalesProductAgreementRetrieveOutputModelSalesProductAgreementInstanceReportRecord   {
  private String salesProductAgreementInstanceReportData = null;

  private String salesProductAgreementInstanceReportType = null;

  private Object salesProductAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return salesProductAgreementInstanceReportData
  **/

  public String getSalesProductAgreementInstanceReportData() {
    return salesProductAgreementInstanceReportData;
  }

  public void setSalesProductAgreementInstanceReportData(String salesProductAgreementInstanceReportData) {
    this.salesProductAgreementInstanceReportData = salesProductAgreementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return salesProductAgreementInstanceReport
  **/

  public Object getSalesProductAgreementInstanceReport() {
    return salesProductAgreementInstanceReport;
  }

  public void setSalesProductAgreementInstanceReport(Object salesProductAgreementInstanceReport) {
    this.salesProductAgreementInstanceReport = salesProductAgreementInstanceReport;
  }


}

