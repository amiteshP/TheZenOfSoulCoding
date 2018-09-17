/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int h = rdi.nextInt();
			int spaces = 0;
			int count = h;
			int stars;
			while(count>0){
				stars = 2*count-1;
				for(int i=0; i<spaces; i++)
					System.out.print(" ");
				for(int j=0; j<stars; j++)
					System.out.print("*");
				spaces+=1;
				count--;
			}
			System.out.println();
		}
	}
}