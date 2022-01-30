package Programação_Seqüencial;

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
		
		Scanner Ler = new Scanner (System.in);
		int a ,b ,c , d ,r ,s;
		System.out.println(" Digite o numero inteiro da posição A: ");
		a = Ler.nextInt();
		
		System.out.println(" Digite o numero inteiro da posição B: ");
		b = Ler.nextInt();
		
		System.out.println(" Digite o numero inteiro da posição C: ");
		c = Ler.nextInt();
		
		r = (a+b) * (a+b);
		s = (b+c) * (b +c);
		d = (r + s)/2;
		
		System.out.println(" O resultado final é igual a " + d);
	}
}
