import java.util.*;

class applyEquation{
	static public void main(String args[]){
		int[] arr = {-21, -15, 12, 13, 14};
		int n = arr.length;
		int A = -6; int B = -7; int C = 2;

	}

	sortArray(arr, n, A, B, C);

	public static void sortArray(int[] arr, int n, int A, int B, int C){
		for(int i=0; i<n; i++){
			arr[i] = A*arr[i]*arr[i]+B*arr[i]+C;
		}

		//Find max element
		int in = -1;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			if(max<arr[i])
			{
				in = i;
				max = arr[i];
			}
		}
		int i=0; int j =n-1;
		int[] new_arr = new int[n];
		int k =0 ;
		while(i<in && j>in){
			
		}
	}
}