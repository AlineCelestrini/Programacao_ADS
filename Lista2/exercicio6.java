package Lista2;

import java.util.Scanner;

public class exercicio6 {
	static Scanner prod = new Scanner(System.in);
	static Scanner preco = new Scanner(System.in);
	static Scanner pgto = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Informe o nome do produto que deseja comprar: ");
		String prod1 = prod.nextLine();
		System.out.print("Informe o preço do produto que deseja comprar: R$");
		double preco1 = preco.nextDouble();
		System.out.print("Informe a forma de pagamento: \n(1)À Vista\n(2)À prazo.");
		int pgto1 = pgto.nextInt();
		double desc1, desc2;
		if (pgto1 == 1) {
			desc1 = preco1 - (preco1 * (5.0 / 100.0));
			System.out.println("Preço final com desconto de 5%: R$ " + desc1);
		}
		if (pgto1 == 2) {
			desc2 = preco1 + (preco1 * (2.0 / 100.0));
			System.out.println("Preço final com acréscimo de 2%: R$ " + desc2);
		}

	}
}
