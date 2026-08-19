package chapter28TheNineTailModel;

/*
*================================================================
* NINE TAILS PROBLEM — NOTES
* ================================================================
*
* The nine tails problem can be reduced to the shortest path problem.
*
* Problem:
* Nine coins are placed in a 3 x 3 matrix. Each coin is either H
* (heads) or T (tails). A legal move is to select a coin that is H
* and flip it together with its adjacent coins (up, down, left,
* right). Diagonal coins are NOT included.
*
* Goal:
* Find the minimum number of moves needed to reach the state where
* all nine coins are T.
*
* IMPORTANT GRAPH IDEA:
* ------------------------------------------------
* There are 2^9 = 512 possible configurations of nine H/T coins.
*
* Each configuration is a vertex in the graph:
*     0, 1, 2, ..., 511
*
* Node 0:
*     H H H
*     H H H
*     H H H
*
* Node 511:
*     T T T
*     T T T
*     T T T
*
* Node 511 is the TARGET because all coins are tails.
*
* An edge represents one legal move.
*
* BFS is used because every legal move has the same cost: one move.
* Therefore, the BFS tree gives a shortest path to the target.
*
* ================================================================
* UML / CLASS NOTES
* ================================================================
*
* NineTailModel
*     - tree: UnweightedGraph<Integer>.SearchTree
*     + NineTailModel()
*     + getShortestPath(nodeIndex: int): List<Integer>
*     - getEdges(): List<Edge>
*     + getNode(index: int): char[]
*     + getIndex(node: char[]): int
*     + getFlippedNode(node: char[], position: int): int
*     + flipACell(node: char[], row: int, column: int): void
*     + printNode(node: char[]): void
*
* ================================================================
* HOW THE REPRESENTATION WORKS
* ================================================================
*
* A 3 x 3 board is stored as a one-dimensional char array:
*
*     position:  0 1 2
*                3 4 5
*                6 7 8
*
*     board:     H H H
*                T T T
*                H H H
*
*     array: {'H','H','H','T','T','T','H','H','H'}
*
* The H/T configuration is converted to a number from 0 to 511
* using binary representation:
*
*     H = 0
*     T = 1
*
* Therefore:
*
*     HHHHHHHHH = 000000000 = 0
*     TTTTTTTTT = 111111111 = 511
*
* ================================================================
* BFS DIRECTION
* ================================================================
*
* The graph is built so that an edge (v, u) represents a legal move
* from state u to state v.
*
* The BFS tree is rooted at node 511, the all-tails state.
*
* Because BFS finds shortest paths from its root, tree.getPath(u)
* gives the shortest path from state u to the target state 511.
*
* ================================================================
*/

import java.util.*;
import chapter28GraphsAndApplications.Graph;
import chapter28GraphsAndApplications.UnweightedGraph;
import chapter28GraphsAndApplications.Edge;

public class NineTailModel {
   public final static int NUMBER_OF_NODES = 512;
   protected UnweightedGraph<Integer>.SearchTree tree;

   /** Construct a model */
   public NineTailModel() {
       // Create edges
       List<Edge> edges = getEdges();

       // Create a graph
       UnweightedGraph<Integer> graph = new UnweightedGraph<>(
               edges, NUMBER_OF_NODES);

       // Obtain a BSF tree rooted at the target node
       // Node 511 represents TTT / TTT / TTT, the target state.
       tree = graph.bfs(511);
   }

   /** Create all edges for the graph */
   private List<Edge> getEdges() {
       List<Edge> edges =
               new ArrayList<>(); // Store edges

       // Examine every possible coin configuration.
       for (int u = 0; u < NUMBER_OF_NODES; u++) {
           // Try flipping each of the nine positions.
           for (int k = 0; k < 9; k++) {
               char[] node = getNode(u); // Get the node for vertex u

               // A legal move can only start by selecting an H coin.
               if (node[k] == 'H') {
                   int v = getFlippedNode(node, k);

                   // Add edge (v, u) for a legal move from node u to node v
                   edges.add(new Edge(v, u));
               }
           }
       }

       return edges;
   }

