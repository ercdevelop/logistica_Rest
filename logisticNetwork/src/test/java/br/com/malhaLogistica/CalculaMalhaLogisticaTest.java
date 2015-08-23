package br.com.malhaLogistica;

import org.psjava.algo.graph.shortestpath.DijkstraAlgorithm;
import org.psjava.algo.graph.shortestpath.SingleSourceShortestPathResult;
import org.psjava.ds.graph.DirectedWeightedEdge;
import org.psjava.ds.graph.MutableDirectedWeightedGraph;
import org.psjava.ds.numbersystrem.IntegerNumberSystem;
import org.psjava.goods.GoodDijkstraAlgorithm;

public class CalculaMalhaLogisticaTest {
	
	
	
	public static void main(String[] args) {
		
		IntegerNumberSystem NS = IntegerNumberSystem.getInstance();
		
		Integer dist1 = new Integer(100);
		Integer dist2 = new Integer(10);
		Integer dist3 = new Integer(20);
		
		MutableDirectedWeightedGraph<String,Integer> graph = MutableDirectedWeightedGraph.create();
		graph.insertVertex("A");
		graph.insertVertex("B");
		graph.insertVertex("C");
		graph.insertVertex("D");
		graph.addEdge("A", "C", dist1);
		graph.addEdge("A", "B", dist2);
		graph.addEdge("B", "C", dist3);
		
		
		DijkstraAlgorithm dijstraAlgorithm = GoodDijkstraAlgorithm.getInstance();
		SingleSourceShortestPathResult<String, Integer, DirectedWeightedEdge<String, Integer>> result = dijstraAlgorithm.calc(graph, "A", NS);
		
		boolean reachabilityOfC = result.isReachable("C"); // C is reachable.
		boolean reachabilityOfD = result.isReachable("D"); // D is not reachable.
		int distanceToC = result.getDistance("C"); // must be 30
		
		System.out.println(reachabilityOfC);
		System.out.println(reachabilityOfD);
		System.out.println(distanceToC);
		
		
		
	}

}
