import java.util.Scanner;

class Solution{
	public static boolean checkPower(int num){
		if(num==1)
			return true;
		for(int i=1; i*i<=num; i++){
			if(logIsInt(num, i))
				return true;
		}
		return false;
	}

	public static boolean logIsInt(int exp, int base){
		double res = Math.log(exp)/Math.log(base);
		if(res == Math.floor(res) && !Double.isInfinite(res))
			return true;
		return false;
	}

	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int n = rdi.nextInt();
		System.out.println(checkPower(n));
	}
}