package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner preco = new Scanner(System.in);
		float prod1, prod2, prod3;
		System.out.println("Informe o valor do produto 1: R$ ");
		prod1 = preco.nextFloat();
		System.out.println("Informe o valor do produto 2: R$ ");
		prod2 = preco.nextFloat();
		System.out.println("Informe o valor do produto 3: R$ ");
		prod3 = preco.nextFloat();
		if (prod1 < prod2 && prod1 < prod3) {
			System.out.println("Compre o produto de valor R$" + prod1);
		} else if (prod2 < prod1 && prod2 < prod3) {
			System.out.println("Compre o produto de valor R$" + prod2);
		} else if (prod3 < prod1 && prod3 < prod2) {
			System.out.println("Compre o produto de valor R$" + prod3);
		}
	}
}
