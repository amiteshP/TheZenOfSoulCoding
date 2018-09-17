import java.util.Scanner;

class Solution{
	public static int[] rotateArray(int[] arr, int d){
		int[] rotArr = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			int ind = i-d;
			if(ind<0)
				rotArr[arr.length+ind] = arr[i];
			else
				rotArr[ind] = arr[i];
		}
		return rotArr;
	}

	static public void main(String args[]){
		int[] arr = {2, 3, 4, 5, 6};
		int d = 0;
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr = rotateArray(arr, d);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}