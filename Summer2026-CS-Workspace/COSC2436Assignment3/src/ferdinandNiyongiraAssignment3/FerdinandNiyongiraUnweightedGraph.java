package ferdinandNiyongiraAssignment3;

import java.util.*;

public class FerdinandNiyongiraUnweightedGraph<V> implements FerdinandNiyongiraGraph<V>
{

	protected List<V> vertices = new ArrayList<>(); // Store vertices
	protected List<List<FerdinandNiyongiraEdge>> neighbors
	    = new ArrayList<>(); // Adjacency lists

	/** Construct an empty graph */
	public FerdinandNiyongiraUnweightedGraph() 
	{
		// Create an empty graph with no vertices and no edges.
	}

	/** Construct a graph from vertices and edges stored in arrays */
	public FerdinandNiyongiraUnweightedGraph(V[] vertices, int[][] edges) 
	{
		// Add every vertex from the array to the graph.
		for (int i = 0; i < vertices.length; i++)
			ferdinandNiyongiraAddVertex(vertices[i]);

		// Create the adjacency lists using the specified edges.
	    createAdjacencyLists(edges, vertices.length);
	}

	/** Construct a graph from vertices and edges stored in List */
	public FerdinandNiyongiraUnweightedGraph(List<V> vertices, List<FerdinandNiyongiraEdge> edges) 
	{
		// Add every vertex from the list to the graph.
	    for (int i = 0; i < vertices.size(); i++)
	    	ferdinandNiyongiraAddVertex(vertices.get(i));

	    // Create the adjacency lists using the specified edges.
	    createAdjacencyLists(edges, vertices.size());
	}

	/** Construct a graph for integer vertices 0, 1, 2 and edge list */
	public FerdinandNiyongiraUnweightedGraph(List<FerdinandNiyongiraEdge> edges, int numberOfVertices) 
	{
		// Create integer vertices from 0 through numberOfVertices - 1.
	    for (int i = 0; i < numberOfVertices; i++)
	    	ferdinandNiyongiraAddVertex((V)(Integer.valueOf(i))); // vertices is {0, 1, ...}

	    // Create the adjacency lists using the specified edges.
	    createAdjacencyLists(edges, numberOfVertices);
	}

	/** Construct a graph from integer vertices 0, 1, and edge array */
	public FerdinandNiyongiraUnweightedGraph(int[][] edges, int numberOfVertices) 
	{
		// Create integer vertices from 0 through numberOfVertices - 1.
	    for (int i = 0; i < numberOfVertices; i++)
	    	ferdinandNiyongiraAddVertex((V)(Integer.valueOf(i))); // vertices is {0, 1, ...}

	    // Create the adjacency lists using the specified edges.
	    createAdjacencyLists(edges, numberOfVertices);
	}

	/** Create adjacency lists for each vertex */
	private void createAdjacencyLists(
	    int[][] edges, int numberOfVertices) 
	{
		// Add each edge to the appropriate adjacency list.
	    for (int i = 0; i < edges.length; i++) 
	    {
	    	ferdinandNiyongiraAddEdge(edges[i][0], edges[i][1]);
	    }
	}

	/** Create adjacency lists for each vertex */
	private void createAdjacencyLists(List<FerdinandNiyongiraEdge> edges, int numberOfVertices) 
	{
		// Add each edge from the list to the graph.
	    for (FerdinandNiyongiraEdge edge: edges) {
	    	ferdinandNiyongiraAddEdge(edge.u, edge.v);
	    }
	}

	@Override /** Return the number of vertices in the graph */
	public int ferdinandNiyongiraGetSize() {
		// Return the total number of vertices.
	    return vertices.size();
	}

	@Override /** Return the vertices in the graph */
	public List<V> ferdinandNiyongiraGetVertices() {
		// Return the list containing all vertices.
	    return vertices;
	}

