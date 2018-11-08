package Lista2;
import java.util.Scanner;

public class exercicio8 {
	//calculo de aumento de salario.
	
	public static void main(String[] args) {
		Scanner pgto = new Scanner(System.in);
		System.out.println("Qual é o seu salario: R$ ");
		double sal = pgto.nextDouble();
		if (sal<280) {
			double reajuste = sal*0.20;
			double novosal = sal+reajuste; 
			System.out.printf("Salário anterior: R$ %.2f", sal);
			System.out.println("\nReajuste de 20%. \nValor do reajuste é R$ "+reajuste);
			System.out.printf("Seu novo salário R$ %.2f", novosal);
		}
		if (sal>=280 && sal<700) {
			double reajuste = sal*0.15;
			double novosal = sal+reajuste; 
			System.out.printf("Salário anterior: R$ %.2f", sal);
			System.out.println("\nReajuste de 15%. \nValor do reajuste é R$ "+reajuste);
			System.out.printf("Seu novo salário R$ %.2f", novosal);
		}
		if (sal>=700 && sal<1500) {
			double reajuste = sal*0.10;
			double novosal = sal+reajuste; 
			System.out.printf("Salário anterior: R$ %.2f", sal);
			System.out.println("\nReajuste de 10%. \nValor do reajuste é R$ "+reajuste);
			System.out.printf("Seu novo salário R$ %.2f", novosal);
		}
		if (sal>=1500) {
			double reajuste = sal*0.05;
			double novosal = sal+reajuste; 
			System.out.printf("Salário anterior: R$ %.2f", sal);
			System.out.println("\nReajuste de 5%. \nValor do reajuste é R$ "+reajuste);
			System.out.printf("Seu novo salário R$ %.2f", novosal);
		}
	}
		
		
}
