package Programação_Seqüencial;

import java.util.Scanner;

public class Exercício_01 {
	public static void main(String[] args) {
 
		Scanner leer = new Scanner(System.in);
		
		int ano ,mes, dia, res ;
		System.out.println("Quantos anos inteiros de vida você tem? ");
		ano = leer.nextInt();
		System.out.println("Quantos meses inteiros de vida você tem? ");
		mes = leer.nextInt();
		System.out.println("Quantos dias inteiros de vida você tem? ");
		dia = leer.nextInt();
		
		
		res = (ano * 365) + (mes *31) + dia ;
		
		System.out.println("Você tem " + res + " dias de vida ");
		}

}
