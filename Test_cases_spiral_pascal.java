package HandsOnLecture2;

import java.util.List;

import static HandsOnLecture2.SpiralMatrix.spiralOrder;


public class Test_cases_spiral_pascal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};

        System.out.println("Expected Result for Spiral Matrix: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]\n");
        List<Integer> result = spiralOrder(matrix);
        System.out.println("Actual Result: " + result + "\n");

        System.out.println("Expected Result for Pascal's Triangle with numRows = 5:\n [1]\n [1, 1]\n [1, 2, 1]\n [1, 3, 3, 1]\n [1, 4, 6, 4, 1]\n");

        System.out.println("Actual Result: ");
        List<List<Integer>> pascal = PascalTriangle.generate(5);
        for(List<Integer> row : pascal) {
            System.out.println(row);
        }

    }
}
