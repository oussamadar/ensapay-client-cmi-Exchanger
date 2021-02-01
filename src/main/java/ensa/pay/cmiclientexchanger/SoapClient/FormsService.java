package ensa.pay.cmiclientexchanger.SoapClient;

import ensa.pay.cmiclientexchanger.soap.api.creancier.GetFormsRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetFormsResponse;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class FormsService {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetFormsResponse form(GetFormsRequest request){

        template= new WebServiceTemplate(marshaller);
        GetFormsResponse response = (GetFormsResponse) template.marshalSendAndReceive("https://ensaspay-zuul-gateway.herokuapp.com/soapWS",request);
        return response;

    }
}
