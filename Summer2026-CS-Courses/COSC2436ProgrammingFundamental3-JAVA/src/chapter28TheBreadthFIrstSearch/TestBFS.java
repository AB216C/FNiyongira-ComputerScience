package chapter28TheBreadthFIrstSearch;

//Breadth-First Search (BFS) Algorithm
//
//Input: G = (V, E) and a starting vertex v
//Output: a BFS tree rooted at v
//
//SearchTree bfs(vertex v) {
//  create an empty queue for storing vertices to be visited;
//  add v into the queue;
//  mark v visited;
//
//  while (the queue is not empty) {
//      dequeue a vertex, say u, from the queue;
//      add u into a list of traversed vertices;
//      for each neighbor w of u
//          if w has not been visited {
//              add w into the queue;
//              set u as the parent for w in the tree;
//              mark w visited;
//          }
//  }
//}

import chapter28GraphsAndApplications.Graph;
import chapter28GraphsAndApplications.UnweightedGraph;

public class TestBFS {
 public static void main(String[] args) {
     String[] vertices = {"Seattle", "San Francisco", "Los Angeles",
             "Denver", "Kansas City", "Chicago", "Boston", "New York",
             "Atlanta", "Miami", "Dallas", "Houston"};

     int[][] edges = {
             {0, 1}, {0, 3}, {0, 5},
             {1, 0}, {1, 2}, {1, 3},
             {2, 1}, {2, 3}, {2, 4}, {2, 10},
             {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
             {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
             {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
             {6, 5}, {6, 7},
             {7, 4}, {7, 5}, {7, 6}, {7, 8},
             {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
             {9, 8}, {9, 11},
             {10, 2}, {10, 4}, {10, 8}, {10, 11},
             {11, 8}, {11, 9}, {11, 10}
     };

     Graph<String> graph = new UnweightedGraph<>(vertices, edges);

     UnweightedGraph<String>.SearchTree bfs =
             graph.bfs(1);

     java.util.List<Integer> searchOrders = bfs.getSearchOrder();

     System.out.println(graph.getVertex(1) +
             " vertices are searched in this order:");

     for (int i = 0; i < searchOrders.size(); i++)
         System.out.println(graph.getVertex(searchOrders.get(i)));

     for (int i = 0; i < searchOrders.size(); i++)
         if (bfs.getParent(i) != -1)
             System.out.println("parent of " + graph.getVertex(i) +
                     " is " + graph.getVertex(bfs.getParent(i)));
 }
}