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
			Stack<Integer> st = new Stack<>();
			int root = Integer.MIN_VALUE;
			int res = 1;
			for(int i=0; i<n; i++){
				if(arr[i]<root)
					{
						res = 0;
						break;
					}
				while(!st.empty() && st.peek()<arr[i])
				{
					root = st.peek();
					st.pop();
				}
				st.push(arr[i]);
			}
			System.out.println(res);
		}
	}
}