package test.java.br.com.caelum.argentum.modelo;

import main.java.br.com.caelum.argentum.modelo.Negociacao;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class NegociacaoTest {

    @Test
    public void dataDaNegociacaoEhImutavel(){
        // se criar um negocio no dia 15...
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        Negociacao negociacao = new Negociacao(10, 5, calendar);

        //ainda que eu tente mudar a data para 20...
        negociacao.getData().set(Calendar.DAY_OF_MONTH, 20);

        //Ele continua no dia 15.
        Assert.assertEquals(15, negociacao.getData().get(Calendar.DAY_OF_MONTH));

    }
    //Esse teste indica sucesso cado uma exception for lançada.
    @Test (expected = IllegalArgumentException.class)
    public void naoCriaNegociacaoComDataNula() {
        new Negociacao(10, 5, null);
    }

    //Teste de verificação se a negociação aconteceu na data atual
    @Test
    public void mesmoMilissegundoEhDoMesmoDia(){
        Calendar agora = Calendar.getInstance();
        Calendar mesmoMomento = (Calendar) agora.clone();

        Negociacao negociacao = new Negociacao(40.0, 100, agora);
        Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
    }
}