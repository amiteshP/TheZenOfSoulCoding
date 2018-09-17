import java.util.Scanner;

class Magichf{
	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int n = rdi.nextInt();
			int X = rdi.nextInt();
			int ins = rdi.nextInt();
			for(int i=0; i<ins; i++){
				int a = rdi.nextInt();
				int b = rdi.nextInt();
				if(a==X)X=b;
				else if(b==X)X=a;
			}
			System.out.println(X);
		}
	}
}