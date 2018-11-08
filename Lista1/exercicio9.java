package Lista1;
import java.util.Scanner;

public class exercicio9 {
public static void main(String[] args) {
	
	//calculo peso ideal pelo.
	
	Scanner peso = new Scanner(System.in);
	System.out.println("Informe sua altura, para calcular seu peso ideal: ");
	double altura = peso.nextDouble();
	double pesoideal = (72.7*altura)-58;
	System.out.println("Seu peso ideal é:" + pesoideal + "Kg.");
	
}
}
