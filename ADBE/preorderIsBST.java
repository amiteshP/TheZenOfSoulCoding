/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int n = rdi.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = rdi.nextInt();
			}
			if(n==1 || n==2)
				System.out.println(1);
			else{

			int curr = arr[1];
			int res = 1;
			for(int i=2; i<n; i++){
				
				if(arr[i]<curr)
				{
					res = 0;
					break;
				}	
				curr = arr[i];
			}
			System.out.println(res);
				
			}
		}
	}
}