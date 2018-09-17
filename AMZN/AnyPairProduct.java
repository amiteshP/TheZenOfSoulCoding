import java.util.HashSet;
import java.util.Set;

class Solution{
	public static boolean isPairPresent(int[] arr, int prod){
		Set<Integer> hSet = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			if(!hSet.contains(arr[i]))
			{
				hSet.add(arr[i]);
			}
			if(hSet.contains(prod/arr[i]))
				return true;
		}
		return false;
	}
	static public void main(String args[]){
		int[] arr = {10, 20, 9, 40};
		int prod = 366;
		System.out.println(isPairPresent(arr, prod));
	}
}