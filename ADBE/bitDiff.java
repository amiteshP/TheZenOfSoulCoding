/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int a = rdi.nextInt();
			int b = rdi.nextInt();
			int flip = 0;
			int ab = a^b;
			while(ab>0)
			{
				if((ab&1) == 1)
					flip++;
				ab = ab>>1;
			}
			System.out.println(flip);
		}
	}
}