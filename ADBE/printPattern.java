/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int n = rdi.nextInt();
			int[][] res = new int[n*2-1][n*2-1];
			for(int i=0; i<n*2-1; i++){
				for(int j=0; j<n*2-1; j++){
					res[i][j] = 1 + (Math.abs(n-i-1)>Math.abs(n-j-1)?Math.abs(n-i-1):Math.abs(n-j-1));
				}
			}
			printArray(res, n);
		}
	}

	public static void printArray(int[][] arr, int n){

		for(int i=0; i<n*2-1; i++){
			for(int j=0; j<n*2-1; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}