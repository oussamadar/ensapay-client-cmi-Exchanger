package ensa.pay.cmiclientexchanger.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Creance {
    private String id;
    private String nameCreance;
    private String codeCreance;
    private String endPoint;
}
