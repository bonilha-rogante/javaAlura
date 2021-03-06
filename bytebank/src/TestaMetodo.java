
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.saldo = 100;
		contaDoGuilherme.depositar(50);
		System.out.println(contaDoGuilherme.saldo);
		
		boolean conseguiuRetirar = contaDoGuilherme.sacar(20);
		System.out.println(contaDoGuilherme.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaFernanda = new Conta();
		contaDaFernanda.depositar(1000);
		
		boolean sucessoTransferir = 
				contaDaFernanda.transferir(300, contaDoGuilherme);
		if(sucessoTransferir) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Faltou Dinheiro");
		}
		System.out.println(contaDaFernanda.saldo);
		System.out.println(contaDoGuilherme.saldo);
		
		contaDoGuilherme.titular = "Guilherme Bonilha";
		System.out.println(contaDoGuilherme.titular);
	}

}
