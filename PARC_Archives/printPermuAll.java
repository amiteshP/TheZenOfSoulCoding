//Print all permutations of a given string with and without repetitions of characters
import java.util.HashMap;

class Solution{
	private static HashMap<String, Integer> repeatMarker = new HashMap<>();
	public static void permutation(String str, boolean repetition) { 
  	  permutation("", str, repetition); 
	}

	private static void permutation(String prefix, String str, boolean repeat) {
    	int n = str.length();
	    if (n == 0){
	    	if(repeat){
	    		System.out.println(prefix);	
	    	}
	    	else
	    	{
	    		if(!repeatMarker.containsKey(prefix))
	    		{
	    			System.out.println(prefix);
	    			repeatMarker.put(prefix, 1);
	    		}
	    	}
	    } 
	   	else {
    	    for (int i = 0; i < n; i++)
        	    permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), repeat);
    	}
	}

	public static void main(String args[]){
		permutation(args[0], true);
	}
}