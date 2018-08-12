package br.com.infoglobo.facade;

import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import br.com.infoglobo.model.Channel;
import br.com.infoglobo.model.Rss;

public class Manipulation {

	/**
	 * deserializa a estrurura de dados xml
	 * e serializa em Json
	 * @throws Exception
	 */
	public void ConverterXmlToJson() throws Exception{

		//RECUPERA O DESCRITOR
		FileReader reader = null;
		reader = new FileReader("C:\\Users\\developer\\workspaceTeste\\XmlToJson\\src\\xml\\feed.xml");

		//DESERIALIZA A ESTRUTRA DE DADOS XML
		JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		Rss objectRss = (Rss) jaxbUnmarshaller.unmarshal(reader);
		
		//EXECUTA O METODO PARA SEREALIZACAO EM JSON
		this.serializeObject(objectRss);

	}
	
	
	/**
	 * serializa o objeto na estrutura de dados Json
	 * @param rss
	 * @throws Exception
	 */
	public void serializeObject(Rss rss) throws Exception{
		//CRIA UMA INSTANCIA DO OBJETO 
		Channel channel = new Channel();
		
		//ENCAPSULA OS VALORES NA VARIAVEL DE INSTANCIA
		channel.setTitle(rss.getChannel().getTitle());
		channel.setLink(rss.getChannel().getLink());
		channel.setDescription(rss.getChannel().getDescription());
		channel.setItem(rss.getChannel().getItem());
		
		//CRIA UMA INSTANCIA DO FRAMEWORK COM O DRIVER PARA SERIALIZACAO
		XStream xStream = new XStream(new JettisonMappedXmlDriver());
		xStream.setMode(XStream.NO_REFERENCES);
		
		//CRIA O ALIAS
		xStream.alias("channel", Channel.class);
		
		//SERIALIZA E IMPRIME A ESTRURURA DE DADOS
		System.out.println(xStream.toXML(channel));
		
		
	}
	

}
