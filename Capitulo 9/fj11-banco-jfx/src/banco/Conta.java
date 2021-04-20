package banco;
import data.Data;

public class Conta{
	
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
	
	public int getIdentificador(){
		return Conta.identificador;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getTitular(){
		return this.titular;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return this.numero;
	}

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	public String getAgencia(){
		return this.agencia;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void setDataAbertura(Data data){
		this.dataAbertura = data;
	}

	public Data getDataAbertura(){
		return this.dataAbertura;
	}


	public void saca(double valor){
		this.saldo -= valor;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public double getRendimento(){
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao(){
		String dados = "Nome Titular = "+this.titular+"\nNumero da Conta = "+this.numero+
				"\nNumero da Agencia = "+this.agencia+"\nSaldo = "+this.saldo+
				"\nData da abertura = "+this.dataAbertura.formatada();
		return dados;
	}

}
