import java.util.Scanner;

class chefserve{
	public static void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int p1 = rdi.nextInt();
			int p2 = rdi.nextInt();
			int k = rdi.nextInt();
			long tot = p1+p2;
			int divRem = (int)(tot/k);
			if(divRem%2==0)
				System.out.println("CHEF");
			else
				System.out.println("COOK");
		}
	}
}