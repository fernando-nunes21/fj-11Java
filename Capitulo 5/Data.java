class Data{
	int dia;
	int mes;
	int ano;
	
	String formatada(){
		String data;
		data = this.dia+"/"+this.mes+"/"+this.ano;
		return data;
	}
}
