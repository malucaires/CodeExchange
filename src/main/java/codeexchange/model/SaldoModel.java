package codeexchange.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class SaldoModel {

    private double saldoReal;
    private double saldoDolar;
    private double saldoEuro;
}
