package br.com.malhaLogistica.Entity;


 
public class CidadeMalhaLogistica {

    private String cidadeOrigem;
	private String cidadeDestino;
	
	

    public CidadeMalhaLogistica() {}

    public CidadeMalhaLogistica(String origem, String destino) {
    	this.cidadeOrigem = origem;
    	this.cidadeDestino = destino;
    }
    
    public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public CidadeMalhaLogistica getInstance(){
		return new CidadeMalhaLogistica();
	}



	


}
