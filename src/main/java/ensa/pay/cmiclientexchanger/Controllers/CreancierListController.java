package ensa.pay.cmiclientexchanger.Controllers;

import ensa.pay.cmiclientexchanger.SoapClient.ListCreanceService;
import ensa.pay.cmiclientexchanger.entities.Creancier;
import ensa.pay.cmiclientexchanger.soap.api.creancier.CreancierInfo;
import ensa.pay.cmiclientexchanger.soap.api.creancier.GetListCreanciersRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("creancier")
public class CreancierListController {
    @Autowired
    ListCreanceService listCreanceService;

    @GetMapping("/listCreanciers")
    public List<CreancierInfo> getListCreanciers(){
        GetListCreanciersRequest request = new GetListCreanciersRequest();
        return  listCreanceService.
                listOfCreanciers(request).getListCreanciers();
    }
}
