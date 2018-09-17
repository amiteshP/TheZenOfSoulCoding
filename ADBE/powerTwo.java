/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			long num = rdi.nextLong();
			if((num & (num-1)) == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}