   /*
    * Returns the index of the state produced by flipping the selected
    * coin and its four possible neighbors.
    *
    * position:
    *     0 1 2
    *     3 4 5
    *     6 7 8
    *
    * Only existing positions are flipped. Positions outside the
    * 3 x 3 board are ignored by flipACell().
    */
   public static int getFlippedNode(char[] node, int position) {
       int row = position / 3;
       int column = position % 3;

       // Flip the selected coin.
       flipACell(node, row, column);

       // Flip the coin above.
       flipACell(node, row - 1, column);

       // Flip the coin below.
       flipACell(node, row + 1, column);

       // Flip the coin to the left.
       flipACell(node, row, column - 1);

       // Flip the coin to the right.
       flipACell(node, row, column + 1);

       return getIndex(node);
   }

   public static void flipACell(char[] node, int row, int column) {
       if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
           // Within the boundary
           if (node[row * 3 + column] == 'H')
               node[row * 3 + column] = 'T'; // Flip from H to T
           else
               node[row * 3 + column] = 'H'; // Flip from T to H
       }
   }

   /*
    * Convert the H/T representation into an integer.
    *
    * H = 0
    * T = 1
    *
    * The nine characters are therefore treated like a 9-bit binary
    * number.
    */
   public static int getIndex(char[] node) {
       int result = 0;

       for (int i = 0; i < 9; i++)
           if (node[i] == 'T')
               result = result * 2 + 1;
           else
               result = result * 2 + 0;

       return result;
   }

   /*
    * Convert an integer from 0 to 511 back into a nine-character
    * H/T configuration.
    *
    * The binary digits are read from right to left and stored into
    * the character array from position 8 back to position 0.
    */
   public static char[] getNode(int index) {
       char[] result = new char[9];

       for (int i = 0; i < 9; i++) {
           int digit = index % 2;

           if (digit == 0)
               result[8 - i] = 'H';
           else
               result[8 - i] = 'T';

           index = index / 2;
       }

       return result;
   }

   /*
    * Return a shortest path from the specified node to the target
    * node 511.
    *
    * Because the BFS tree was rooted at 511, getPath(nodeIndex)
    * returns the sequence of vertices along a shortest path to 511.
    */
   public List<Integer> getShortestPath(int nodeIndex) {
       return tree.getPath(nodeIndex);
   }

   public static void printNode(char[] node) {
       for (int i = 0; i < 9; i++)
           if (i % 3 != 2)
               System.out.print(node[i]);
           else
               System.out.println(node[i]);

       System.out.println();
   }
}


/*
* ================================================================
* QUICK STUDY SUMMARY
* ================================================================
*
* 1. Why 512 nodes?
*      There are 9 coins and each has 2 possible states:
*      2^9 = 512.
*
* 2. Why is node 511 the target?
*      511 in binary is 111111111.
*      1 represents T, so 511 = TTTTTTTTT.
*
* 3. Why BFS?
*      Every legal flip costs exactly one move.
*      BFS therefore finds the minimum number of moves.
*
* 4. What does getIndex() do?
*      H/T array -> integer.
*
* 5. What does getNode() do?
*      Integer -> H/T array.
*
* 6. What does getFlippedNode() do?
*      Flips a selected H coin and its non-diagonal neighbors.
*
* 7. What does getEdges() do?
*      Generates all legal moves for all 512 states.
*
* 8. What does tree = graph.bfs(511) do?
*      Builds a BFS tree whose root is the all-tails state.
*
* 9. What does getShortestPath(nodeIndex) do?
*      Returns the shortest sequence of states from the given
*      configuration to the all-tails configuration.
*
* ================================================================
* EXAMPLE
* ================================================================
*
* Initial state:
*
*     H H H
*     T T T
*     H H H
*
* As a string:
*     HHHTTTHHH
*
* The program can use:
*
*     int index = NineTailModel.getIndex(
*         "HHHTTTHHH".toCharArray());
*
*     NineTailModel model = new NineTailModel();
*
*     List<Integer> path = model.getShortestPath(index);
*
* Then each integer in path can be converted back to a board:
*
*     NineTailModel.printNode(
*         NineTailModel.getNode(path.get(i)));
*
* The final state will be:
*
*     T T T
*     T T T
*     T T T
*
* ================================================================
* REQUIRED SUPPORT CLASSES
* ================================================================
*
* This file is the NineTailModel class. It relies on the graph
* classes from the textbook:
*
*     Edge.java
*     Graph.java
*     UnweightedGraph.java
*
* These classes must be available in the same package/project.
*/