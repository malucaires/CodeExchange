package codeexchange.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoModel {
    private Long idTransacao;
    private double cotacao;
    private String moedaOrigem;
    private double valorOrigem;
    private String moedaDestino;
    private double valorDestino;
}
