package Programa��o_Seq�encial;



import java.util.Scanner;

public class Exerc�cio_05 {

	public static void main(String[] args) {

		//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
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
		
		System.out.println(" A m�dia final do(a) " + nome + " � igual a: " + media);
		
		
	}

}
