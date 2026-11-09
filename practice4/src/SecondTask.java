import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondTask {
    static String[] secondTask(int[] inputArray, String[] queries) {
        String[] output = new String[queries.length + 1];
        SortedArray sa = new SortedArray(inputArray);
        output[0] = sa.print();
        int index = 1;
        for (String query : queries) {
            String[] tokens = query.split(" ");

            switch (tokens[0]) {
                case "ADD":
                    sa.add(Integer.parseInt(tokens[1]));
                    break;
                case "REMOVE":
                    sa.remove(Integer.parseInt(tokens[1]));
                    break;
                case "COUNT_RANGE":
                    output[index++] = String.valueOf(sa.countRange(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "CONTAINS":
                    output[index++] = sa.contains(Integer.parseInt(tokens[1])) ? "YES" : "NO";
                    break;
                case "PRINT":
                    output[index++] = sa.print();
                    break;
            }
        }

        return Arrays.copyOfRange(output, 0, index);
    }
}
