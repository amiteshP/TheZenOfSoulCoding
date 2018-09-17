class Solution{
	public static String returnLowestNum(String num, int d){
		StringBuilder res = new StringBuilder();
		if(num.length()==0 || (d>=num.length()))
			return res.toString();
		for(int i=0; i<num.length(); i++){
			int min = Integer.MAX_VALUE;
			int minIndex = i;
			for(int j=0; j<d; j++){
				if((i+j<num.length()) && Integer.parseInt(String.valueOf(num.charAt(i+j)))<min)
				{
					min = Integer.parseInt(String.valueOf(num.charAt(i+j)));
					minIndex = i+j;
				}
			}
			res.append(min+"");
			i = minIndex;
		}
		return res.toString();
	}
	static public void main(String args[]){
		String num  = "4325043";
		int d = 2;
		System.out.println(returnLowestNum(num, d));
	}
}