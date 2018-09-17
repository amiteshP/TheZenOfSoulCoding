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
			List<String> arrL = new ArrayList<>();
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i)=='.')
				{
					arrL.add(sb.toString());
					sb = new StringBuffer();
				}
				else
				{
					sb.append(str.charAt(i));
				}
			}
			Collections.reverse(arrL);
			StringBuilder sb2 = new StringBuilder();
			for(String str2: arrL)
			{
				sb.append(str2);
				sb.append(".");
			}
			System.out.println(sb.toString());
		}
	}
}