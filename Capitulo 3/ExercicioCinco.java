class ExercicioCinco{
	public static void main(String[] args){
		long i,j;
		long  fatorial;

		for(i=1;i<=40;i++){
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
