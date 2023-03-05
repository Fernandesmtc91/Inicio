package classe;

public class Porcentagem {
	public static void main(String[] args) {
		double saldo = 1000;
		double reajuste = 0.01;
		double NovoSaldo = 0;
		double resultado;
		
		System.out.println("o saldo e "+ saldo);
		System.out.println("o reajuste e 1%");
		resultado= saldo * reajuste;
		NovoSaldo= resultado + saldo;
		System.out.println("o novo saldo sera de "+ NovoSaldo);
		System.out.println();
		}

}
