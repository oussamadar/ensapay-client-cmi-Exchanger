package ensa.pay.cmiclientexchanger.Controllers;

import ensa.pay.cmiclientexchanger.SoapClient.BillService;
import ensa.pay.cmiclientexchanger.soap.api.creancier.ClientPaymentInfo;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetBillsRequest;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetFormsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bills")
public class BillsController {
    @Autowired
    private BillService billService;

    @GetMapping("/{creancier}/{codeCreance}/{genericId}")
    public ClientPaymentInfo clientWithBills(@PathVariable String creancier,@PathVariable String codeCreance,@PathVariable String genericId){
        GetBillsRequest request = new GetBillsRequest();
        request.setCreancier(creancier);
        request.setCodeCreance(codeCreance);
        request.setGenericId(genericId);
        return billService.bills(request).getClientPaymntInfo();
    }
}