	@Override /** Return the object for the specified vertex */
	public V ferdinandNiyongiraGetVertex(int index) {
		// Return the vertex stored at the specified index.
	    return vertices.get(index);
	}

	@Override /** Return the index for the specified vertex object */
	public int ferdinandNiyongiraGetIndex(V v) {
		// Return the index of the specified vertex.
	    return vertices.indexOf(v);
	}

	@Override /** Return the neighbors of the specified vertex */
	public List<Integer> ferdinandNiyongiraGetNeighbors(int index) 
	{
		// Create a list to store the indexes of neighboring vertices.
		List<Integer> result = new ArrayList<>();

		// Visit every edge connected to the specified vertex.
	    for (FerdinandNiyongiraEdge e: neighbors.get(index))
	        result.add(e.v);

	    // Return the list of neighboring vertex indexes.
	    return result;
	}

	@Override /** Return the degree for a specified vertex */
	public int ferdinandNiyongiraGetDegree(int v) {
		// Return the number of edges connected to the specified vertex.
	    return neighbors.get(v).size();
	}

	@Override /** Print the edges */
	public void ferdinandNiyongiraPrintEdges() 
	{
		// Visit every vertex and display its outgoing edges.
		for (int u = 0; u < neighbors.size(); u++) {
	        System.out.print(ferdinandNiyongiraGetVertex(u) + " (" + u + "): ");

	        // Display every edge connected to the current vertex.
	        for (FerdinandNiyongiraEdge e: neighbors.get(u)) {
	            System.out.print("(" + ferdinandNiyongiraGetVertex(e.u) + ", " +
	            		ferdinandNiyongiraGetVertex(e.v) + ") ");
	        }

	        System.out.println();
	    }
	}

	@Override /** Clear the graph */
	public void ferdinandNiyongiraClear() {
		// Remove all vertices from the graph.
	    vertices.clear();

	    // Remove all adjacency lists from the graph.
	    neighbors.clear();
	}

	@Override /** Add a vertex to the graph */
	public boolean ferdinandNiyongiraAddVertex(V vertex) 
	{
		// Only add the vertex if it does not already exist.
		if (!vertices.contains(vertex)) 
		{
			// Add the vertex to the list of vertices.
	        vertices.add(vertex);

	        // Create an empty adjacency list for the new vertex.
	        neighbors.add(new ArrayList<FerdinandNiyongiraEdge>());

	        // Indicate that the vertex was successfully added.
	        return true;
	     }
	    else 
	    {
	    	// The vertex already exists, so it was not added.
	        return false;
	    }
	}

	@Override /** Add an edge to the graph */
	public boolean ferdinandNiyongiraAddEdge(FerdinandNiyongiraEdge e) 
	{
		// Verify that the starting vertex index is valid.
	    if (e.u < 0 || e.u > ferdinandNiyongiraGetSize() - 1)
	        throw new IllegalArgumentException("No such index: " + e.u);

	    // Verify that the ending vertex index is valid.
	    if (e.v < 0 || e.v > ferdinandNiyongiraGetSize() - 1)
	        throw new IllegalArgumentException("No such index: " + e.v);

	    // Add the edge only if it does not already exist.
	    if (!neighbors.get(e.u).contains(e)) {
	        neighbors.get(e.u).add(e);
	        return true;
	    }
	    else 
	    {
	    	// The edge already exists.
	        return false;
	    }
	}

	@Override /** Add an edge to the graph */
	public boolean ferdinandNiyongiraAddEdge(int u, int v) 
	{
		// Create an FerdinandNiyongiraEdge object using the two vertex indexes.
	    return ferdinandNiyongiraAddEdge(new FerdinandNiyongiraEdge(u, v));
	}

