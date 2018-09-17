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

	public void addEdge(int src, int dest);
	{	
		adjL[src].add(dest);
	}

	public void BFS(int src, boolean visited[])
	{
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(src);
		visited[src] = true;

		while(!qu.isEmpty())
		{
			int curr = qu.poll();
			System.out.print(curr+" ");
			Iterator<Integer> it = curr.listIterator();
			while(curr.hasNext()){
				int currNeigh = curr.next();
				if(!visited[currNeigh])
				{
					visited[currNeigh] = true;
					qu.offer(currNeigh);
				}
			}
		}
	}

	public void DFS(int src, boolean[] visited){
		visited[src] = true;
		System.out.print(src+" ");
		Iterator<Integer> it = adjL[src].listIterator();
		while(it.hasNext())
		{
			int curr = it.next();
			if(!visited[curr])
			{
				DFS(curr, visited);
			}
		}
	}
}