/**
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
**/


class Solution{
	int lowIn;
	int highIn;

	public static int countNum(int[] arr, int num){
		return binSearchFreq(arr, num, 0, arr.length);
	}

	public static int binSearchFreq(int[] arr, int num, int low, int high){
		//Search for First and Last occurence seperately
	}
}