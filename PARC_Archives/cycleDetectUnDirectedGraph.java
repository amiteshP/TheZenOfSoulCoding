class Graph{
	private int V;
	private LinkedList[] adjL;

	Graph(int v){
		V = v;
		adjL = new LinkedList[V];
		for(int i=0; i<V; i++){
			adjL[i] = new LinkedList<Intger>();
		}
	}

	public void addEdge(int src, int dest){
		adjL[src].add(dest);
	}

	public boolean detectCyle(){
		
	}
}