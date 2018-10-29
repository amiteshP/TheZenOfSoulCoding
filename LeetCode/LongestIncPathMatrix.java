class Solution {
    public int longestIncreasingPath(int[][] matrix) {
    	if(matrix.length==0)
    		return 0;
        int[][] cache = new int[matrix.length][matrix[0].length];
        
        int maxPathVal = 0;
        for(int i=0; i<matrix.length; i++){
        	for(int j=0; j<matrix[0].length; j++){
        		maxPathVal = Math.max(dfsTraverse(matrix, cache, i, j, matrix.length, matrix[0].length, Integer.MIN_VALUE), maxPathVal);
        	}
        }
        return maxPathVal;
    }
    int[][] directions = {{0,1}, {0,-1}, {1, 0}, {-1, 0}};
    public int dfsTraverse(int[][] matrix, int[][] cache, int i, int j, int n, int m, int prevValue){
    	//Edge Cases
    	if(i<0||j<0||i>=n||j>=m||matrix[i][j]<=prevValue){
    		return 0;
    	}
    	if(cache[i][j]!=0)
    		return cache[i][j];
    	int max = Integer.MIN_VALUE;
    	//Awesome cool way to traverse directions
    	for(int[] dir: directions){
    		max = Math.max(dfsTraverse(matrix, cache, i+dir[0], j+dir[1], n, m, matrix[i][j]), max);
    	}
    	cache[i][j] = max+1;
    	return cache[i][j];
    }
}