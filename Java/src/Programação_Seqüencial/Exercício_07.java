package Programa��o_Seq�encial;

import java.util.Scanner;

public class Exerc�cio_07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int a,b,c,d,e , f , x1 , x2 , xres  , y1 , y2 , yres ;

		System.out.println("Digite um numero inteiro para a posi��o A: ");
		a = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posi��o B: ");
		b = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posi��o C: ");
		c = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posi��o D: ");
		d = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posi��o E: ");
		e = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posi��o F: ");
		f = ler.nextInt();
		
		x1 = (c * e) - (b * f);
		x2 = (a * e) - (b * d);
		y1 = (a * f) - (c * d);
		y2 = (a * e) - (b * d);
		xres = x1/x2;
		yres = y1/y2;
		
		System.out.println("O valor final de X � igual a " + xres);
		
		System.out.println("O valor final de Y � igual a " + yres);

	}

}
