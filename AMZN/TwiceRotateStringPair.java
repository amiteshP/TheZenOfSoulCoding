class Solution{

	public boolean twiceRotated(String a, String b, int times){
		if(a.length()!=b.length())
			return false;
		return (isRotatedClockwise(a, b, times)|| isRotatedAntiClockwise(a, b, times));
	}

	private boolean isRotatedAntiClockwise(String str, String str2, int times){
		StringBuilder sb = new StringBuilder(str);
		sb.append(sb.substring(0, times));
		return (sb.substring(times, sb.length()).toString().equals(str2));
	}


	private boolean isRotatedClockwise(String str, String str2, int times){
		StringBuilder sb = new StringBuilder(str);
		sb.insert(0, sb.substring(sb.length()-times, sb.length()));
		return (sb.substring(0, str2.length()).toString() == str2);
	}

	public static void main(String args[]){
		Solution sol = new Solution();
		System.out.println(sol.twiceRotated("AMAZON", "AZONAM", 2));
	}
}