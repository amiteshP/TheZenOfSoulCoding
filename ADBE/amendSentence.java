/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			String str = rdi.next();
			char[] strc = str.toCharArray();
			StringBuilder sb = new StringBuilder();

			for(int i=0; i<strc.length; i++){
				if(i==0)
					sb.append(Character.toLowerCase(strc[i]));
				else if(Character.isUpperCase(strc[i]))
				{
					sb.append(" ");
					sb.append(Character.toLowerCase(strc[i]));
				}
				else
					sb.append(strc[i]);
			}
			System.out.println(sb.toString());
		}
	}
}