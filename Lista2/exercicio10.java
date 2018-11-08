package Lista2;
import java.util.Scanner;

public class exercicio10 {
	//compras no mercadinho.
	
	public static void main(String[] args) {
		Scanner compra = new Scanner(System.in); 
		System.out.println("Comprando quantos kilos de maçã:");
		double kmaca = compra.nextDouble();
		double precomaca, precomorango, kmorango;
		if (kmaca<=5){ 
			precomaca= kmaca*1.8;
			System.out.println("Valor da maçã: R$" + precomaca);
			}
			else {
				precomaca= kmaca*1.5;
				System.out.println("Valor da maçã: R$" + precomaca);
			}
		System.out.println("Comprando quantos kilos de morango:");
		kmorango = compra.nextDouble();
		if (kmorango<=5){ 
			precomorango= kmorango*2.5;
			System.out.println("Valor do morango: R$" + precomorango);
			}
			else {
				precomorango= kmorango*2.2;
				System.out.println("Valor do morango: R$" + precomorango);
				}
		double valortotal = precomaca+precomorango;
		System.out.println("Valor total de compras: R$" + valortotal);
		if (kmaca+kmorango>8 || valortotal >=25) {
			double valordesconto = valortotal-(valortotal*0.10);
			System.out.println("Você terá 10% de desconto nas compras. Totalizando R$" + valordesconto);
			
		}
	}
}
		
	
