class Solution{
	public static int returnRightmostBit(int num){
		if(num==0)
			return -1;
		
		int pos = 1;
		int xorm = 1;

		while((xorm&num)==0)
		{
			xorm>>=1;
			pos++;
		}

		return pos;
	}
}