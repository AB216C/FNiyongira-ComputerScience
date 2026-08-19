package chapter28GraphsAndApplications;

/**
 * The goal of the Edge class is to represent a connection between
 * two vertices in a graph. The variables u and v identify the two
 * vertices connected by the edge.
 */
public class Edge {

	public int u;
	public int v;

	// Store the starting and ending vertices of the edge.
	public Edge(int u, int v) 
	{
		this.u = u;
		this.v = v;
	}

	//Test if two edges are identical

	@Override
	public boolean equals(Object o) 
	{
		// Compare the starting and ending vertices of both edges.
		return u == ((Edge)o).u && v == ((Edge)o).v;
	}
	
}