class ExercicioSeis{
	public static void main(String[] args){
		int n1,n2;
		n1 = 0;
		n2 = 1;
		
		while(n1<=144){
			if(n1 == 0){
				System.out.print(n1+", "+n2);
			}
			else if(n1 > 100){
				System.out.print(", "+n1);
			}
			else{
				System.out.print(", "+n1+", "+n2);
			}
			n1 = n1 + n2;
			n2 = n1 + n2;
		}
	}
}
