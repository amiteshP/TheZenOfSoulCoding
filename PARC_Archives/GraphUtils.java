class Graph{
	private int V;
	private LinkedList[] adjL;

	Grpah(int num){
		V = num;
		adjL = new LinkedList[V];
		for(int i=0; i<V; i++){
			adjL[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int src, int dest){
		adjL[src].add(dest);
	}

	public void BFSTraversal(int src){
		Queue<Integer> qu = new LinkedList<>();
		boolean[] visited = new boolean[V];
		qu.offer(src);
		visited[src] = true;
		while(!qu.isEmpty()){
			int currVertex = qu.poll();
			Iterator<Integer> it = adjL[currVertex].listIterator();
			while(it.hasNext())
			{
				int currVertex = it.next();
				System.out.print(currVertex+" ");
				if(!visited[currVertex])
				{
					queue.offer(currVertex);
					visited[currVertex] = true;
				}
			}
		}
	}

	private void DFSTraversalUtil(int src, boolean[] visited){
		visited[src] = true;
		System.out.print(src+" ");
		Iterator<Integer> it = adjL[src].listIterator();
		while(it.hasNext())
		{
			int currVertex = it.next();
			if(!visited[currNext])
				DFSTraversalUtil(currVertex, visited);
		}
	}

	public void DFSTraversal(int src){
		boolean[] visited = new boolean[V];
		DFSTraversalUtil(src, visited);
	}

	public void DFSTraversalDisconnected(){
		boolean visited[] = new boolean[V];
		for(int i=0; i<V; i++){
			if(!visited[i])
				DFSTraversalUtil(i, visited);
		}
	}

	public boolean isCyclicDirected(){
		boolean[] recStack = new boolean[V];
		boolean[] visited = new boolean[V];

		for(int i=0; i<V; i++){
			if(isCyclicUtil(i, visited, recStack))
				return true;
		}
		return false;
	}

	private boolean isCyclicDirectedUtil(int ver, boolean[] visited, boolean[] recStack){
		if(recStack[ver])
			return true;
		if(visited[ver])
			return false;
		recStack[ver] = true;
		visited[ver] = true;

		Iterator<Integer> it = adjL[ver].listIterator();
		while(it.hasNext())
		{
			int currVertex = it.next();
			isCyclicUtil(currVertex, visited, recStack);
		}
		recStack[ver] = false;
		return false;
	}

	public boolean isCyclicUndirected(){
		boolean[] visited = new boolean[V];

		for(int i=0; i<V; i++){
			if(visited[i]==false && isCyclicUndirectedUtil(i, visited, -1))
				return true;
		}
		return false;
	}

	private boolean isCyclicUndirectedUtil(int ver, boolean[] visited, int parent){
		visited[ver] = true;
		int i;

		Iterator<Integer> it = adjL[ver].listIterator();
		while(it.hasNext()){
			i = it.next();
			if(!visited[i])
			{
				if(isCyclicUndirectedUtil(i, visited, ver))
					return true;
			}
			else if(i!=parent)
				return true;
		}
		return false;
	}

	public void colorGraphGreedy(){
		int result[] = new int[V];
		Arrays.fill(result, -1);
		result[0] = 0;
		boolean[] available = new boolean[V];
		Arrays.fill(available, true);
		for(int i =1; i<V; i++){
			Iterator<Integer> it = adjL[i].listIterator();
			while(it.hasNext()){
				int j = it.next();
				if(result[j]!=-1){
					available[result[j]] = false;
				}
			}
			int color;
			for(color=0; color<V; color++){
				if(available[color])
					break;
			}
			result[i] = color;
			Arrays.fill(available, false);
		}
		for(int i=0; i<V; i++){
			System.out.println("Vertex: "+i+" Color: "+result[i]);
		}
	}


	public Graph getReverse(){
		Graph g = new Graph(V);
		for(int i=0; i<V; i++){
			Iterator<Integer> it = adjL[i].listIterator();
			while(it.hasNext()){
				int currVertex = it.next();
				g.adjL[currVertex].add(i);
			}
		}
		return g;
	}

	public void fillOrder(int v, boolean[] visited, Stack<Integer> st){
		visited[v] = true;
		Iterator<Integer> it = adjL[v].listIterator();
		while(it.hasNext()){
			int currVertex = it.next();
			if(!visited[currVertex])
				fillOrder(currVertex, visited, st);
		}
		st.push(new Integer(v));
	}

	//Kosaraju's Algorithm for Strongly Connected Components
	public void printSCC(){
		Stack st = new Stack();

		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);

		for(int i=0; i<V; i++){
			if(!visited[i])
				fillOrder(i, visited, st);
		}

		Graph gr = getReverse();

		Arrays.fill(visited, false);

		while(st.empty()==false)
		{
			int v = (int)st.pop();

			if(!visited[v])
			{
				gr.DFSTraversalUtil(v, visited);
				System.out.println();
			}
		}
	}

	public void topologicalSortUtil(int v, boolean[] visited, Stack st){
		visited[v] = true;

		Iterator<Integer> it = adjL[v].listIterator();
		while(it.hasNext()){
			int currVertex = it.next();
			if(!visited[currVertex])
				topologicalSortUtil(currVertex, visited, st);
		}
		st.push(new Integer(v));
	}

	public void topologicalSort(){
		Stack st = new Stack();

		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);

		for(int i=0; i<V; i++){
			if(!visited[i])
				topologicalSortUtil(i, visited, st);
		}

		while(!st.empty())
		{
			System.out.print(st.pop()+" ");
		}

		
}