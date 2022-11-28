package codeexchange.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClienteModel {

    @Id @GeneratedValue
    private Long idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private LocalDate dataNascimento;
    private String telefone;

    @Override
    public String toString() {
        return "ClienteModel{" +
                "ID_Cliente=" + idCliente +
                ", Nome='" + nomeCliente + '\'' +
                ", CPF='" + cpfCliente + '\'' +
                ", Data de Nascimento=" + dataNascimento +
                ", Telefone='" + telefone + '\'' +
                '}';
    }
}
