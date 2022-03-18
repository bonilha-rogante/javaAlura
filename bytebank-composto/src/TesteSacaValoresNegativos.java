
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.sacar(101));
		
		conta.sacar(101);
		
		System.out.println(conta.getSaldo());
	}

}
