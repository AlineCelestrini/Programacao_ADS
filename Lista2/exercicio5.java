package Lista2;
import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String args[]) {
		Scanner turno = new Scanner(System.in);
		char turnoEst;
		System.out.println("Informe seu turno de estudos conforme abaixo.");
		System.out.print(" Digite M-Matutino.\n Digite V-Vespertino.\n Digite N-Noturno.\n");
		turnoEst= turno.next().charAt(0);
		if (turnoEst=='M') {
			System.out.println("Você estuda no turno Matutino.");
		}
		else if (turnoEst=='V') {
			System.out.println("Você estuda no turno Vespertino.");
					}
		else if (turnoEst=='N') {
			System.out.println("Você estuda no turno Noturno.");
		}
		else 
			System.out.println("nada.");
		
	}
}





