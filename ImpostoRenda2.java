
public class ImpostoRenda2 {

	public static void main(String[] args) {
		double salario = 4663.00;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Sua aliquota � de 7,5%");
			System.out.println("Voc� pode deduzir at� R$ 142");
		} else if (salario <= 3751.0) {
			System.out.println("Sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350");
		} else if (salario <= 4664.00) {
			System.out.println("Sua aliquota � de 22.5%");
			System.out.println("Voc� pode deduzi at� R$636");
		}
	}
}
