/**
The following problems belong to the general class of the Dutch National Flag problem
          i. Sort an array containing only 0's and 1's
          ii. Sort an array containing 0's, 1' and 2's
          iii. Separate odd/even nos in an array same with positive/negative numbers. 
**/

//For even/odd separation

class Solution{
	public static int[] filterEven(int arr[]){
		if(arr.length == 1)
			return arr;
		int lo = 0;
		int mid = lo;
		int hi = arr.length-1;
		while(mid<hi){
			int res = 0;
			if(arr[mid]%2==0)
				res = 1;
			switch(res){
				case 0:
					mid++;
					break;
				case 1:
					int temp = arr[hi];
					if(temp%2!=0)
					{
						temp = arr[mid];
						arr[mid] = arr[hi];
						arr[hi] = temp;
					}
					hi--;
					mid++;
					break;
			}
		}
		return arr;
	}

	public static void main(String args[]){
		int[] arr = {3, 2, 4, 5, 1, 2, 3};
		arr = filterEven(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}