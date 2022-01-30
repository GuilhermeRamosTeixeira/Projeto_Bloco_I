package Programação_Seqüencial;


import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {

Scanner ler = new Scanner (System.in);

int dias , dia ,mes , ano;

	System.out.println(" Quantos dias de vida você tem? ");
	dias = ler.nextInt();
	
	ano = dias /365;
	mes = (dias - (ano *365)) /31;
	dia = dias - (365*ano) -(31 * mes);
	
	System.out.println(" Você tem " + ano + " anos, " + mes + " meses e " + 
	dia + " dias de vida");
	}

}
