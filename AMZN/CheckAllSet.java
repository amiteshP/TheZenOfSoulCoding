class Solution{
	public static boolean checkAllSet(int n){
		if(n==0)
		{
			return false;
		}
		else
		{
			return (((n+1)&n) == 0);
		}
	}

	static public void main(String args[]){
		System.out.println(checkAllSet(6));
		System.out.println(checkAllSet(1));
		System.out.println(checkAllSet(7));
	}
}