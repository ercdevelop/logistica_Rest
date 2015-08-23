package br.com.malhaLogistica.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
 //TODO - MapConstraint
public class MapaWallMart {

    private String nome;
    private Double autonomia;
    private Double custoCombustivel;
	private Double custoTotalCombustivel;
    private List<RotaWallMart> rotas;

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}
	public Double getCustoCombustivel() {
		return custoCombustivel;
	}
	public void setCustoCombustivel(Double custoCombustivel) {
		this.custoCombustivel = custoCombustivel;
	}
	public Double getCustoTotalCombustivel() {
		return custoTotalCombustivel;
	}
	public void setCustoTotalCombustivel(Double custoTotalCombustivel) {
		this.custoTotalCombustivel = custoTotalCombustivel;
	}
	public List<RotaWallMart> getRotas() {
		return rotas;
	}
	public void setRotas(List<RotaWallMart> rotas) {
		this.rotas = rotas;
	}

}
