import java.util.Scanner;

class pairCubeCount{
	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int num = rdi.nextInt();
			for(int i=1; i<=Math.cbrt(num); i++){
				int cb = i*i*i;
				int diff = num-cb;
				int diffCbrt = (int)Math.cbrt(diff);
				if(diffCbrt*diffCbrt*diffCbrt === diff)
					count++;
			}
		}
	}
}