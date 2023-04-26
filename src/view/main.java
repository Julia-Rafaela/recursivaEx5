package view;

import java.util.Scanner;

import controller.quantNum;

public class main {
	public static void main(String[] args) {
		int num;
		Scanner leia=new Scanner(System.in);
			System.out.println("Digite os números");
			num=leia.nextInt();
		int resultado = quantNum.contarDigitos(num);
		System.out.println("quantidade de digitos é " + resultado);
	}
}
