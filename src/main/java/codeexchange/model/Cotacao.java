package codeexchange.model;

public enum Cotacao {

    REALDOLAR(0.18),
    REALEURO(0.18),
    DOLARREAL(5.41),
    DOLAREURO(0.96),
    EUROREAL(5.63),
    EURODOLAR(1.04);

    private double descricao;
    Cotacao (double descricao) {
        this.descricao=descricao;
    }

    public double getDescricao(){
        return descricao;
    }

}
