import java.util.Scanner;

class Solution{
	public static void printPattern(){

	}

	public static boolean rotationOfEachOther(String a, String b){
		a+=a;
		return a.contains(b);
	}

	public static String findMostFrequentWord(int[] arr){
		
		HashMap<String, Integer> hMap = new HashMap<>();

		PriorityQueue<String> pq = new PriorityQueue<>(new FrequentStringComparator());
	}

	public static int productMaxMinTwoArrays(int[] arr, int[] brr){
		Arrays.sort(arr);
		Arrays.sort(brr);
		return arr[arr.length()-1]*brr[0];
	}

	public static String returnWinCandy(String[] arr){
		HashMap<String, Integer> hMap = new HashMap<>();
		for(String str: arr){
			if(!hMap.containsKey(str)){
				hMap.put(str, 0);
			}
			else
				hMap.put(str, hMap.get(str)+1);
		}
		int countMax = 0;
		
	}

	public static void printAllPermutations(String str){
		printRepeatedPermutations("", str);
	}

	private void printRepeatedPermutations(String prefix, String str){
		int n = str.length();
		if(n==0)
			System.out.println(prefix);
		else
		{
			for(int i=0; i<n; i++)
			{
				printRepeatedPermutations(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
			}
		}
	}

	public static boolean checkAnagram(String a, String b){
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		return(ac.equals(bc));
	}

	public static void traverseHashMap(HashMap<String, Integer> hMap){
		Iterator<> it = hMap.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry entryPair = (Map.Entry)it.next();
			System.out.println(entryPair.getKey()+"  "+entryPair.getValue());
		}
	}

	public static void printAllInterleavings(String a, String b){
		printAllInterleavings(a, b, "");
	}

	private void printAllInterleavings(String a, String b, String interleavings){
		if(a==null)
			System.out.println(b);
		if(b==null)
			System.out.println(a);
		if(a.length()==0 && b.length()==0)
			System.out.println(interleavings);
		if(a.length()!=0)
		{
			printAllInterleavings(a.substring(1), str2, interleavings+a.charAt(0));
		}
		if(b.length()!=0)
		{
			printAllInterleavings(a, b.substring(1), interleavings+b.charAt(0));
		}
	}

	public static boolean checkIfStringIsInterleavingOfAnother(String a, String b){
		return checkInterleving(a, b, "", a);
	}
	
	private boolean checkInterleaving(String str1, String str2, String interleaving, String target){
		if(str1==null){
			if(str1.equals(target))
				return true;
		}
		if(str2==null){
			if(str2.equals(target))
				return true;
		}
		if(str1.length()==0 && str23.length()==0)
			if(interleavings.equals(target))
				return true;

		if(str1.length()!=0)
			checkInterleaving(str1.substring(1), str2, interleaving+str1.charAt(0));
		if(str2.length()!=0)
			checkInterleaving(str1, str2.substring(1), interleaving+str2.charAt(0));

		return false;
	}

	public static char[] maxminOccurChar(String str){
		HashMap<Character, Integer> hMap = new HashMap<>();
		char[] res = new char[2];
		for(int i=0; i<str.length(); i++){
			if(hMap.getKey(str.charAt(i))!=null)
				hMap.put(str.charAt(i), hMap.get(i)+1);
			else
				hMap.put(str.charAt(i), 1);
		}
		Iterator it = hMap.entrySet().iterator();
		int maxCount = Integer.MIN_VALUE;
		char maxOccur='';
		int minCount = Integer.MAX_VALUE;
		char minOccur='';
		while(it.hasNext){
			MapEntry entryPair = (MapEntry)it.next();
			if(entryPair.getValue()>maxCount)
			{
				maxCount = entryPair.getValue();
				maxOccur = entryPair.getKey();
			}
			if(entryPair.getValue()<minCount)
			{
				minCount = entryPair.getValue();
				minOccur = entryPair.getKey();
			}
		}
		res[0] = minOccur;
		res[1] = maxOccur;
		return res;
	}

	public static String removeDuplicatesFromString(String str){
		Map<Character, Integer> hMap = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++){
			hMap.put(str.charAt(i), 0);
		}
		StringBuilder sb = new StringBuilder();
		Iterator it = hMap.entrySet().iterator();
		while(it.hasNext())
		{
			MapEntry entryPair = (MapEntry)it.next();
			sb.append(entryPair.getkey());
		}
		return sb.toString();
	}

	public static char returnFirstNonRepeating(String str){
		Map<Character, Integer> hMap = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++){
			if(hMap.getKey(str.charAt(i))!=null)
				hMap.put(str.charAt(i), hMap.get(i)+1);
			else
				hMap.put(str.charAt(i), 1);
		}
		Iterator it = hMap.entrySet().iterator();
		char res = '';
		while(it.hasNext())
		{
			MapEntry entryPair = (MapEntry)it.next();
			if(entryPair.getValue()==1)
			{
				res = entryPair.getKey();
				break;
			}
		}
		return res;
	}

	public static String returnLongestPalindromicSubstring(String str){
		char[] cstr = str.toCharArray();
		
	}

	public static int longestCommonSubsequenceLength(String a, String b){
		int m = a.length();
		int n = b.length();

		int[][] lcs_matrix = new int[m+1][n+1];
		for(int i=0; i<m+1; i++){
			for(int j=0; j<n+1; j++){
				if(i==0||j==0)
					dp[i][j] = 0;
				else if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j]+=1+dp[i-1][j-1];
				}
				else
				{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}

	public static void printLCSFromMatrix(int[][] lcs_matrix, String a, String b){
		int m = lcs_matrix.length;
		int n = lcs_matrix[0].length;
		StringBuilder sb = new StringBuilder();
		int index = lcs_matrix[m][n];
		int temp = index;
		char[] lcs = new char[index+1];
		lcs[index] = '';

		int i = m, j=n;
		while(i>0 && j>0){
			if(a.charAt(i-1)==b.charAt(j-1))
			{
				lcs[index-1] = a.charAt(i-1);
				i--;
				j--;
				index--;
			}
			else if(L[i-1][j]>L[i][j-1])
				i--;
			else
				j--;
		}
		for(int k=0; k<=temp; k++){
			System.out.println(lcs[k]);
		}
	}

}


class FrequentStringComparator implements Comparator(String a, String b){
	
}

class TrieImplementation{

	static final int SIZE = 26;
	class TrieNode{
		TrieNode[] children = new TrieNode[SIZE];
		boolean isEndOfWord;
		TrieNode(){
			isEndOfWord = false;
			for(int i=0; i<SIZE; i++){
				children[i] = null;
			}
		}
	}
	static TrieNode root;
	
}

public class FullProblems{
	public static void main(String args[]){
		Scanner rdi = new Scanner(System.in);
		
	}
}

