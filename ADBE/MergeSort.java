import java.util.Scanner;

class MergeSort{
	
	//Splits the array recursively
	public static void sort(int[] arr, int l, int r){
		if(l<r)
		{
			int m = (l+r)/2;
			
			sort(arr, l, m);
			sort(arr, m+1, r);

			merge(arr, l, m, r);	
		}
	}

	//Merges the array parts
	public static void merge(int[] arr, int l, int m, int r){
		int n1 = m-l+1;
		int n2 = r-m;

		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; i++){
			L[i] = arr[l+i];
		}
		for(int i=0; i<n2; i++){
			R[i] = arr[m+i+1];
		}

		int i = 0;
		int j = 0;
		int k = l;

		while(i<n1 && j<n2){
			if(L[i]<=R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while(i<n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int n = rdi.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = rdi.nextInt();
		}
		
		printArray(arr);

		sort(arr, 0, arr.length-1);

		printArray(arr);
	}

	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}