package Lista2;
import java.util.Scanner;

public class exercicio9 {
	//calculo de triangulo.
	
	public static void main(String[] args) {
		Scanner lado = new Scanner(System.in); 
		System.out.println("Informe os lados de um triângulo. \n Informe lado 1:");
		double lado1 = lado.nextDouble();
		System.out.println("Informe o lado 2:");
		double lado2 = lado.nextDouble();
		System.out.println("Informe o lado 3:");
		double lado3 = lado.nextDouble();
		if (lado1<lado2+lado3 &&  lado2<lado1+lado3 && lado3<lado1+lado2){ 
			System.out.println("As medidas formam um triângulo.");
			if (lado1==lado2 &&  lado2==lado3){ 
			System.out.println("Triângulo Equilátero.");
			}
			else if (lado1!=lado2 &&  lado2!=lado3 && lado1!=lado3){
			System.out.println("Triângulo Escaleno.");
			}
			else if (lado1==lado2 ||  lado2==lado3){ 
			System.out.println("Triângulo Isósceles.");
			}
		}
		else { 
			System.out.println("Não é um triângulo.");
			}
	}
}
		
	
