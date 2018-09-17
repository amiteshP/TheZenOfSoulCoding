/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int x = rdi.nextInt();
			int l = rdi.nextInt();
			int r = rdi.nextInt();
			int y = rdi.nextInt();

			if(l<1 || r>32)
				return;

			int maskLen = (1<<(r-l+1))-1;
			int mask = (maskLen<<(l-1))&y;
			x = x|mask;
			System.out.println(x);
		}
		/**while(t-->0){
			int x = rdi.nextInt();
			int l = rdi.nextInt();
			int r = rdi.nextInt();
			int y = rdi.nextInt();

			for(int i=l; i<=r; i++){
				if(l<1 || r>32)
					return;
				int mask = 1<<(i-1);

				if((y & mask)==1)
					x = x|mask;
			}
			System.out.println(x);
		}**/
	}
}