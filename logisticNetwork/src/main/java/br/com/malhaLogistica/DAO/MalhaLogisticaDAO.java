package br.com.malhaLogistica.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.malhaLogistica.Entity.MapaMalhaLogistica;
import br.com.malhaLogistica.Entity.RotaMalhaLogistica;


public class MalhaLogisticaDAO {
	
	
	private static Map<Long, MapaMalhaLogistica> banco = new HashMap<Long, MapaMalhaLogistica>();
	private static AtomicLong contador = new AtomicLong();
	
	static{
		
		RotaMalhaLogistica rota1 = new RotaMalhaLogistica("A", "B", 30D, 1L);
		RotaMalhaLogistica rota2 = new RotaMalhaLogistica("A", "C", 60D, 1L);
		MapaMalhaLogistica mapa = new MapaMalhaLogistica().adicionaRota(rota1)
														  .adicionaRota(rota2)
														  .setId(1L);
		
		banco.put(1L, mapa);
														  
		 }
	
	public void adicionaRota(MapaMalhaLogistica mapa){
		long id = contador.incrementAndGet();
		mapa.setId(id);
		banco.put(id, mapa);
	}
	
	public MapaMalhaLogistica busca(Long id){
		return banco.get(id);
	}

}
