import java.util.Scanner;

class patternInterst{
	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int n = rdi.nextInt();
			for(int i=0; i<2*n-1; i++){
				for(int j=0; j<2*n-1; j++){
					System.out.print(1+Math.max(n-i-1, n-j-1));
				}
				System.out.println();
			}
		}
	}
}