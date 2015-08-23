package br.com.malhaLogistica.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RotaWallMart {

    private DestinoWallMart origem;
    private DestinoWallMart destino;
    private Double distancia;
    
	public DestinoWallMart getOrigem() {
		return origem;
	}
	public void setOrigem(DestinoWallMart origem) {
		this.origem = origem;
	}
	public DestinoWallMart getDestino() {
		return destino;
	}
	public void setDestino(DestinoWallMart destino) {
		this.destino = destino;
	}
	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

    
}
