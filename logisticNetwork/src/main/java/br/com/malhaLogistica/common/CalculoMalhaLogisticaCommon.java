package br.com.malhaLogistica.common;

import org.psjava.algo.graph.shortestpath.DijkstraAlgorithm;
import org.psjava.algo.graph.shortestpath.SingleSourceShortestPathResult;
import org.psjava.ds.graph.DirectedWeightedEdge;
import org.psjava.ds.graph.MutableDirectedWeightedGraph;
import org.psjava.ds.numbersystrem.IntegerNumberSystem;
import org.psjava.goods.GoodDijkstraAlgorithm;

/**
 * 
 * @author ercon_000
 * 
 * Classe responsável por realizar o cálculo
 * baseado no algoritmo DijkstraAlgorithm,
 * os métodos são estáticos e o a api responsável
 * foi incorporada ao projeto
 * 
 *
 */

public class CalculoMalhaLogisticaCommon {
	
	
	public static MutableDirectedWeightedGraph<String, Integer> populaInformacoesDistancia(String cidadeOrigem,String cidadeDestino, Integer dist) {
		MutableDirectedWeightedGraph<String,Integer> graph = MutableDirectedWeightedGraph.create();
		graph.insertVertex(cidadeOrigem);
		graph.addEdge(cidadeOrigem, cidadeDestino, dist);
		return graph;
	}

	public static SingleSourceShortestPathResult<String, Integer, DirectedWeightedEdge<String, Integer>> criaInstanciaParaCalculo(
			MutableDirectedWeightedGraph<String, Integer> graph, String cidadeOrigem) {
			IntegerNumberSystem NS = IntegerNumberSystem.getInstance();
			DijkstraAlgorithm dijstraAlgorithm = GoodDijkstraAlgorithm.getInstance();
			SingleSourceShortestPathResult<String, Integer, DirectedWeightedEdge<String, Integer>> result = dijstraAlgorithm.calc(graph, 
					cidadeOrigem, NS);
			return result;
	}
	
	
	

}
