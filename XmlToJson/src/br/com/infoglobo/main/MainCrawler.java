package br.com.infoglobo.main;

import br.com.infoglobo.facade.Manipulation;

public class MainCrawler {

	public static void main(String[] args) {
		
		//CRIANDO UMA INSTANCIA DA CLASSE DE CONVERSAO
		Manipulation m = new Manipulation();
		
		try {
			
			//EXECUTANDO O METODO DE CONVERSAO DA ESTRUTURA DE DADOS
			m.ConverterXmlToJson();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
