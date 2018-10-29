class Solution {//extends SolBase{
	public static void main(String args[]){
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(expectedValueEquiprobableSet(arr));
		System.out.println(rand10());
	}
	public static double expectedValueEquiprobableSet(int[] arr){
		double res = 0;
		for(int i=0; i<arr.length; i++){
			res+=arr[i];
		}
		res*=(1.0/arr.length);
		return res;
	}

	public int rand10(){
		int x, y;
		int[][] rand10range = new int[7][7];
		int fill = 1;
		for(int i=0; i<7; i++)
			for(int j=0; j<7; j++){
				if(fill>10)
					fill%=10;
				rand10range[i][j] = fill;
			}
		x = rand7();
		y = rand7();
		
	}

}