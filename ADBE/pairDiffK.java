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
			int k = rdi.nextInt();
			int[]  arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = rdi.nextInt();
			}
			Arrays.sort(arr);
			int count = 0;
			for(int i=0; i<n; i++){
				if(binSearch(arr, i+1, n-1, arr[i]+k))
					count++;
			}
			System.out.println(count);
		}
	}

	public static boolean binSearch(int[] arr, int l, int r, int key)
	{
		if(l>r)
			return false;
		if(l==r)
			{
				if(arr[l]==key)return true;
			}
		else{
			int mid = (l+r)/2;
			if(arr[mid] == key)
				return true;
			else if(arr[mid] > key)
				return binSearch(arr, l, mid-1, key);
			else
				return binSearch(arr, mid+1, r, key);
		}
		return false;
	}
}