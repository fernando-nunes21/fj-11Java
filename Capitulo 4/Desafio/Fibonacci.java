class Fibonacci{
	int calculaFibonacci(int pos){
		return (pos <= 2) ? 1 : calculaFibonacci(pos-1) + calculaFibonacci(pos-2);	
	}
}
