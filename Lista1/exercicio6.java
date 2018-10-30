package Lista1;
import java.util.Scanner;

public class exercicio6 {
	
public static void main(String[] args) {
	
	//informar o rendimento do saldo da poupança.
	
	Scanner num = new Scanner(System.in);
	System.out.println("Informe o saldo inicial de sua poupança para saber quanto ela rendeu: R$");
	double saldo = num.nextDouble();
	double nsaldo = (saldo+(saldo*(3/100)));
	System.out.println("Seu novo saldo é: R$ " + nsaldo);
}
}
