package Lista1;
import java.util.Scanner;

public class exercicio8 {
public static void main(String[] args) {
	
	//calculo de produtos resultantes de simulações.
	
	Scanner num = new Scanner(System.in);
	System.out.println("informe um número inteiro:");
	int num1 = num.nextInt();
	System.out.println("informe outro número inteiro:");
	int num2 = num.nextInt();
	System.out.println("informe um número real:");
	double num3 = num.nextDouble();
	double prod1 = num1*2+(num2/2);
	System.out.println("O produto do dobro do 1º número mais a metade do 2º número é: " + prod1);
	double prod2 = (num1*3)+num3;
	System.out.println("O produto da soma do triplo do 1º número mais o 3º número é: " + prod2);
	double prod3 = Math.pow(num3, 3);
	System.out.println("O produto do 3º número elevado a 3 é: " + prod3);
}

}
