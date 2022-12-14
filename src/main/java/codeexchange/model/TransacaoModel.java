package codeexchange.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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

    @Id @GeneratedValue
    private Long idTransacao;
    private Long idContaTransacao;
    private double cotacao;
    private String moedaOrigem;
    private double valorOrigem;
    private String moedaDestino;
    private double valorDestino;

}
