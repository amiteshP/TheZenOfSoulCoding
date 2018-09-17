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
			int lSum = 0;
			int rSum = 0;
			for(int i=0; i<n; i++){
				arr[i] = rdi.nextInt();
				if(i==0){
					lSum+=arr[0];
				}
				else
					rSum+=arr[i];
			}
			
			if(n==1)
				System.out.println(1);
			else if(n==2 && lSum==rSum)
				System.out.println(-1);
			else if(lSum==rSum)
				System.out.println(2);
			
			else
				{
					int baldex = -1;
					for(int i=1; i<n; i++)
					{
						lSum+=arr[i];
						if(lSum==rSum)
						{
							baldex = i+1;
							break;
						}
						else
							rSum-=arr[i];
					}
					System.out.println(baldex);
				}
			
		}
	}
}