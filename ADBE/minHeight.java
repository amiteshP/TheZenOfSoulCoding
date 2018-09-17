import java.util.Scanner;
import java.util.Arrays;

class minHeight{
	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int k = rdi.nextInt();
			int n = rdi.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = rdi.nextInt();
			}
			Arrays.sort(arr);
			int diff = arr[n-1]-arr[0];
			int big = arr[n-1]-k;
			int sm = arr[0]+k;
			if(sm>big){
				int temp=big;
				big = sm;
				sm = temp;
			}
			for(int i=1; i<n-1;i++){
				int sub = arr[i]-k;
				int add = arr[i]+k;

				if(sub>=sm || add<=big)
					continue;

				else if(big-sub<=add-sm)
				{
					sm = sub;
				}
				else
					big = add;
			}
			System.out.println(Math.min(diff, big-sm));
		}
	}
}