
public class TesteContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaFernanda = new Conta();
		System.out.println(contaDaFernanda.getSaldo());
		
		contaDaFernanda.titular = new Cliente();
		System.out.println(contaDaFernanda.titular);
				
		contaDaFernanda.titular.nome = "Fernanda";
		System.out.println(contaDaFernanda.titular.nome);
	}

}
