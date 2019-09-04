/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SalesProductAgreementApiServiceImpl implements SalesProductAgreementApiService {

	public SDSalesProductAgreementActivateOutputModel activate(SDSalesProductAgreementActivateInputModel request){
		return JsonReader.read("activate-SDSalesProductAgreementActivateOutputModel.json",new TypeReference<SDSalesProductAgreementActivateOutputModel>(){});
	}
	
	public SDSalesProductAgreementConfigureOutputModel configure(String sdReferenceId, SDSalesProductAgreementConfigureInputModel request){
		return JsonReader.read("configure-SDSalesProductAgreementConfigureOutputModel.json",new TypeReference<SDSalesProductAgreementConfigureOutputModel>(){});
	}
	
	public CRSalesProductAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRSalesProductAgreementControlInputModel request){
		return JsonReader.read("control-CRSalesProductAgreementControlOutputModel.json",new TypeReference<CRSalesProductAgreementControlOutputModel>(){});
	}
	
	public CRSalesProductAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRSalesProductAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRSalesProductAgreementEvaluateOutputModel.json",new TypeReference<CRSalesProductAgreementEvaluateOutputModel>(){});
	}
	
	public BQLegalTermsEvaluateOutputModel evaluateLegalterms(String sdReferenceId, String crReferenceId, BQLegalTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQLegalTermsEvaluateOutputModel.json",new TypeReference<BQLegalTermsEvaluateOutputModel>(){});
	}
	
	public BQPolicyTermsEvaluateOutputModel evaluatePolicyterms(String sdReferenceId, String crReferenceId, BQPolicyTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPolicyTermsEvaluateOutputModel.json",new TypeReference<BQPolicyTermsEvaluateOutputModel>(){});
	}
	
	public BQRegulatoryTermsEvaluateOutputModel evaluateRegulatoryterms(String sdReferenceId, String crReferenceId, BQRegulatoryTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQRegulatoryTermsEvaluateOutputModel.json",new TypeReference<BQRegulatoryTermsEvaluateOutputModel>(){});
	}
	
	public CRSalesProductAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSalesProductAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CRSalesProductAgreementExchangeOutputModel.json",new TypeReference<CRSalesProductAgreementExchangeOutputModel>(){});
	}
	
	public SDSalesProductAgreementFeedbackOutputModel feedback(String sdReferenceId, SDSalesProductAgreementFeedbackInputModel request){
		return JsonReader.read("feedback-SDSalesProductAgreementFeedbackOutputModel.json",new TypeReference<SDSalesProductAgreementFeedbackOutputModel>(){});
	}
	
	public CRSalesProductAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRSalesProductAgreementGrantInputModel request){
		return JsonReader.read("grant-CRSalesProductAgreementGrantOutputModel.json",new TypeReference<CRSalesProductAgreementGrantOutputModel>(){});
	}
	
	public BQLegalTermsRequestOutputModel requestLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsRequestInputModel request){
		return JsonReader.read("request-BQLegalTermsRequestOutputModel.json",new TypeReference<BQLegalTermsRequestOutputModel>(){});
	}
	
	public BQPolicyTermsRequestOutputModel requestPolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsRequestInputModel request){
		return JsonReader.read("request-BQPolicyTermsRequestOutputModel.json",new TypeReference<BQPolicyTermsRequestOutputModel>(){});
	}
	
	public BQRegulatoryTermsRequestOutputModel requestRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsRequestInputModel request){
		return JsonReader.read("request-BQRegulatoryTermsRequestOutputModel.json",new TypeReference<BQRegulatoryTermsRequestOutputModel>(){});
	}
	
	public CRSalesProductAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSalesProductAgreementRequestInputModel request){
		return JsonReader.read("request-CRSalesProductAgreementRequestOutputModel.json",new TypeReference<CRSalesProductAgreementRequestOutputModel>(){});
	}
	
	public SDSalesProductAgreementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSalesProductAgreementRetrieveOutputModel.json",new TypeReference<SDSalesProductAgreementRetrieveOutputModel>(){});
	}
	
	public CRSalesProductAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSalesProductAgreementRetrieveOutputModel.json",new TypeReference<CRSalesProductAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQLegalTermsRetrieveOutputModel retrieveLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLegalTermsRetrieveOutputModel.json",new TypeReference<BQLegalTermsRetrieveOutputModel>(){});
	}
	
	public BQPolicyTermsRetrieveOutputModel retrievePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPolicyTermsRetrieveOutputModel.json",new TypeReference<BQPolicyTermsRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQRegulatoryTermsRetrieveOutputModel retrieveRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRegulatoryTermsRetrieveOutputModel.json",new TypeReference<BQRegulatoryTermsRetrieveOutputModel>(){});
	}
	
	public CRSalesProductAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSalesProductAgreementUpdateInputModel request){
		return JsonReader.read("update-CRSalesProductAgreementUpdateOutputModel.json",new TypeReference<CRSalesProductAgreementUpdateOutputModel>(){});
	}
	
	public BQLegalTermsUpdateOutputModel updateLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsUpdateInputModel request){
		return JsonReader.read("update-BQLegalTermsUpdateOutputModel.json",new TypeReference<BQLegalTermsUpdateOutputModel>(){});
	}
	
	public BQPolicyTermsUpdateOutputModel updatePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsUpdateInputModel request){
		return JsonReader.read("update-BQPolicyTermsUpdateOutputModel.json",new TypeReference<BQPolicyTermsUpdateOutputModel>(){});
	}
	
	public BQRegulatoryTermsUpdateOutputModel updateRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsUpdateInputModel request){
		return JsonReader.read("update-BQRegulatoryTermsUpdateOutputModel.json",new TypeReference<BQRegulatoryTermsUpdateOutputModel>(){});
	}
	
}
