package ferdinandNiyongiraAssignment3;

/**
 * The goal of the FerdinandNiyongiraEdge class is to represent a connection between
 * two vertices in a graph. The variables u and v identify the two
 * vertices connected by the edge.
 */
public class FerdinandNiyongiraEdge {

	public int u;
	public int v;

	// Store the starting and ending vertices of the edge.
	public FerdinandNiyongiraEdge(int u, int v) 
	{
		this.u = u;
		this.v = v;
	}

	//Test if two edges are identical

	@Override
	public boolean equals(Object o) 
	{
		// Compare the starting and ending vertices of both edges.
		return u == ((FerdinandNiyongiraEdge)o).u && v == ((FerdinandNiyongiraEdge)o).v;
	}
	
}
