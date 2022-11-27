package codeexchange.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ContaModel {

    @Id
    private Long idConta;
    private Long idCliente;
    private int contaNumero;
    private int contaAgencia;
    private Boolean status;
    @Embedded
    private SaldoModel saldo;

}
