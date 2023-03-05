
package classe;

public class Média {
	public static void main(String[] args) {
		
		//Primeiro conjunto de números para os cálculos
		int[] numeros1 =  {64,15,14,3};
		double divisao = 3;
		int soma = 0;
		double media = 0;
		//Segundo conjunto de números para os cálculos
		int[] numeros2 = {34,90,12,83};
		int soma2 = 0;
		double media2 = 0;
		//Variaveis da soma e media dos numeros
		double soma3 = 0;
		double medias = 0; 
	
		for (int i = 0; i < numeros1.length; i++) {
		//System.out.println(numeros1[i]);
		//soma dos valores de array e média de numeros1
		soma += numeros1[i];
		}
		media = (double) soma /3;
		//Impressao da soma de numeros 1 e da média do mesmo
		System.out.println("A soma dos valores de arrya primeiro e " + soma);
		System.out.println("a media dos valores e "+ media);
		System.out.println();
		//soma dos valores de arrya e media de numero2
		for (int y = 0; y < numeros2.length; y++) {
		//System.out.println(numeros2[y]);
		soma2 += numeros2[y];
		}
		media2 = (double) soma2 / 3;
		
		soma3 = soma+soma2;
		medias = soma3 / (numeros1.length + numeros2.length);
		//impressao da soma de numeros 2 e da média do mesmo
		System.out.println("A soma dos valores de arrya segundo e " + soma2);
		System.out.println("A media dos valores e "+ media2);
		System.out.println();
		System.out.println("A soma de todos e  "+ soma3);
		System.out.println("A media de todos e  "+ medias);
		}
}
		

		
		
		
	    



		

		


