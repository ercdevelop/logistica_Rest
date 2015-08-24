package br.com.malhaLogistica.Entity;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

 
public class MapaMalhaLogistica {

  
    private List<RotaMalhaLogistica> rotas = new ArrayList<RotaMalhaLogistica>();
    private long id;
    
    
    
    
    public MapaMalhaLogistica adicionaRota(RotaMalhaLogistica rota){
    	rotas.add(rota);
    	return this;
    }
    
    public MapaMalhaLogistica setId(long id){
    	this.id = id;
    	return this;
    }
    
    
    public String toXML() {
		return new XStream().toXML(this);
		
	}

	public List<RotaMalhaLogistica> getRotas() {
		return rotas;
	}
	public void setRotas(List<RotaMalhaLogistica> rotas) {
		this.rotas = rotas;
	}


	public long getId() {
		return id;
	}


	


}
