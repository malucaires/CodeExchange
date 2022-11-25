package codeexchange.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ClienteModel {

    private Long idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private LocalDate dataNascimento;
    private String telefone;

}
