package br.com.malhaLogistica.Resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.malhaLogistica.DAO.MalhaLogisticaDAO;
import br.com.malhaLogistica.Entity.MapaMalhaLogistica;

@Path("malhaLogistica")
public class MalhaLogisticaResource {
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public String busca(){
		
		MapaMalhaLogistica mapa = new MalhaLogisticaDAO().busca(1L);
		
		return mapa.toXML();

}

}