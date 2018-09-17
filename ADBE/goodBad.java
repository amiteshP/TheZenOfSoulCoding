/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		char[] vowels = "aeiou".toCharArray();
		char[] conso = "bcdfghjklmnpqrstvwxyz".toCharArray();
		while(t-->0){
			String str = rdi.next();
			int vow = 0;
			int con = 0;
			int res = 1;
			int maxVow = Integer.MIN_VALUE;
			int maxCon  = Integer.MIN_VALUE;
			for(int i=0; i<str.length(); i++){
				if(Arrays.asList(conso).contains(str.charAt(i)))
				{
					con++;
					if(con>maxCon)
						maxCon = con;
					if(vow>maxVow)
						maxVow = vow;
					vow = 0;
				}
				else if(Arrays.asList(vowels).contains(str.charAt(i)))
				{
					vow++;
					if(vow>maxVow)
						maxVow = vow;
					if(con>maxCon)
						maxCon = con;
					con = 0;
				}
				else
				{
					vow++;
					con++;
					if(vow>maxVow)
						maxVow = vow;
					if(con>maxCon)
						maxCon = con;
					if(maxVow>5 || maxCon>3)
					{
						res = 0;
						break;
					}
				}
			}
			if(maxVow>5 || maxCon>3)
				res = 0;
			System.out.println(res);
		}
	}
}