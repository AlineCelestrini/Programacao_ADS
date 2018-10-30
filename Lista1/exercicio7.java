package Lista1;
import java.util.Scanner;

public class exercicio7 {
	
public static void main(String[] args) {
	
	//conversão de centímetros em metros e vice-versa.
	
	
	Scanner num = new Scanner(System.in);
	System.out.println("Informe quantos centímetros quer converter em metros: ");
	double conv1 = num.nextDouble();
	double convcenti = conv1/100;
	System.out.println("Total em metros: " + convcenti);
	System.out.println("Informe as medidas em metros, se deseja converter em centímetros: ");
	double conv2 = num.nextDouble();
	double convmetro = conv2*100;
	System.out.println("Total em centímetros: " + convmetro);
			
}
}