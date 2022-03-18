
public class TestaBanco {
	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.nome = "Guilherme Bonilha";
		guilherme.cpf = "555.555.555-55";
		guilherme.profissao = "Programador";
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.depositar(100);
		
		
		//associa o cliente guilherme a contaDoGuilherme
		contaDoGuilherme.titular = guilherme;
		System.out.println(contaDoGuilherme.titular.nome);
	}

}
