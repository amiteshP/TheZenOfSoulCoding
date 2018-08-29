class Graph{
	private int V;
	private LinkedList[] adjL;

	Graph(int v){
		V = v;
		adjL = new LinkedList[V];
		for(int i=0; i<V; i++){
			adjL[i] = new LinekdList<Integer>();
		}
	}

	public void addEdge(int src, int dest){
		adjL[src].add(dest);
	}

	public boolean checkCycle(){
		boolean[] visited = new boolean[V];
		boolean[] recursionStack = new boolean[V];

		for(int i=0; i<V; i++){
			if(cycleDetectorComp(i, visited, recursionStack))
				return true;
		}

		return false;
	}

	public boolean cycleDetectorComp(int i, boolean[] visited, boolean[] recursionStack)
	{
		if(recursionStack[i])	//Kind of like the GRAY color assigned during DFS
			return true;
		if(visited[i])			//Kind of like the BLACK color assigned during DFS
			return false;

		visited[i] = true;
		recursionStack[i] = true;

		Iterator<Integer> iter = adjL[i].listIterator();
		while(iter.hasNext())
		{
			if(cycleDetectorComp(iter.next(), visited, recursionStack))
				return true;
		}

		recursionStack[i] = false;

		return false;
	}
}