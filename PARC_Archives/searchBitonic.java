//Bitonic search or the peak element in the array.

class Solution{
	public int findBitonicIndex(int[] arr){
		if(arr.length == 1)
			return arr[0];
		else
		{
			int l = 0;
			int r = arr.length-1;
			return findBitonicBinSearch(arr, l, r);
		}
	}

	public int findBitonicBinSearch(int[] arr, int l, int r){
		int mid = (int)Math.floor((l+r)/2);
		if(mid-1>=0 && arr[mid-1]<arr[mid] && mid+1<r && arr[mid+1]<arr[mid]){
			return mid;
		}
		else if(arr[mid-1]< )
	}
}