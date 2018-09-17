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
			char[] arr = (num+"").toCharArray();
			String res = "Yes";
			for(int i=0; i<arr.length/2; i++){
				if(arr[i]!=arr[arr.length-i-1])
				{
					res = "No";
					break;
				}
			}
			System.out.println(res);
		}
	}
}