/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();

		while(t-->0){
			int srcI =0 ;int srcJ = 0;
			int n = rdi.nextInt();
			int[][] arr = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					int cell = rdi.nextInt();
					arr[i][j] = cell;
					if(cell==1)
					{
						srcI = i; srcJ = j;
					}
				}
			}
			System.out.println(pathExists(srcI, srcJ, n, arr));
		}
	}

	public static boolean pathExists(int srcI, int srcJ, int n, int[][] arr){
		{
			if(srcI<0 || srcI>n-1 || srcJ<0 || srcJ>n-1 || arr[srcI][srcJ] == 0)return false;
			else
				if(arr[srcI][srcJ] == 2)return true;
			if(pathExists(srcI, srcJ+1, n, arr)||pathExists(srcI, srcJ-1, n, arr)||pathExists(srcI-1, srcJ, n, arr)||pathExists(srcI+1, srcJ, n, arr))
				return true;
			return false;
		}
	}
}