package codeexchange.model;

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
public class TransacaoModel {

    @Id
    private Long idTransacao;
    private double cotacao;
    private String moedaOrigem;
    private double valorOrigem;
    private String moedaDestino;
    private double valorDestino;
}
