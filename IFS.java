package Controle;
import java.util.Scanner;

public class IFS {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String vacina1 = "";
		String vacina2 = "";
		String vacina3 = "";
		String vacina4 = "";
		int meses = 0;
		
		System.out.println("Quantos meses voce tem?");
		meses = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Qual a primeira vacina?");
		vacina1 = entrada.nextLine();
		if(vacina1.equals("meningo") && meses == 3){
			System.out.println("Voce tomou a vacina de tres meses");
			return;
		}
		
		if(vacina1.equals("meningo") && meses == 5){
			System.out.println("Voce tomou a vacina de cinco meses");
		}
		else {	
		System.out.println("Qual a segunda vacina? Se nao tomou digite n");
		vacina2 = entrada.nextLine();
		
		if(vacina1.equals("bcg") && vacina2.equals("hepatite b")) {
		System.out.println("Voce tomou a vacina que se toma ao nascer.");
		}
		
		
		else {
		System.out.println("Qual a terceira vacina? Se nao tomar digite n");
		vacina3 = entrada.nextLine();
		
		
		System.out.println("Qual a quarta vacina?se nao tomou digite n");
		vacina4 = entrada.nextLine();
		}
		
		if(vacina1.equals("penta") 
		&& vacina2.equals("vip") 
		&& vacina3.equals("pneumo") 
		&& vacina4.equals("rotavirus")
		&& meses == 2) {
			System.out.println("Voce tomou a vacina de 2 meses.");}
		
		if(vacina1.equals("penta") 
				&& vacina2.equals("vip") 
				&& vacina3.equals("pneumo") 
				&& vacina4.equals("rotavirus")
				&& meses == 4) {
				System.out.println("Voce tomou a vacina de 4 meses.");}
		}
		if(vacina1.equals("penta") 
			&& vacina3.equals("vip") 
			&& vacina4.equals("scr")
			&& meses == 6){
			System.out.println("Voce tomou a vacina de 6 meses as vacinas sao: "+ vacina1+vacina2+vacina3+vacina4);
		}
		if(vacina1.equals("penta") 
				&& vacina2.equals("vip") 
				&& vacina3.equals("scr")
				&& meses == 6){
				System.out.println("Voce tomou a vacina de 6 meses");
		}
		if(vacina1.equals("febre amarela") && meses ==9) {
				System.out.println("Voce tomou a vacina de 9 meses");
		}
		if(vacina1.equals("pneumo") 
				&& vacina2.equals("meningo") 
				&& vacina3.equals("scr")
				&& meses == 12){
				System.out.println("Voce tomou a vacina de 12 meses");
		}
		
		if(vacina1.equals("dtp") 
				&& vacina2.equals("vop") 
				&& vacina3.equals("hepatite a")
				&& vacina4.equals("tetra viral")
				&& meses == 15){
				System.out.println("Voce tomou a vacina de 15 meses");
		}		
		if(vacina1.equals("dtp")
		   && vacina2.equals("vop")
		   && vacina3.equals("varicela")
		   && meses > 15){
			System.out.println("Voce tomou a vacina de 4 anos");
		}
	}
}	




