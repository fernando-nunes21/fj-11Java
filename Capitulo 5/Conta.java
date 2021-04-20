class Conta{
	
	private static int identificador;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data  dataAbertura;

	Conta(){
		Conta.identificador = Conta.identificador + 1;
	}
	
	Conta(String titular){
		this.titular = titular;
		Conta.identificador = Conta.identificador + 1;
	}	
	
	int getIdentificador(){
		return Conta.identificador;
	}
	
	void setTitular(String titular){
		this.titular = titular;
	}
	
	String getTitular(){
		return this.titular;
	}
	
	void setNumero(int numero){
		this.numero = numero;
	}
	
	int getNumero(){
		return this.numero;
	}
	
	void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	String getAgencia(){
		return this.agencia;
	}
		
	void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	double getSaldo(){
		return this.saldo;
	}
	
	void setDataAbertura(Data data){
		this.dataAbertura = data;
	}
	
	Data getDataAbertura(){
		return this.dataAbertura;
	}
	

	void saca(double valor){
		this.saldo -= valor;
	}

	void deposita(double valor){
		this.saldo += valor;
	}

	double getRendimento(){
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao(){
		String dados = "Nome Titular = "+this.titular+"\nNumero da Conta = "+this.numero+
				"\nNumero da Agencia = "+this.agencia+"\nSaldo = "+this.saldo+
				"\nData da abertura = "+this.dataAbertura.formatada();
		return dados;
	}

}
