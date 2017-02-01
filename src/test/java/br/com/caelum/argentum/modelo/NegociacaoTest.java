package test.java.br.com.caelum.argentum.modelo;

import main.java.br.com.caelum.argentum.modelo.Negociacao;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class NegociacaoTest {

    @Test
    public void dataDaNegociacaoEhImtavel(){
        // se criar um negocio no dia 15...
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        Negociacao negociacao = new Negociacao(10, 5, calendar);

        //ainda que eu tente mudar a data para 20...
        negociacao.getData().set(Calendar.DAY_OF_MONTH, 20);

        //Ele continua no dia 15.
        Assert.assertEquals(15, negociacao.getData().get(Calendar.DAY_OF_MONTH));

    }
    @Test
    public void getPreco() throws Exception {

    }

    @Test
    public void getQuantidade() throws Exception {

    }

    @Test
    public void getData() throws Exception {

    }

    @Test
    public void getVolume() throws Exception {

    }

}