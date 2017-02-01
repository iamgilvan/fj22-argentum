package main.java.br.com.caelum.argentum.testes;

import main.java.br.com.caelum.argentum.modelo.Candlestick;
import main.java.br.com.caelum.argentum.modelo.CandlestickFactory;
import main.java.br.com.caelum.argentum.modelo.Negociacao;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TestaCandlestickFactorySemNegociacoes {

    public static void main(String[] args) {


        Calendar hoje = Calendar.getInstance();

        List<Negociacao> negociacoes = Arrays.asList();

        CandlestickFactory factory = new CandlestickFactory();
        Candlestick candle = factory.constroiCandleParaData(hoje, negociacoes);

        System.out.println(candle.getAbertura());
        System.out.println(candle.getFechamento());
        System.out.println(candle.getMinimo());
        System.out.println(candle.getMaximo());
        System.out.println(candle.getVolume());
    }
}
