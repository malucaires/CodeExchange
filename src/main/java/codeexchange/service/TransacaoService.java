package codeexchange.service;

import codeexchange.model.ContaModel;
import codeexchange.model.Cotacao;
import codeexchange.model.TransacaoModel;
import codeexchange.repository.ContaRepository;
import codeexchange.repository.TransacaoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;
    @Autowired
    private ContaRepository contaRepository;

    public TransacaoModel create (@NotNull TransacaoModel transacao){
        ContaModel conta = contaRepository.findById(transacao.getIdContaTransacao()).get();

        if (conta.getStatus() == false){
            System.out.println("Conta inativa. Operação não realizada");
            return null;
        }

        double cotacao = 0.0;

        String moedaOrigem = transacao.getMoedaOrigem();
        String moedaDestino = transacao.getMoedaDestino();

        if (moedaOrigem.equals("REAL")){
            if (moedaDestino.equals("DOLAR")){
                cotacao = Cotacao.REALDOLAR.getValor();
            } else if (moedaDestino.equals("EURO")){
                cotacao = Cotacao.REALEURO.getValor();
            } else {
                System.out.println("Moeda de Destino inválida.");
                return null;
            }
        } else if (moedaOrigem.equals("DOLAR")) {
            if (moedaDestino.equals("REAL")) {
                cotacao = Cotacao.DOLARREAL.getValor();
            } else if (moedaDestino.equals("EURO")) {
                cotacao = Cotacao.DOLAREURO.getValor();
            } else {
                System.out.println("Moeda de Destino inválida.");
                return null;
            }
        } else if (moedaOrigem.equals("EURO")) {
            if (moedaDestino.equals("REAL")) {
                cotacao = Cotacao.EUROREAL.getValor();
            } else if (moedaDestino.equals("DOLAR")) {
                cotacao = Cotacao.EURODOLAR.getValor();
            } else {
                System.out.println("Moeda de Destino inválida.");
                return null;
            }
        } else {
            System.out.println("Moeda de Origem inválida.");
            return null;
        }

        transacao.setCotacao(cotacao);

        double valorDestino = transacao.getValorOrigem() * transacao.getCotacao();
        transacao.setValorDestino(valorDestino);

        double novoSaldoOrigem = 0.0;
        double novoSaldoDestino = 0.0;

        switch (moedaOrigem) {
            case "REAL":
                novoSaldoOrigem = conta.getSaldo().getSaldoReal() - transacao.getValorOrigem();
                if (novoSaldoOrigem >= 0){
                    switch (moedaDestino){
                        case "EURO":
                            novoSaldoDestino = conta.getSaldo().getSaldoEuro() + transacao.getValorDestino();
                            conta.getSaldo().setSaldoReal(novoSaldoOrigem);
                            conta.getSaldo().setSaldoEuro(novoSaldoDestino);
                            break;
                        case "DOLAR":
                            novoSaldoDestino = conta.getSaldo().getSaldoDolar() + transacao.getValorDestino();
                            conta.getSaldo().setSaldoReal(novoSaldoOrigem);
                            conta.getSaldo().setSaldoDolar(novoSaldoDestino);
                            break;
                        default:
                            System.out.println("Moeda de Destino inválida.");
                            return null;
                    }
                } else {
                    System.out.println("Saldo insuficiente. Operação não realizada.");
                    return null;
                }
                break;
            case "DOLAR":
                novoSaldoOrigem = conta.getSaldo().getSaldoDolar() - transacao.getValorOrigem();
                if (novoSaldoOrigem >= 0) {
                    switch (moedaDestino) {
                        case "REAL":
                            novoSaldoDestino = conta.getSaldo().getSaldoReal() + transacao.getValorDestino();
                            conta.getSaldo().setSaldoDolar(novoSaldoOrigem);
                            conta.getSaldo().setSaldoReal(novoSaldoDestino);
                            break;
                        case "EURO":
                            novoSaldoDestino = conta.getSaldo().getSaldoEuro() + transacao.getValorDestino();
                            conta.getSaldo().setSaldoDolar(novoSaldoOrigem);
                            conta.getSaldo().setSaldoEuro(novoSaldoDestino);
                            break;
                        default:
                            System.out.println("Moeda de Destino inválida.");
                            return null;
                    }
                } else {
                    System.out.println("Saldo insuficiente. Operação não realizada.");
                    return null;
                }
                break;
            case "EURO":
                novoSaldoOrigem = conta.getSaldo().getSaldoEuro() - transacao.getValorOrigem();
                if (novoSaldoOrigem >= 0) {
                    switch (moedaDestino){
                        case "REAL":
                            novoSaldoDestino = conta.getSaldo().getSaldoReal() + transacao.getValorDestino();
                            conta.getSaldo().setSaldoEuro(novoSaldoOrigem);
                            conta.getSaldo().setSaldoReal(novoSaldoDestino);
                            break;
                        case "DOLAR":
                            novoSaldoDestino = conta.getSaldo().getSaldoDolar() + transacao.getValorDestino();
                            conta.getSaldo().setSaldoEuro(novoSaldoOrigem);
                            conta.getSaldo().setSaldoDolar(novoSaldoDestino);
                            break;
                        default:
                            System.out.println("Moeda de Destino inválida.");
                            return null;
                    }
                } else {
                    System.out.println("Saldo insuficiente. Operação não realizada.");
                    return null;
                }
                break;
            default:
                System.out.println("Moeda de Origem inválida.");
        }

        System.out.println(conta.getSaldo());

        return transacaoRepository.save(transacao);
    }

    public List<TransacaoModel> list(){
        return transacaoRepository.findAll();
    }

    public void delete (Long id){
        transacaoRepository.deleteById(id);
    }

}
