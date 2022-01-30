package Programação_Seqüencial;

import java.util.Scanner;

public class Exercício_07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int a,b,c,d,e , f , x1 , x2 , xres  , y1 , y2 , yres ;

		System.out.println("Digite um numero inteiro para a posição A: ");
		a = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posição B: ");
		b = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posição C: ");
		c = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posição D: ");
		d = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posição E: ");
		e = ler.nextInt();
		
		System.out.println("Digite um numero inteiro para a posição F: ");
		f = ler.nextInt();
		
		x1 = (c * e) - (b * f);
		x2 = (a * e) - (b * d);
		y1 = (a * f) - (c * d);
		y2 = (a * e) - (b * d);
		xres = x1/x2;
		yres = y1/y2;
		
		System.out.println("O valor final de X é igual a " + xres);
		
		System.out.println("O valor final de Y é igual a " + yres);

	}

}
