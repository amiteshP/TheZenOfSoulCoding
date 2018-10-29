class Solution {
    public static String longestPalindrome(String s) {
 		int n = s.length();
 		int longBeg = 0;
 		int maxLen = 1;
 		boolean[][] tab = new boolean[n][n];
 		//Base case i==j
 		for(int i=0; i<n; i++){
 			tab[i][i] = true;
 		}       
 		//Base case S(charAt[i])==S(charAt[i+1])
 		for(int i=0; i<n-1; i++){
 			if(s.charAt(i)==s.charAt(i+1))
 			{
 				tab[i][i+1] = true;
 				longBeg = i;
 				maxLen = 2;
 			}
 		}
 		//Now DP
 		for(int len = 3; len<=n; len++){
 			for(int i=0; i<n-len+1; i++){
 				int j = i+len-1;
 				if(s.charAt(i)==s.charAt(j) && tab[i+1][j-1])
 				{
 					tab[i][j] = true;
 					longBeg = i;
 					maxLen = len;
 				}
 			}
 		}
 		return s.substring(longBeg, maxLen);
    }
    public static void main(String args[]){
    	System.out.println(longestPalindrome("abcdeffedgrteret") + (new StringBuilder(longestPalindrome("abcdeffedgrteret")).reverse().toString()));
    }
}