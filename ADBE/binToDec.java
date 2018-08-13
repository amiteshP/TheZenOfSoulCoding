/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			String a = rdi.next();
			char[] ac = a.toCharArray();
			int dec = 0;
			for(int i=a.length()-1; i>=0; i--){
				if(ac[i]-'0'==1){
					dec+= Math.pow(2, a.length()-i-1);
				}
			}
			System.out.println(dec);
		}
	}
}