/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int n = rdi.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			//Input numbers and remove duplicates
			for(int i=0; i<n; i++){
				int inp = rdi.nextInt();
				if(!arr.contains(inp))
					arr.add(inp);
			}
			int targetSum = rdi.nextInt();
			int[] arrL = new int[arr.size()];
			for(int i=0; i<arr.size(); i++){
				arrL[i] = arr.get(i);
			}
			//Sort 
			Arrays.sort(arrL);
			ArrayList<ArrayList<Integer>> res = findSumCombinations(arrL, targetSum);
			for(ArrayList<Integer> arr2 : res){
				for(int i: arr2)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static ArrayList<ArrayList<Integer>> res;
	public static ArrayList<Integer> r;
		
	public static ArrayList<ArrayList<Integer>> findSumCombinations(int[] arr, int sum){
		res = new ArrayList<>();
		r = new ArrayList<>();
		findNumbers(arr, sum, res, r, 0);
		return res;
	}

	public static void findNumbers(int[] arr, int sum, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> r, int i)
	{
		if(sum<0)
			return;

		if(sum==0){
			res.add(r);
			return;
		}

		while(i<arr.length && sum-arr[i]>=0)
		{
			r.add(arr[i]);
			findNumbers(arr, sum-arr[i], res, r, i);
			r.remove(new Integer(arr[i]));
			i++;
		}
	}

}