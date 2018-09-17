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
			int maxInt = Integer.MIN_VALUE;
			int temp;
			for(int i=0; i<num; i++){
				temp = rdi.nextInt();
				if(temp>maxInt)
					maxInt = temp;
			}
			num = rdi.nextInt();
			int minInt = Integer.MAX_VALUE;
			for(int i=0; i<num; i++){
				temp = rdi.nextInt();
				if(temp<minInt)
					minInt = temp;
			}
			System.out.println(maxInt*minInt);
		}
	}
}