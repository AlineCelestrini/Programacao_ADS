package Lista2;

import java.util.Scanner;

public class exercicio2 {
	static Scanner entrada = new Scanner(System.in);
	static int n1, n2, n3;

	public static void main(String[] args) {
		System.out.println("Informe três números em sequência:");

		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		if (n1 > n2 && n2 > n3) {
			System.out.println(n1 + " é  o maior.");
		}
		else if ((n2 > n1) && (n1 > n3)) {
			System.out.println(n2 + " é  o maior.");
		}
		else if ((n3 > n1) && (n1 > n2)) {
			System.out.println(n3 + " é o maior.");
		}
		else if ((n1 > n3) && (n3 > n2)) {
			System.out.println(n1 + " é maior.");
		}
		else if ((n2 > n3) && (n3 > n1)) {
			System.out.println(n2 + " é maior.");
		}
		if (n1 < n2 && n2 < n3) {
			System.out.println(n1 + " é  o menor.");
		}
		else if ((n2 < n1 && n1 < n3)) {
			System.out.println(n2 + " é o menor.");
		}
		else if (n3 < n1 && n1 < n2) {
			System.out.println(n3 + " é o menor.");
		}
		else if ((n1 < n3 && n3 < n2)) {
			System.out.println(n1 + " é o menor.");
		}
		else if ((n2 < n3 && n3 < n1)) {
			System.out.println(n2 + " é o menor.");

		}
	}
}