	@Override /** Obtain a DFS tree starting from vertex u */
	/** To be discussed in Section 28.7 */
	public SearchTree ferdinandNiyongiraDFS(int v) 
	{
		// Store the order in which vertices are visited.
		List<Integer> searchOrder = new ArrayList<>();

		// Store the parent of every vertex in the DFS tree.
	    int[] parent = new int[vertices.size()];

	    // Initialize every vertex as having no parent.
	    for (int i = 0; i < parent.length; i++)
	        parent[i] = -1; // Initialize parent[i] to -1

	    // Mark visited vertices
	    boolean[] isVisited = new boolean[vertices.size()];

	    // Recursively search
	    dfs(v, parent, searchOrder, isVisited);

	    // Return a search tree
	    return new SearchTree(v, parent, searchOrder);
	}

	/** Recursive method for DFS search */
	private void dfs(int v, int[] parent, List<Integer> searchOrder, boolean[] isVisited) 
	{
		// Store the visited vertex
	    searchOrder.add(v);
	    isVisited[v] = true; // Vertex v visited

	    // Examine every neighbor of the current vertex.
	    for (FerdinandNiyongiraEdge e : neighbors.get(v)) 
	    { // Note that e.u is v
	        int w = e.v; // e.v is w in Listing 28.8

	        // Visit the neighbor if it has not already been visited.
	        if (!isVisited[w]) 
	        {
	            parent[w] = v; // The parent of w is v
	            dfs(w, parent, searchOrder, isVisited); // Recursive search
	        }
	    }
	}

	@Override /** Starting bfs search from vertex v */
	/** To be discussed in Section 28.9 */
	public SearchTree ferdinandNiyongiraBFS(int v) 
	{
		// Store the order in which vertices are visited.
		List<Integer> searchOrder = new ArrayList<>();

		// Store the parent of every vertex in the BFS tree.
	    int[] parent = new int[vertices.size()];

	    // Initialize every vertex as having no parent.
	    for (int i = 0; i < parent.length; i++)
	        parent[i] = -1; // Initialize parent[i] to -1

	    // Create a queue for BFS traversal.
	    java.util.LinkedList<Integer> queue =
	        new java.util.LinkedList<>(); // List used as a queue

	    // Track which vertices have already been visited.
	    boolean[] isVisited = new boolean[vertices.size()];

	    // Add the starting vertex to the queue.
	    queue.offer(v); // Enqueue v

	    // Mark the starting vertex as visited.
	    isVisited[v] = true; // Mark it visited

	    // Continue until there are no more vertices in the queue.
	    while (!queue.isEmpty()) 
	    {
	        int u = queue.poll(); // Dequeue to u
	        searchOrder.add(u); // u searched

	        // Examine every neighbor of the current vertex.
	        for (FerdinandNiyongiraEdge e: neighbors.get(u)) { // Note that e.u is u
	            int w = e.v; // e.v is w in Listing 28.11

	            // Visit the neighbor if it has not already been visited.
	            if (!isVisited[w]) {
	                queue.offer(w); // Enqueue w
	                parent[w] = u; // The parent of w is u
	                isVisited[w] = true; // Mark w visited
	            }
	        }
	    }

	    // Return the BFS search tree.
	    return new SearchTree(v, parent, searchOrder);
	}

	/** FerdinandNiyongiraTree inner class inside the FerdinandNiyongiraUnweightedGraph class */
	/** To be discussed in Section 28.6 */
	public class SearchTree 
	{
	    private int root; // The root of the tree
	    private int[] parent; // Store the parent of each vertex
	    private List<Integer> searchOrder; // Store the search order

	    /** Construct a tree with root, parent, and searchOrder */
	    public SearchTree(int root, int[] parent, List<Integer> searchOrder) 
	    {
	    	// Store the root vertex.
	        this.root = root;

	        // Store the parent information for every vertex.
	        this.parent = parent;

	        // Store the order in which vertices were searched.
	        this.searchOrder = searchOrder;
	    }

	    /** Return the root of the tree */
	    public int getRoot() {
	    	// Return the root vertex.
	        return root;
	    }

