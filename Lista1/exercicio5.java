package Lista1;
import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		//conversão de graus Fahrenheit em Celsius.
		
		Scanner num = new Scanner(System.in);
		System.out.print("Informe sua temperatura em graus Fahrenheit: ");
		double fahre = num.nextDouble();
		double celsius = (5*(fahre-32)/9);
		System.out.println("Em graus Celsius são: " + celsius);
	}

}
