package subsistema2.com;

public class CepApi {

private static CepApi instancia = new CepApi();;
	
	private CepApi () {
		super();
	}
	
	public static CepApi getInstacia() {
		return instancia;
	}

	public String recuperarCidade(String cep){
		return "Fortaleza";
	}
	
	public String recuperarEstado(String cep){
		return "Ceará";
	}
}
