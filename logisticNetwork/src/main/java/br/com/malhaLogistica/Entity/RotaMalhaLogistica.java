package br.com.malhaLogistica.Entity;


 
public class RotaMalhaLogistica {

    private CidadeMalhaLogistica cidadeMalha;
    private Double distancia;
    private long id;

    
    public RotaMalhaLogistica(){
    	
    }
    
 public RotaMalhaLogistica(String origem, String destino,Double distancia, long id){
    	cidadeMalha = new CidadeMalhaLogistica();
	 	this.cidadeMalha.setCidadeDestino(destino);
	 	this.cidadeMalha.setCidadeOrigem(origem);
	 	this.id = id;
	 	this.distancia =distancia;
    }
    
    
    
	 
	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CidadeMalhaLogistica getCidadeMalha() {
		return cidadeMalha;
	}

	public void setCidadeMalha(CidadeMalhaLogistica cidadeMalha) {
		this.cidadeMalha = cidadeMalha;
	}
	
	

    
}
