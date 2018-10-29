class Solution {
    public int peakIndexInMountainArray(int[] A) {
    	if(A.length==3)
    		return 1;
        return binSearchPeak(A, 0, A.length);
    }
    public int binSearchPeak(int[] arr, int low, int high){
    	int mid = low + (high-low)/2;
    	if(mid>0 && arr[mid]>arr[mid-1] && mid<arr.length-1 && arr[mid]>arr[mid+1])
    	{
    		return mid;
    	}
    	else if(mid+1<arr.length && arr[mid]<arr[mid+1])
    	{
    		return binSearchPeak(arr, mid+1, high);
    	}
    	else if(mid-1>=0)
    	{
    		return binSearchPeak(arr, low, mid-1);
    	}
    	return 1;
    }
}