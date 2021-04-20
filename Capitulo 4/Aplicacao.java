class Aplicacao{
	public static void main(String[] args){
		Conta c1 = new Conta();
		Data data = new Data();

		c1.titular = "Fernando";
		c1.saldo = 500;
		c1.dataAbertura = data;

		/*Conta c2 = new Conta();
		c2.titular = "Thatah";
		c2.saldo = 1200;

		c2 = c1; //Exercicio 5

		if (c1 == c2){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}

		Exercicios anteriores (4,5) */

		System.out.println(c1.recuperaDadosParaImpressao());
		
		//Conta.saldo = 1234; Ex 8
		//Conta.calculaRendimento();  Ex8
	}
}
