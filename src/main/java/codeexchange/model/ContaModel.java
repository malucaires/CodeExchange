package codeexchange.model;

import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaModel {

    private Long idConta;
    private Long idCliente;
    private int contaNumero;
    private int contaAgencia;
    private Boolean status;
    @Embedded
    private SaldoModel saldo;

}
