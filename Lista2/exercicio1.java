package Lista2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String args[]) {
		Scanner nume = new Scanner(System.in);
		int n1,n2;
		System.out.println("Informe um número.");
		n1 = nume.nextInt();
		System.out.println("Informe outro número.");
		n2 = nume.nextInt();
		if (n1%n2==0) {
			System.out.println(n1 + " é divisível por " + n2);
		}
		else if (n2%n1==0) {
			System.out.println(n2 + " é  divisível por " + n1);
		}
	}
}
