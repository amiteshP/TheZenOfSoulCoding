import java.util.*;

class Solution {
	static int V;
	static LinkedList[] adjL;
	class Graph{
		Graph(int num){
			V = num;
			adjL = new LinkedList[V];
			for(int i=0; i<V; i++){
				adjL[i] = new LinkedList<Integer>();
			}
		}
		public void addEdge(int src, int dest){
			adjL[src].add(dest);
		}
	}
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph gr = new Graph(numCourses);
        for(int[] pair: prerequisites){
        	gr.addEdge(pair[1], pair[0]);
        }

        boolean[] recStack = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];

        Arrays.fill(recStack, false);
        Arrays.fill(visited, false);

        for(int i=0; i<numCourses; i++){
        		if(detectCycle(i, recStack, visited))
        			return false;
        }
        return true;
    }

    public boolean detectCycle(int v, boolean[] recStack, boolean[] visited){
    	if(recStack[v])
    		return true;
    	if(visited[v])
    		return false;

    	recStack[v] = true;
    	visited[v] = true;

    	Iterator<Integer> it = adjL[v].listIterator();

    	while(it.hasNext())
    	{
    		int curr = it.next();
    		if(detectCycle(curr, recStack, visited))
    			return true;
    	}

    	recStack[v] = false;

    	return false;
    }
}