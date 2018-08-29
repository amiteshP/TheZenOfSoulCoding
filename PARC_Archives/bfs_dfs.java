import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

class Graph{
	private int V;
	private LinkedList[] adjL;

	Graph(int v){
		V = v;
		adjL = new LinkedList[V];
		for(int i=0; i<V; i++){
			adjL[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int src, int dest){
		adjL[src].add(dest);
	}

	public void bfs(int src){
		Queue<Integer> qu = new LinkedList<>();
		boolean[] visited = new boolean[V];
		visited[src] = true;
		qu.offer(src);
		while(!qu.isEmpty())
		{
			int currV = qu.poll();
			System.out.print(currV+" ");
			Iterator<Integer> iter = adjL[currV].listIterator();
			while(iter.hasNext())
			{
				int curri = iter.next();
				if(!visited[curri])
					{
						visited[curri] = true;
						qu.offer(curri);
					}
			}
		}
	}

	boolean[] dfsVisited = new boolean[V];
	public void dfs(int src){
		dfsVisited[src] = true;
		System.out.print(src+" ");
		Iterator<Integer> iter = adjL[src].listIterator();
		while(iter.hasNext()){
			int curri = iter.next();
			if(!dfsVisited[curri])
				dfs(curri);
		}
	}
}