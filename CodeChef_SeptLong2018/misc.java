class misc{
	public static void main(String[] args) {
		for(int i=3; i<100; i++){
			printPrime(i);
		}	
	}
	public static void printPrime(int num){
		boolean res = true;
		for(int i=2; i<=num/2; i++){
			if(num%i==0)
			{
				res = false;
				break;
			}
		}
		if(res)
			System.out.print(num+"  ");
	}
}