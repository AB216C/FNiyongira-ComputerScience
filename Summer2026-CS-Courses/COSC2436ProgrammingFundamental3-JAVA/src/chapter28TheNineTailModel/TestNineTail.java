package chapter28TheNineTailModel;

import java.util.*;

/**
 * Test driver for the Nine Tails problem.
 *
 * This class reads an initial configuration of nine coins,
 * finds the shortest path to the all-tails configuration,
 * and prints every step of the solution.
 */
public class TestNineTail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the initial nine coins.
        System.out.print("Enter the initial nine coins Hs and Ts: ");
        String s = input.nextLine();

        // Convert the input string into a character array.
        char[] initialNode = s.toCharArray();

        // Create the Nine Tails model.
        NineTailModel model = new NineTailModel();

        // Convert the initial configuration into its integer index
        // and find the shortest path to the all-tails state (511).
        List<Integer> path = model.getShortestPath(
                NineTailModel.getIndex(initialNode));

        // Display the steps required to flip the coins.
        System.out.println("The steps to flip the coins are");

        // Print every configuration along the shortest path.
        for (int i = 0; i < path.size(); i++) {
            NineTailModel.printNode(
                    NineTailModel.getNode(path.get(i)));
        }

        input.close();
    }
}