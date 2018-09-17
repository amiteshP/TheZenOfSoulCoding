import java.util.Stack;

class Solution{
	public static int[] returnLeftSmallest(int[] inp){
		int[] res = new int[inp.length];
		Stack<Integer> st = new Stack<>();

		for(int i=0; i<inp.length; i++){
			while(!st.isEmpty() && st.peek()>=inp[i])
			{
				st.pop();
			}
			if(st.isEmpty())
				res[i] = -1;
			else
				res[i] = st.peek();
			st.push(inp[i]);
		}

		return res;
	}

	public static void main(String args[]){
		int[] arr = {1, 4, 3, 6, 5, 7};
		arr = returnLeftSmallest(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}