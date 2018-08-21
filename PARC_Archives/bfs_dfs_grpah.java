//BFS-DFS : GRAPH
import java.util.*;

class Graph{
	private int V;
	private LinkedList<Integer> adjL[];

	Graph(int V){
		this.V = V;
		adjL = new LinkedList[V];
		for(int i=0; i<V; i++){
			adjL[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int v, int w)
	{
		adjL[v].add(w);
	}

    void BFS(int s)
    {

        boolean visited[] = new boolean[V];
 
        Queue<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.offer(s);
 
        while (!queue.isEmpty())
        {

            s = queue.poll();
            System.out.print(s+" ");
 
            Iterator<Integer> i = adjL[s].listIterator();

            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.offer(n);
                }
            }
        }
    }

    boolean[] dfsVisits = new boolean[V];

    void DFS(int src, boolean[] dfsVisits){
        
        dfsVisits[src] = true;
        System.out.print(src + " ");
        Iterator<Integer> i = adjL[s].listIterator();
        while(i.hasNext()){
            int curr = i.next();
            if(!dfsVisits[curr])
            {
                DFS(curr, dfsVisits);
            }
        }
    }

}