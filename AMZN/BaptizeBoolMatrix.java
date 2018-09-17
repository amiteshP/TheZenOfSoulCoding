import java.util.HashMap;

class Solution{
	public static int[][] returnBaptizedBooleanMatrix(int r, int c, int[][] matrix){
		HashMap<Integer, Integer> hMap = new HashMap<>();
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(matrix[i][j]==1){
					if(!hMap.containsKey(i))
						hMap.put(i, j);
				}
			}
		}
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(hMap.containsKey(i) || hMap.containsValue(j))
				{
					matrix[i][j] = 1;
				}
			}
		}
		return matrix;
	}

	public static void printMatrix(int r, int c, int[][] matrix){
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static public void main(String args[]){
		int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {1, 1, 0}, {0, 0, 0}};
		printMatrix(4, 3, matrix);
		matrix = returnBaptizedBooleanMatrix(4, 3, matrix);
		printMatrix(4, 3, matrix);
	}
}