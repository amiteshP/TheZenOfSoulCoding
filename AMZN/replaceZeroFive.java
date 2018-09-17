import java.util.Scanner;

class Solution{
	public static int replaceZeroToFive(int num){
		int numRes = 0;
		while(num>0){
			int dig = num%10;
			if(dig==0)
				dig = 5;
			numRes = numRes*10 + dig;
			num/=10;
		}
		return(Integer.parseInt(new StringBuilder(numRes+"").reverse().toString()));
	}

	public static void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int num = rdi.nextInt();
		System.out.println(replaceZeroToFive(num));
	}
}