package classe;

import java.util.Scanner;

public class Minha {
	public static void main(String[] args) {
		
		//Variáveis
		int idade = 0;
		int ano;
		int meses;
		int dias;
		//Inserido a entrada para o scanner.
		Scanner entrada=new Scanner(System.in);
		
		//leitura das variáveis
		System.out.println("Qual a idade?");
		ano = entrada.nextInt();
		System.out.println("Quantos meses?");
		meses = entrada.nextInt();
		System.out.println("quantos dias?");
		dias = entrada.nextInt();
		
		//declaração da variável idade
		idade = (ano * 365) + (meses * 30) + dias;
		
		//Impressão da variável
		System.out.printf("%d anos, %d meses e %d dias equivale a= %d dias.",ano,meses,dias,idade);
		
		}

}
