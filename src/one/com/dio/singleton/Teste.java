package one.com.dio.singleton;

import one.com.dio.strategy.Comportamento;
import one.com.dio.strategy.ComportamentoAgressivo;
import one.com.dio.strategy.ComportamentoDefensivo;
import one.com.dio.strategy.ComportamentoNormal;
import one.com.dio.strategy.Robo;
import one.dio.com.facade.Facade;

public class Teste {

	public static void main(String[] args) {
		//Singleton
		
		SingletonLazy lazy =  SingletonLazy.getInstancia();	
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
	
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Alexandre", "62940000");
	
	}

}
