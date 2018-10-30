package Lista1;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Informe um número inteiro.");
		int num1 = num.nextInt();
		System.out.println("Informe outro número inteiro.");
		int num2 = num.nextInt();
		System.out.println("Divisor é: "+ num1);
		System.out.println("Dividendo é: "+ num2);
		float divis = (num1 / num2);{
		System.out.println("Quosciente é: "+ divis);
		float resto = (num1 % num2);
		System.out.println("Resto é: "+ resto);	
		}
	
	}

}
