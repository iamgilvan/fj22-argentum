package main.java.br.com.caelum.argentum.reader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import main.java.br.com.caelum.argentum.modelo.Negociacao;

import java.io.InputStream;
import java.util.List;

public class LeitorXML {

    @SuppressWarnings("unchecked")
    public List<Negociacao> carrega(InputStream inputStream){
    XStream stream = new XStream(new DomDriver());
    stream.alias("negociacao", Negociacao.class);
    return (List<Negociacao>) stream.fromXML(inputStream);
    }

}
