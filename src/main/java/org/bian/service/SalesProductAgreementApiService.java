/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SalesProductAgreementApiService {

	SDSalesProductAgreementActivateOutputModel activate(SDSalesProductAgreementActivateInputModel request);
	
	SDSalesProductAgreementConfigureOutputModel configure(String sdReferenceId, SDSalesProductAgreementConfigureInputModel request);
	
	CRSalesProductAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRSalesProductAgreementControlInputModel request);
	
	CRSalesProductAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRSalesProductAgreementEvaluateInputModel request);
	
	BQLegalTermsEvaluateOutputModel evaluateLegalterms(String sdReferenceId, String crReferenceId, BQLegalTermsEvaluateInputModel request);
	
	BQPolicyTermsEvaluateOutputModel evaluatePolicyterms(String sdReferenceId, String crReferenceId, BQPolicyTermsEvaluateInputModel request);
	
	BQRegulatoryTermsEvaluateOutputModel evaluateRegulatoryterms(String sdReferenceId, String crReferenceId, BQRegulatoryTermsEvaluateInputModel request);
	
	CRSalesProductAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSalesProductAgreementExchangeInputModel request);
	
	SDSalesProductAgreementFeedbackOutputModel feedback(String sdReferenceId, SDSalesProductAgreementFeedbackInputModel request);
	
	CRSalesProductAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRSalesProductAgreementGrantInputModel request);
	
	BQLegalTermsRequestOutputModel requestLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsRequestInputModel request);
	
	BQPolicyTermsRequestOutputModel requestPolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsRequestInputModel request);
	
	BQRegulatoryTermsRequestOutputModel requestRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsRequestInputModel request);
	
	CRSalesProductAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSalesProductAgreementRequestInputModel request);
	
	SDSalesProductAgreementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSalesProductAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQLegalTermsRetrieveOutputModel retrieveLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPolicyTermsRetrieveOutputModel retrievePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQRegulatoryTermsRetrieveOutputModel retrieveRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRSalesProductAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSalesProductAgreementUpdateInputModel request);
	
	BQLegalTermsUpdateOutputModel updateLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsUpdateInputModel request);
	
	BQPolicyTermsUpdateOutputModel updatePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsUpdateInputModel request);
	
	BQRegulatoryTermsUpdateOutputModel updateRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsUpdateInputModel request);
	
}
