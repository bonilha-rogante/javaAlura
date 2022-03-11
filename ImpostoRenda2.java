
public class ImpostoRenda2 {

	public static void main(String[] args) {
		double salario = 4663.00;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Sua aliquota é de 7,5%");
			System.out.println("Você pode deduzir até R$ 142");
		} else if (salario <= 3751.0) {
			System.out.println("Sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		} else if (salario <= 4664.00) {
			System.out.println("Sua aliquota é de 22.5%");
			System.out.println("Você pode deduzi até R$636");
		}
	}
}
