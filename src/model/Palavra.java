package model;

public class Palavra {
    public Palavra(String valor) {
        this.valor = valor;
    }

    String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}

