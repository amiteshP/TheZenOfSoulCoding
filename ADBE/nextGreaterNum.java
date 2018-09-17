/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int num = rdi.nextInt();
			char[] numc = (num+"").toCharArray();
			System.out.println(findNext(numc, numc.length));
		}
	}

	public static String findNext(char[] arr, int n){
		int i;
		String res="";
		//start from right and find dig smaller than 
		//the digit at the right of it.

		for(i=n-1; i>0; i--)
		{
			if(arr[i]>arr[i-1])
				break;
		}

		//if not found, then descending sorted
		if(i==0)
		{
			res = "Not Possible";
			return res;
		}
		else
		{
			int x = arr[i-1]; int min = i;
			//find the smallest dig right of i-1
			//greater than arr[i-1]
			for(int j= i+1; j<n; j++){
				if(arr[j]>x && arr[j]<arr[min])
					min = j;
			}

			//Swap the numbers
			char temp = arr[i-1];
			arr[i-1] = arr[min];
			arr[min] = temp;

			//Sort from ith position
			Arrays.sort(arr, i, n);
			for(i=0; i<n; i++){
				res+=arr[i]+"";
			}
			return res;
		}
	}
}