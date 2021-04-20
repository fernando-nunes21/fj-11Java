package data;

public class Data{
	int dia;
	int mes;
	int ano;
	
	public String formatada(){
		String data;
		data = this.dia+"/"+this.mes+"/"+this.ano;
		return data;
	}
}
