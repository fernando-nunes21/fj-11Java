class ExercicioSete{
	public static void main(String[] args){
		int x = 13;
		while(x!=1){
			if(x%2!=0){
				x = 3 * x + 1;
			}
			else if(x%2==0){
				x = x/2;
			}
			System.out.print(x+" -> ");
		}
	}
}
