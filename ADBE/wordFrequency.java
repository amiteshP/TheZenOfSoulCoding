/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int sl = rdi.nextInt();
			int max = 1;
			HashMap<String, Integer> hMap = new HashMap<>();
			for(int i=0; i<sl; i++){
				String st = rdi.next();
				if(hMap.containsKey(st))
					{
						hMap.put(st, hMap.get(st)+1);
						if(max<hMap.get(st))
							max = hMap.get(st);
					}
				else
					hMap.put(st, 1);
			}
			TreeSet<String> tSet = new TreeSet<>();
			for(String stt: hMap.keySet()){
				if(hMap.get(stt)==max)
					tSet.add(stt);
			}
			System.out.println(tSet.first());
		}
	}
}