package Programa��o_Seq�encial;

import java.util.Scanner;

public class Exerc�cio_01 {
	public static void main(String[] args) {
 
		Scanner leer = new Scanner(System.in);
		
		int ano ,mes, dia, res ;
		System.out.println("Quantos anos inteiros de vida voc� tem? ");
		ano = leer.nextInt();
		System.out.println("Quantos meses inteiros de vida voc� tem? ");
		mes = leer.nextInt();
		System.out.println("Quantos dias inteiros de vida voc� tem? ");
		dia = leer.nextInt();
		
		
		res = (ano * 365) + (mes *31) + dia ;
		
		System.out.println("Voc� tem " + res + " dias de vida ");
		}

}
