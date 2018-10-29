import java.util.*;

class Topological{
	static LinkedList[] adjL;
	static int V;
	Topological(int num){
		V = num;
		adjL = new LinkedList[V];
		for(int i=0; i<V; i++){
			adjL[i] = new LinkedList<Integer>();
		}
	}

	public static void addEdge(int src, int dest){
		adjL[src].add(dest);
	}

	static public void main(String args[]){
		Topological gr = new Topological(6);
		gr.addEdge(2, 3);
		gr.addEdge(5, 2);
		gr.addEdge(5, 0);
		gr.addEdge(4, 0);
		gr.addEdge(4, 1);
		gr.addEdge(3, 1);

		gr.sortTopological();
	}

	public static void sortTopological(){
		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);

		Stack<Integer> st = new Stack<>();

		for(int i=0; i<V; i++){
			if(!visited[i])
				sortUtil(i, visited, st);
		}
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
		System.out.println();
	}

	public static void sortUtil(int i, boolean[] visited, Stack<Integer> st)
	{
		visited[i] = true;

		Iterator<Integer> it = adjL[i].listIterator();

		while(it.hasNext())
		{
			int curr = it.next();
			if(!visited[curr])
				sortUtil(curr, visited, st);
		}

		st.push(i);
	}
}