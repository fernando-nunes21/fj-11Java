class Conta{

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data  dataAbertura;

	void saca(double valor){
		this.saldo -= valor;
	}

	void deposita(double valor){
		this.saldo += valor;
	}

	double calculaRendimento(){
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao(){
		String dados = "Nome Titular = "+this.titular+"\nNumero da Conta = "+this.numero+
				"\nNumero da Agencia = "+this.agencia+"\nSaldo = "+this.saldo+
				"\nData da abertura = "+this.dataAbertura.formatada();
		return dados;
	}

}
