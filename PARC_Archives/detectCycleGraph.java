//Cycle detection in a graph (both directed and undirected)
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
class Graph{
	
	private int V;
	private List<List<Integer>> gadj;
	Graph(int V){
		this.V = V;
		gadj = new ArrayList<>(V);
		for(int i=0; i<V; i++){
			gadj.add(new LinkedList<>());
		}
	}

	private void addEdge(int src, int dest){
		gadj.get(src).add(dest);
	}

	private boolean isCyclic(){
		boolean[] visited = new boolean[V];
		boolean[] recordInStack = new boolean[V];

		for(int i=0; i<V; i++){
			if(isCyclic(i, visited, recordInStack))
				return true;
		}
		return false;
	}

	private boolean isCyclic(int i, boolean[] visited, boolean[] recordInStack){
		if(recordInStack[i])
			return true;

		if(visited[i])
			return false;

		visited[i] = true;
		recordInStack[i] = true;
		List<Integer> children = gadj.get(i);

		for(int c: children){
			if(isCyclic(i, visited, recordInStack))
				return true;
		}
		recordInStack[i] = false;
		return false;
	}

	static public void main(String args[]){
		Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        //graph.addEdge(0, 2);
        //graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        //graph.addEdge(3, 3);
         
        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                                    + "contain cycle");
	}

}