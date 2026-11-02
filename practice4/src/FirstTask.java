import java.util.Arrays;

class FirstTask {
    static int[] firstTask(int[] inputArray, int[] queries) {
        int[] results = new int[queries.length];
        Arrays.fill(results, -1);

        for (int k : inputArray) {
            for (int j = 0; j < queries.length; j++) {
                if (results[j] == -1) {
                    if (k >= queries[j]) {
                        results[j] = k;
                    }
                }
            }
        }

        return results;
    }
}