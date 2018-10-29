import java.util.Scanner;

class Solution{
	public static Double countZero(int d){
		return ((9*Math.pow(10, d-1))-(Math.pow(9, d)));
	}

	public static void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int n = rdi.nextInt();
		System.out.println(countZero(n));
	}
}