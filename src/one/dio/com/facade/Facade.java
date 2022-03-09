package one.dio.com.facade;

import subsistema1.com.CrmService;
import subsistema2.com.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstacia().recuperarCidade(cep);
		String estado = CepApi.getInstacia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, estado);
	}
}
