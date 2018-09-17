class minBinSearch{
	static public void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		int t = rdi.nextInt();
		while(t-->0){
			int n = rdi.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = rdi.nextInt();
			}
			System.out.println(binSearch(arr, 0, n));
		}
	}

	public static int binSearch(int[] arr, int l, int r){
		int mid =(l+r)/2;
		if(mid>0 && arr[mid-1]>arr[mid] && arr[mid+1] >mid)
			return arr[mid];
		else if(mid == 0 && arr[mid+1]>arr[mid])
			return arr[0];
		else return binSearch(arr, l, mid);

		return binSearch(arr, mid+1, r);
	}
}