package Lista2;
import java.util.Scanner;

public class exercicio7 {
	//calculo de salario com base nas horas.
	
	public static void main(String[] args) {
		Scanner pgto = new Scanner(System.in);
		System.out.println("Informe o setor de trabalho: \nA - Adm \nP - Produção");
		char setor = pgto.next().charAt(0); 
		System.out.println("Informe quantidade de horas trabalhadas nesse mês:");
		double horas = pgto.nextDouble();
		if (setor=='A') {
			double saladm = horas*12; 
			System.out.printf("Você receberá R$ %.2f", saladm);
		}
		if(setor=='P') {
			double salprod = horas*10;
			System.out.printf("Você receberá R$ %.2f", salprod);
			
		}
	}
		
		
}
