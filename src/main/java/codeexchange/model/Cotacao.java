package codeexchange.model;

public enum Cotacao {

    REALDOLAR(0.19),
    REALEURO(0.18),
    DOLARREAL(5.31),
    DOLAREURO(0.96),
    EUROREAL(5.51),
    EURODOLAR(1.04);

    private double valor;
    Cotacao (double valor) {
        this.valor=valor;
    }

    public double getValor(){
        return valor;
    }

}
