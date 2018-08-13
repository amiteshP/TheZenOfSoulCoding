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
			String a = rdi.next();
			String b = rdi.next();
			String s = a+a;
			if(a.length()!=b.length())
				System.out.println(0);
			else{
				int res = s.contains(b)?1:0;
				System.out.println(res);	
			}
		}
	}
}