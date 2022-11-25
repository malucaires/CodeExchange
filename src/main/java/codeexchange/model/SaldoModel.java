package codeexchange.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class SaldoModel {
    private double saldoReal;
    private double saldoDolar;
    private double saldoEuro;
}
