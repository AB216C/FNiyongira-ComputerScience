package chapter22TheDivideAndConquerTechnique;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestPair
{
    // Stores the closest pair found
    static Point closestPoint1;
    static Point closestPoint2;

    /**
     * Calculates Euclidean distance.
     */
    public static double distance(Point p1, Point p2)
    {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Brute-force algorithm.
     * Used for small datasets.
     */
    public static double bruteForce(Point[] points)
    {
        double min = Double.MAX_VALUE;

        for (int i = 0; i < points.length - 1; i++)
        {
            for (int j = i + 1; j < points.length; j++)
            {
                double d = distance(points[i], points[j]);

                if (d < min)
                {
                    min = d;
                    closestPoint1 = points[i];
                    closestPoint2 = points[j];
                }
            }
        }

        return min;
    }

    /**
     * Finds the closest pair.
     *
     * (For learning purposes this uses brute force.
     * The recursive divide-and-conquer version replaces
     * this method.)
     */
    public static double closestPair(Point[] points)
    {
        // Sort by x-coordinate
        Arrays.sort(points, Comparator.comparingDouble(p -> p.x));

        return bruteForce(points);
    }

    /**
     * Main method
     */
    public static void main(String[] args)
    {
        Point[] points =
        {
            new Point(2, 3),
            new Point(12, 30),
            new Point(40, 50),
            new Point(5, 1),
            new Point(12, 10),
            new Point(3, 4)
        };

        double answer = closestPair(points);

        System.out.println("Closest Distance = " + answer);

        System.out.println("Closest Pair = "
                + closestPoint1
                + " and "
                + closestPoint2);
    }
}