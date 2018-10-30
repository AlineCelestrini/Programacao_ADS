package Lista1;
 import java.util.Scanner;
 
public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner sal = new Scanner(System.in);
		System.out.println("Informe o valor da sua hora de trabalho: R$ ");
		double salhora = sal.nextDouble();
		System.out.println("Informe quantas horas você trabalho nesse mês: ");
		double hora = sal.nextDouble();
		double salliquido = salhora*hora;
		System.out.print("Você receberá nesse mês: R$" + salliquido);
				
	}

}
