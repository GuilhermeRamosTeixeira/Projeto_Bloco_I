package Programa��o_Seq�encial;

import java.util.Scanner;

public class Exerc�cio_04 {

	public static void main(String[] args) {
		
		Scanner Ler = new Scanner (System.in);
		int a ,b ,c , d ,r ,s;
		System.out.println(" Digite o numero inteiro da posi��o A: ");
		a = Ler.nextInt();
		
		System.out.println(" Digite o numero inteiro da posi��o B: ");
		b = Ler.nextInt();
		
		System.out.println(" Digite o numero inteiro da posi��o C: ");
		c = Ler.nextInt();
		
		r = (a+b) * (a+b);
		s = (b+c) * (b +c);
		d = (r + s)/2;
		
		System.out.println(" O resultado final � igual a " + d);
	}
}
