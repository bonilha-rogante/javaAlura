
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente guilherme = new Cliente();
		//	conta.titular = guilherme;
		guilherme.setNome("Guilherme Bonilha");
		
		conta.setTitular(guilherme);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println();
		
	}

}
