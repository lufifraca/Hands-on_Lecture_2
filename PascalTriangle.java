package HandsOnLecture2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int valueAboveLeft = triangle.get(i-1).get(j-1);
                    int valueAboveRight = triangle.get(i-1).get(j);
                    row.add(valueAboveLeft + valueAboveRight);
                }
            }


            triangle.add(row);
        }
        return triangle;

    }
}
