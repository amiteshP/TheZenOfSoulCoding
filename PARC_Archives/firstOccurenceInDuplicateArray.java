// Find the first occurrence of an element in a sorted array which contains duplicate elements. 

class Solution{
	public static int returnDesiredIndex(int[] arr, int num){
		int l = 0;
		int r = arr.length-1;

		int ind = binSearch(arr, num, l, r);
		int c = ind;
		while(c-1>=0)
		{
			if(arr[c-1]==arr[c])
			{
				ind = c-1;
				c--;
			}
			else
				break;
		}
		/**
			For Last Occurrence
			while(c+1<=r)
			{
				if(arr[c+1]==arr[c])
				{
					ind = c+1;
					c++;
				}
				else
					break;
			}
		**/
		return ind;
	}
	public static int binSearch(int[] arr, int num, int l, int r){
		int mid = (int)Math.floor((l+r)/2);
		if(arr[mid] == num)
			return mid;
		else if(arr[mid]>num)
			return binSearch(arr, num, l, mid-1);
		else
			return binSearch(arr, num, mid, r);
	}
	public static void main(String args[]){
		int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8, 9, 9};
		System.out.println(returnDesiredIndex(arr, Integer.parseInt(args[0])));
	}
}