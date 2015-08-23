package br.com.malhaLogistica.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RotaMalhaLogistica {

    private DestinoMalhaLogistica origem;
    private DestinoMalhaLogistica destino;
    private Double distancia;
    
	public DestinoMalhaLogistica getOrigem() {
		return origem;
	}
	public void setOrigem(DestinoMalhaLogistica origem) {
		this.origem = origem;
	}
	public DestinoMalhaLogistica getDestino() {
		return destino;
	}
	public void setDestino(DestinoMalhaLogistica destino) {
		this.destino = destino;
	}
	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

    
}
