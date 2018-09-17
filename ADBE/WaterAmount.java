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
			if(n<3)
				System.out.println("0");
			else
			{
				int water = 0;
				for(int i=0; i<n-2; i++){
					if(arr[i]>arr[i+1] && arr[i+2]>arr[i+1])
					{
						water+=(Math.min(arr[i], arr[i+2])-arr[i+1]);
					}
				}
				System.out.println(water);
			}
		}
	}
}