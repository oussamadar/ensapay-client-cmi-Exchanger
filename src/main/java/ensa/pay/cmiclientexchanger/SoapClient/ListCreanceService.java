package ensa.pay.cmiclientexchanger.SoapClient;

import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.jws.WebService;

@Service
public class ListCreanceService {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetListCreanciersResponse listOfCreanciers(GetListCreanciersRequest request){
        template= new WebServiceTemplate(marshaller);
        GetListCreanciersResponse response = (GetListCreanciersResponse) template.marshalSendAndReceive("https://ensaspay-zuul-gateway.herokuapp.com/soapWS",request);
        return response;

    }
}
