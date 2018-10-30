package Lista2;

import java.util.Scanner;

public class exercicio4 {

public static void main(String[] args) {
	Scanner decre = new Scanner (System.in);
	float num1, num2 , num3;
	System.out.println("Digite 03 números distintos.");
	num1 = decre.nextFloat();
	num2 = decre.nextFloat();
	num3 = decre.nextFloat();
	if (num1 < num2 && num2 < num3){
		System.out.println("Em ordem decrescente:" + num1 +", "+ num2 + ", " + num3);
	}
	else if (num2 < num3 && num3 < num1) {
		System.out.println("Em ordem decrescente:" + num2 +", "+ num3 + ", " + num1);
	}
	else if (num3 < num1 && num1 < num2) {
		System.out.println("Em ordem decrescente:" + num3 +", "+ num1 + ", " + num2);
	}
	else if (num1 < num3 && num3 < num2) {
		System.out.println("Em ordem decrescente:" + num1 +", "+ num3 + ", " + num2);
	}
	else if (num2 < num1 && num1 < num3) {
		System.out.println("Em ordem decrescente:" + num2 +", "+ num1 + ", " + num3);
	}
	else if (num3 < num2 && num2 < num1) {
		System.out.println("Em ordem decrescente:" + num3 +", "+ num2 + ", " + num1);
	}
}
}
