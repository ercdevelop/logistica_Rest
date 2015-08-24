package br.com.malhaLogistica;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import junit.framework.Assert;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.malhaLogistica.Entity.MapaMalhaLogistica;
import br.com.malhaLogistica.Server.ServidorMalhaLogistica;

public class CalculaMalhaLogisticaJunitTest {
	
	private HttpServer server;
	
	@Before
	public void iniciaServidor(){
		server = ServidorMalhaLogistica.inicializaServidor();
	}
	
	@After
	public void paraServidor(){
		server.stop();
	}
	
	@Test
	public void testaConexaoServidor(){
		Client client = ClientBuilder.newClient();
		
		 WebTarget target =  client.target("http://localhost:8080");
		 String conteudo = target.path("/malhaLogistica").request().get(String.class);
		 MapaMalhaLogistica mapa = (MapaMalhaLogistica) new XStream().fromXML(conteudo);
		 System.out.println(conteudo);
		 Assert.assertEquals("A", mapa);
	}

}
