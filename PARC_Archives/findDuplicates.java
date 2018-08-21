//Find the number of duplicate elements in the array.

class Solution{
	public static int findNumDuplicates(int[] arr){
		if(arr.length == 1)
			return 0;
		else
		{
			int dupCount = 0;
			int num = arr[0];
			for(int i=1; i<arr.length; i++)
			{
				arr[i]^=num;
				if(arr[i]==num)
					dupCount++;
				else
					dupCount--;
				num = arr[i];
			}
			return dupCount;
		}
	}
	public static void main(String args[]){
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 2, 3, 3, 4, 2, 8, 9};
		System.out.println(findNumDuplicates(arr));		
	}
}