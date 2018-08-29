class GraphColoring{
	private int V;
	private LinkedList[] adjL;
	class Graph{
		Graph(int v){
			V = v;
			adjL = new LinkedList[V];
			for(int i=0; i<V; i++){
				adjL[i] = new LinkedList<Integer>();
			}
		}
	}

	public void colorGraph(){
		int[] colors = new int[V];
		Arrays.fill(colors, -1);

		boolean[] availableColors = new boolean[V];
		Arrays.fill(availableColors, true);

		colors[0] = 0;

		for(int i=1; i<V; i++){
			Iterator<Integer> iter = adjL[i].listIterator();
			while(iter.hasNext()){
				int curr = iter.next();
				if(colors[curr]!=-1)
					availableColors[colors[curr]] = false;
			}
			int colorAvailable;
			for(colorAvailable=0; colorAvailable<V; colorAvailable++){
				if(availableColors[colorAvailable])
					break;
			}
			colors[i] = colorAvailable;
			Arrays.fill(availableColors, true);
		}
	}
}