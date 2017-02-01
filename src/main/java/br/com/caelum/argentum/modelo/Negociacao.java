package main.java.br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {
    private final double preco;
    private final int quantidade;
    private final Calendar data;

    public Negociacao(double preco, int quantidade, Calendar data) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Retornando uma coṕia do objeto, assegurando-se que o original permanece intacto.
    public Calendar getData() {
        return (Calendar) this.data.clone();
    }

    public double getVolume(){
        return preco * quantidade;
    }
}
