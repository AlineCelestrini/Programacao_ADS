package Lista1;
import java.util.Scanner;

public class exercicio10 {
public static void main(String[] args) {
	
	//calculo da conversão da duração de um evento em segundos, para horas, minutos e segundos.
	
	Scanner conversao = new Scanner(System.in);
	System.out.println("Informe a duração do evento em segundos:");
	int seg = conversao.nextInt();
	int hora = seg/3600;
	int min = (seg%3600)/60;
	int seg1 = (seg%3600)%60;
	System.out.printf("%2d : %2d : %2d",hora, min, seg1);
	
}
}
