package Lista1;
 import java.util.Scanner;
 
public class exercicio4 {
public static void main(String[] args) {
	
	//raíz quadrada de um numero.
	
	Scanner num = new Scanner(System.in);
	System.out.print("Informe um número: ");
	double num1 = num.nextDouble();
	System.out.print("A raiz quadrada é: " + Math.sqrt(num1));
}
}
