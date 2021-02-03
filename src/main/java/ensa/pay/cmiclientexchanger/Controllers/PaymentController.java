package ensa.pay.cmiclientexchanger.Controllers;

import ensa.pay.cmiclientexchanger.SoapClient.PaymentSevice;
import ensa.pay.cmiclientexchanger.soap.api.creancier.PaymentRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentSevice paymentSevice;

    @GetMapping("/{idBill}/{idAccount}/{idCreancier}")
    public String getPayer(@PathVariable Long idBill,@PathVariable String idAccount,@PathVariable String idCreancier){
        PaymentRequest request = new PaymentRequest();
        request.setAccountID(idAccount);
        request.setBillID(idBill);
        request.setCreancier(idCreancier);
        return paymentSevice.payment(request).getResponse();

    }
}
