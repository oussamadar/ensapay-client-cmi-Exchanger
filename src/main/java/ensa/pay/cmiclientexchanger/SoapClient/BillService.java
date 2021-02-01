package ensa.pay.cmiclientexchanger.SoapClient;

import ensa.pay.cmiclientexchanger.soap.api.creancier.GetBillsRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetBillsResponse;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetFormsRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetFormsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
@Service
public class BillService {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetBillsResponse bills(GetBillsRequest request){

        template= new WebServiceTemplate(marshaller);
        GetBillsResponse response = (GetBillsResponse) template.marshalSendAndReceive("https://ensaspay-zuul-gateway.herokuapp.com/soapWS",request);
        return response;

    }
}
