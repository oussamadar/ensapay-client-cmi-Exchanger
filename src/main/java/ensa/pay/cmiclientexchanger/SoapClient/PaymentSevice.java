package ensa.pay.cmiclientexchanger.SoapClient;

import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersResponse;
import ensa.pay.cmiclientexchanger.soap.api.creancier.PaymentRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class PaymentSevice {
    @Autowired
    private Jaxb2Marshaller marshaller;
    private WebServiceTemplate template;

    public PaymentResponse payment(PaymentRequest request) {
        template = new WebServiceTemplate(marshaller);
        PaymentResponse response = (PaymentResponse) template.marshalSendAndReceive("https://ensaspay-zuul-gateway.herokuapp.com/soapWS", request);
        return response;

    }
}
