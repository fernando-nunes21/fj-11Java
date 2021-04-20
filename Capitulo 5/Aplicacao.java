class Aplicacao{
	public static void main(String[] args){
		Conta c1 = new Conta();
		Conta c2 = new Conta("Fernando");
		
		Data data = new Data();
		
		c1.setTitular("Thaliane");
		c1.setSaldo(1000);
		c1.setDataAbertura(data);
		c1.setNumero(789101-3);
		c1.setAgencia("5501");
		
		c2.setSaldo(600);
		c2.setDataAbertura(data);
		c2.setNumero(123456-1);
		c2.setAgencia("5501");
		
		System.out.println(c1.getTitular());
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c1.getRendimento()+"\n");
		System.out.println(c2.getTitular());
		System.out.println(c2.recuperaDadosParaImpressao());
		System.out.println(c2.getRendimento());
	}
	
}
