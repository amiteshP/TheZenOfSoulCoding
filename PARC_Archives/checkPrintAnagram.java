//Check if two strings are anagrams of each other. Print all anagrams of a given string.
import java.util.Arrays;

class Solution{
	public static boolean checkAnagram(String str, String str2){
		if(str.length()!=str2.length())
			return false;
		char[] a = str.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0; i<str.length(); i++){
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

	public static void printAllAnagrams(String str){
		//Just like printing permutations.
		permutation("", str);
	}

	private static void permutation(String prefix, String str){
		if(str.length()==0)
		{
			System.out.println(prefix);
		}
		else
		{
			for(int i=0; i<str.length(); i++){
				permutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, str.length()));
			}
		}
	}

	static public void main(String args[]){
		System.out.println(checkAnagram("Amitesh", "timeAsh"));
		printAllAnagrams(args[0]);
	}
}