	    /** Return the parent of vertex v */
	    public int getParent(int v) 
	    {
	    	// Return the parent of the specified vertex.
	        return parent[v];
	    }

	    /** Return an array representing search order */
	    public List<Integer> getSearchOrder() 
	    {
	    	// Return the list containing the search order.
	        return searchOrder;
	    }

	    /** Return number of vertices found */
	    public int getNumberOfVerticesFound() 
	    {
	    	// Return the number of vertices discovered during the search.
	        return searchOrder.size();
	    }

	    /** Return the path of vertices from a vertex to the root */
	    public List<V> getPath(int index) 
	    {
	    	// Create a list to store the path.
	        ArrayList<V> path = new ArrayList<>();

	        // Follow the parent references from the specified vertex to the root.
	        do 
	        {
	            path.add(vertices.get(index));
	            index = parent[index];
	        }
	        while (index != -1);

	        // Return the path from the specified vertex to the root.
	        return path;
	    }

	    /** Print a path from the root to vertex v */
	    public void printPath(int index) 
	    {
	    	// Get the path from the specified vertex to the root.
	        List<V> path = getPath(index);
	        
	        // Display the path from the root to the specified vertex.
	        System.out.print("A path from " + vertices.get(root) + " to " + vertices.get(index) + ": ");

	        // Print the path in reverse order so it starts at the root.
	        for (int i = path.size() - 1; i >= 0; i--)
	            System.out.print(path.get(i) + " ");
	    }

	    /** Print the whole tree */
	    public void printTree() 
	    {
	    	// Display the root of the search tree.
	        System.out.println("The tree root: " + vertices.get(root));

	        // Display all parent-child edges in the search tree.
	        System.out.print("The Edges: ");
	        
	        int count = 0;	//Keep track on number of edges printed on the current line

	        // Examine every vertex and its parent.
	        for (int i = 0; i < parent.length; i++) {
	            if (parent[i] != -1) {
	                // Display an edge
	                System.out.print("(" + vertices.get(parent[i]) + ", " +
	                    vertices.get(i) + ") ");
	                
	                count ++;
	                
	                //Move the next line after every 15 edges
	                if(count % 8 ==0) 
	                {
	                	System.out.println();
	                }
	            }
	        }

	        System.out.println();
	    }
	    
	}

	@Override /** Remove vertex v and return true if successful */
	public boolean ferdinandNiyongiraRemove(V v) 
	{
		// Find the index of the vertex that should be removed.
		int index = ferdinandNiyongiraGetIndex(v);

		// Return false if the vertex does not exist.
		if (index == -1)
			return false;

		// Remove every edge that points to the vertex being removed.
		for (int i = 0; i < neighbors.size(); i++)
		{
			neighbors.get(i).removeIf(edge -> edge.v == index);
		}

		// Remove the adjacency list belonging to the vertex.
		neighbors.remove(index);

		// Remove the vertex itself.
		vertices.remove(index);

		// Adjust all edge indexes that are greater than the removed index.
		for (int i = 0; i < neighbors.size(); i++)
		{
			for (FerdinandNiyongiraEdge edge : neighbors.get(i))
			{
				if (edge.u > index)
					edge.u--;

				if (edge.v > index)
					edge.v--;
			}
		}

		// Return true because the vertex was successfully removed.
		return true;
	}

	@Override /** Remove edge (u, v) and return true if successful */
	public boolean ferdinandNiyongiraRemove(int u, int v) 
	{
		// Verify that the starting vertex index is valid.
		if (u < 0 || u >= ferdinandNiyongiraGetSize())
			return false;

		// Verify that the ending vertex index is valid.
		if (v < 0 || v >= ferdinandNiyongiraGetSize())
			return false;

		// Create an edge representing the edge to be removed.
		FerdinandNiyongiraEdge edge = new FerdinandNiyongiraEdge(u, v);

		// Remove the edge from the adjacency list.
		return neighbors.get(u).remove(edge);
	}
}