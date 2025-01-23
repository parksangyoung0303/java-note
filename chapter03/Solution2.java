package chapter03;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(int[] array, int[][] queries) {
        for (int[] query : queries) {
            int first = query[0];
            int second = query[1];

            for (int i = first; i <= second; i++) {
                array[i] += 1;
            }
        }
        return array; 
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] array = {0, 1, 2, 3, 4};
        
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};

        int[] result = solution.solution(array, queries);

        System.out.println(Arrays.toString(result));
    }
}
