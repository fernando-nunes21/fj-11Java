class ExercicioQuatro{
	public static void main(String[] args){
		int i,j;
		int fatorial;

		for(i=1;i<=10;i++){
			fatorial = 1;	
			j=i;
			while(j>=1){
				fatorial = fatorial * j;
				j--;
			}
			System.out.println("Fatorial de "+i+" é ("+i+"!) = "+fatorial);
		}
	}
}
