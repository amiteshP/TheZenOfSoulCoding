import java.util.Scanner;

class Solution{
	public static int returnFlipBits(int a, int b){
		int xor = a^b;
		int res = 0;
		while(xor>0)
		{
			if((xor&1)==1)
				res++;
			xor>>=1;
		}
		return res;
	}

	static public void main(String args[]){
		Scanner rdi= new Scanner(System.in);
		int num = rdi.nextInt();
		int numb = rdi.nextInt();
		System.out.println(returnFlipBits(num, numb));
	}

	public static int countSetBits(int num){
		int c = 0;
		while(num>0){
			num = num&(num-1);
			c++;
		}
		return c;
	}
}

/**
10 = 1010
10-1=9 = 1001
10&9 = 1000 = 8;
8-1=7 = 0111
8&7 = 0**/