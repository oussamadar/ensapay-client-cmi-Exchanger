package ensa.pay.cmiclientexchanger.Controllers;

import ensa.pay.cmiclientexchanger.SoapClient.FormsService;
import ensa.pay.cmiclientexchanger.soap.api.creancier.FormInfo;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetFormsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("forms")
public class FormController {
    @Autowired
    private FormsService formsService;

    @GetMapping("/{creancier}/{codeCreance}")
    public FormInfo getForm(@PathVariable String creancier , @PathVariable String codeCreance){
        GetFormsRequest request = new GetFormsRequest();
        request.setCodeCreance(codeCreance);
        request.setCreance(creancier);
        return formsService.form(request).getForm();
    }
}
