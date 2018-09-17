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
			int num = rdi.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = rdi.nextInt();
			}
			int res = findGivenElement(arr, n, num);
			if(res==-1)
				System.out.println("OOPS! NOT FOUND");
			else
				System.out.println(res);
		}
	}

	public static int findGivenElement(int[] arr, int n, int key)
	{
		int pivot = findPivot(arr, 0, n-1);

		//if no pivot
		//then no bitonic seq
		if(pivot==-1)
			return binSearch(arr, 0, n-1, key);

		//if pivot found
		//compare and search
		if(arr[pivot] == key)
			return pivot;
		if(arr[0]<=key)
			return binSearch(arr, 0, pivot-1, key);
		else
			return binSearch(arr, pivot+1, n-1, key);

	}

	public static int findPivot(int[] arr, int l, int r)
	{
		if(r<l)
			return -1;
		if(l==r)
			return l;

		int mid = (l+r)/2;
		if(mid<r && arr[mid]>arr[mid+1])
			return mid;
		if(mid>l && arr[mid]<arr[mid-1])
			return (mid-1);
		if(arr[l]>=arr[mid])
			return findPivot(arr, l, mid-1);
		return findPivot(arr, mid+1, r);
	}

	public static int binSearch(int[] arr, int l, int r, int key){
		if(l>r)
			return -1;

		int mid = (l+r)/2;
		if(arr[mid] == key)
			return mid;
		if(key>arr[mid])
			return binSearch(arr, mid+1, r, key);
		else
			return binSearch(arr, 0, mid-1, key);
	}
}