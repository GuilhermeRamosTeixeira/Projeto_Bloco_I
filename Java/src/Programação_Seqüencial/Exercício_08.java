package Programa��o_Seq�encial;

import java.util.Scanner;

public class Exerc�cio_08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		double fabrica , distribuidor , taxas , consumidor;
		
		System.out.println("Digite o custo de fabrica do seu veiculo: " );
		fabrica = ler.nextDouble();
		
		distribuidor = fabrica *0.28;
		taxas = fabrica * 0.45;
		consumidor = fabrica + distribuidor + taxas ;
		
		System.out.println(" O pre�o final do seu veiculo � de R$ " + consumidor );
		
		
	}

}
