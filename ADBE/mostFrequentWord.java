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
			HashMap<String, Integer> hMap = new HashMap<>();
			int winVal = Integer.MIN_VALUE;
			String winCandidate = "";
			for(int i=0; i<num; i++){
				String candidate = rdi.next();
				if(hMap.get(candidate)!=null)
				{
					hMap.put(candidate, hMap.get(candidate)+1);
				}
				else
					hMap.put(candidate, 1);
				if(hMap.get(candidate)>winVal)
				{
					winVal = hMap.get(candidate);
					winCandidate = candidate;
				}
				else if(hMap.get(candidate)==winVal)
				{
					if(winCandidate.compareTo(candidate)>0)
						winCandidate = candidate;
				}

			}
			System.out.println(winCandidate);
		}
	}
}