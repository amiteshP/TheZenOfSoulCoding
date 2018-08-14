class Solution {
    public int calPoints(String[] ops) {
 		Stack<Integer> st = new Stack<>();
 		int sum = 0;
 		for(int i=0; i<ops.length; i++){
 			if(ops[i] == "+")
 			{
 				int l1 = st.pop();
 				int l2 = st.pop();
 				sum+=l1+l2;
 				st.push(l2);
 				st.push(l1);
 				st.push(sum);
 			}
 			else if(ops[i] == "D")
 			{
 				int l1 = st.pop();
 				sum+=(2*l1);
 				st.push(l1);
 				st.push(sum);
 			}
 			else if(ops[i] == "C")
 			{
 				sum = st.pop();
 				int l1 = st.pop();
 				sum-=l1;
 				st.push(sum);
 			}
 			else
 			{
 				st.push(Integer.parseInt(ops[i]));
 				sum+=Integer.parseInt(ops[i]);
 			}
 		}
 		return sum;
    }
}