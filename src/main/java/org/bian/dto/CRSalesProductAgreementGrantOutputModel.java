package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementGrantOutputModel
 */
public class CRSalesProductAgreementGrantOutputModel   {
  private String salesProductAgreementGrantActionTaskReference = null;

  private Object salesProductAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRSalesProductAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales Product Agreement instance grant service call 
   * @return salesProductAgreementGrantActionTaskReference
  **/

  public String getSalesProductAgreementGrantActionTaskReference() {
    return salesProductAgreementGrantActionTaskReference;
  }

  public void setSalesProductAgreementGrantActionTaskReference(String salesProductAgreementGrantActionTaskReference) {
    this.salesProductAgreementGrantActionTaskReference = salesProductAgreementGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return salesProductAgreementGrantActionTaskRecord
  **/

  public Object getSalesProductAgreementGrantActionTaskRecord() {
    return salesProductAgreementGrantActionTaskRecord;
  }

  public void setSalesProductAgreementGrantActionTaskRecord(Object salesProductAgreementGrantActionTaskRecord) {
    this.salesProductAgreementGrantActionTaskRecord = salesProductAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRSalesProductAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRSalesProductAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

