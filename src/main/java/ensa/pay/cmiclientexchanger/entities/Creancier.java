package ensa.pay.cmiclientexchanger.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Creancier {
    private String id ;
    private String nameCreancier;
    private String codeCreancier;
    private String categoryCreancier;
    private List<Creance> listCreance;

}
