package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesProductAgreementUpdateInputModelSalesProductAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesProductAgreementUpdateOutputModel
 */
public class CRSalesProductAgreementUpdateOutputModel   {
  private CRSalesProductAgreementUpdateInputModelSalesProductAgreementInstanceRecord salesProductAgreementInstanceRecord = null;

  private String salesProductAgreementUpdateActionTaskReference = null;

  private Object salesProductAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return salesProductAgreementUpdateActionTaskReference
  **/

  public String getSalesProductAgreementUpdateActionTaskReference() {
    return salesProductAgreementUpdateActionTaskReference;
  }

  public void setSalesProductAgreementUpdateActionTaskReference(String salesProductAgreementUpdateActionTaskReference) {
    this.salesProductAgreementUpdateActionTaskReference = salesProductAgreementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

