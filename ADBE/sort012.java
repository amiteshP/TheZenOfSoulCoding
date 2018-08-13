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
			int lo = 0;
			int hi = n-1;
			int mid  =0;
			int temp = 0;
			while(mid<=hi){
				switch(arr[mid]){
					case 0:
						if(arr[lo]!=arr[mid])
						{
							temp = arr[lo];
							arr[lo] = arr[mid];
							arr[mid] = temp;
						}
						lo++;
						mid++;
						break;
					case 1:
						mid++;
						break;
					case 2:
						if(arr[hi]!=arr[mid])
						{
							temp = arr[hi];
							arr[hi] = arr[mid];
							arr[mid] = temp;
						}
						hi--;
						mid++;
						break;
				}
			}
			for(int i=0; i<n; i++){
				System.out.print(arr[i]+" ");
			}
		}
	}
}