package Programa��o_Seq�encial;

import java.util.Scanner;

public class Exerc�cio_03 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int segundo , horas , minutos, minutosres , segundos ;
		System.out.println(" Quantos segundo durou a sua apresenta��o? ");
		segundo = ler.nextInt();
		
	horas = (segundo/60)/60;
	minutos = segundo -  (horas *3600);
	minutosres = minutos /60;
	segundos = segundo- (horas *3600) - (minutosres *60);
	
	System.out.println(" A sua apresenta��o durou " + horas + " horas, " +
	 minutosres + " minutos e " + segundos + " segundos");
		
	}

}
