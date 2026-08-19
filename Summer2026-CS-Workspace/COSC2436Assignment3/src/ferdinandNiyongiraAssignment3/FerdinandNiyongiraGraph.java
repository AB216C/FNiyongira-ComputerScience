package ferdinandNiyongiraAssignment3;


public interface FerdinandNiyongiraGraph<V> 
{
	/**Return the number of vertices in the graph*/
	
	public int ferdinandNiyongiraGetSize();
	
	/**Return the vertices in the graph*/
	
	public java.util.List<V> ferdinandNiyongiraGetVertices();
	
	
	/**Return the object for specified vertex index*/
	public V ferdinandNiyongiraGetVertex(int index);
	
	/**Return the index for the specified vertex object*/
	
	public int ferdinandNiyongiraGetIndex(V v);
	
	/**Return the neighbors of the vertex with specified index*/
	
	public java.util.List<Integer> ferdinandNiyongiraGetNeighbors(int index);
	
	/**Return the degree for the specified vertex*/
	
	public int ferdinandNiyongiraGetDegree(int V);
	
	/**Clear the graph*/
	
	public void ferdinandNiyongiraClear();
	
	/**Print edges*/
	
	public void ferdinandNiyongiraPrintEdges();
	
	/**Add a vertex to the graph*/
	
	public boolean ferdinandNiyongiraAddVertex(V vertex);
	
	/**Add an edge(u,v) to the graph*/
	
	public boolean ferdinandNiyongiraAddEdge(int u, int v);
	
	/**Add an edge to the graph*/
	
	public boolean ferdinandNiyongiraAddEdge(FerdinandNiyongiraEdge e);
	
	/**Remove vertex V from the graph and return true if successful*/
	
	public boolean ferdinandNiyongiraRemove(V v);
	
	/**Remove an edge(u,v) from the graph*/
	
	public boolean ferdinandNiyongiraRemove(int u, int v);
	
	/**Obtain a depth-first search tree*/
	
	public FerdinandNiyongiraUnweightedGraph<V>.SearchTree ferdinandNiyongiraDFS(int v);
	
	
	/**Obtain a breadth-first search tree*/
	
	public FerdinandNiyongiraUnweightedGraph<V>.SearchTree ferdinandNiyongiraBFS(int v);
}
