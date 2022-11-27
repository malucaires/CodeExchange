package codeexchange.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
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

    @Id
    private Long idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private LocalDate dataNascimento;
    private String telefone;

}
