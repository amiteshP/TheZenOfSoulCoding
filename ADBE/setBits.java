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
			int count = 0;
			while(num>0){
				count+= num & 1;
				num = num>>1;
			}
			System.out.println(count);	
		}
	}
}