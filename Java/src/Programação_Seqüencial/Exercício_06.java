package Programa��o_Seq�encial;

import java.util.Scanner;

public class Exerc�cio_06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		double x1 , x2 , y1 , y2 , xres , yres , d, dres;
		
		System.out.println("Digite  a cordenada X do Ponto A");
		x1 = ler.nextInt();
		
		System.out.println("Digite  a cordenada Y do Ponto A");
		y1 = ler.nextInt();
		
		System.out.println("Digite  a cordenada X do Ponto B");
		x2 = ler.nextInt();
		
		System.out.println("Digite  a cordenada Y do Ponto B");
		y2 = ler.nextInt();
		
		xres = (x2 - x1 ) * (x2 - x1);
		yres = (y2 - y1 ) * (y2 - y1);
		d = xres + yres;
		
		dres = Math.sqrt(d);
		
		System.out.println("A dist�ncia entre o Ponto A e o Ponto B � de " + dres );
		
		
	}

}
