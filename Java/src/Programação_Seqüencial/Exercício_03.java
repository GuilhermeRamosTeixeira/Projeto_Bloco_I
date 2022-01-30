package Programação_Seqüencial;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int segundo , horas , minutos, minutosres , segundos ;
		System.out.println(" Quantos segundo durou a sua apresentação? ");
		segundo = ler.nextInt();
		
	horas = (segundo/60)/60;
	minutos = segundo -  (horas *3600);
	minutosres = minutos /60;
	segundos = segundo- (horas *3600) - (minutosres *60);
	
	System.out.println(" A sua apresentação durou " + horas + " horas, " +
	 minutosres + " minutos e " + segundos + " segundos");
		
	}

}
