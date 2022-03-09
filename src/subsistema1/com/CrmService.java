package subsistema1.com;

public class CrmService {
	
	private CrmService(){
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String estado) {
			System.out.println("Cliente salvo no sistema de CRM.");
			System.out.println(nome);
			System.out.println(cep);
			System.out.println(estado);
	}
}
