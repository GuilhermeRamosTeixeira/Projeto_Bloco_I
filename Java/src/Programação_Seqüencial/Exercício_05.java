package Programação_Seqüencial;



import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {

		//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente. *\\
		
		
		Scanner ler = new Scanner(System.in);
		String nome;
		double nota1,nota2,nota3, media;
		
		System.out.println(" Digite o nome do(a) aluno(a); ");
		nome = ler.nextLine();
		
		System.out.println(" Digite a primeira nota obtida pelo(a) " + nome + " : ");
		nota1 = ler.nextDouble();
		System.out.println(" Digite a segunda nota obtida pelo(a) " + nome + " : ");
		nota2 = ler.nextDouble();
		System.out.println(" Digite a terceira nota obtida pelo(a) " + nome + " : ");
		nota3 = ler.nextDouble();
		
		nota1 = nota1 *2;
		nota2 = nota2*3;
		nota3 = nota3*5;
		
		media = (nota1 + nota2 + nota3) /10;
		
		System.out.println(" A média final do(a) " + nome + " é igual a: " + media);
		
		
	}

}
