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
                    sa.add(Integer.getInteger(tokens[1]));
                    break;
                case "REMOVE":
                    sa.remove(Integer.getInteger(tokens[1]));
                    break;
                case "COUNT_RANGE":
                    output[index] = String.valueOf(sa.countRange(Integer.getInteger(tokens[1]), Integer.getInteger(tokens[2])));
                    index++;
                    break;
                case "CONTAINS":
                    output[index] = sa.contains(Integer.getInteger(tokens[1])) ? "YES" : "NO";
                    break;
                case "PRINT":
                    output[index] = sa.print();
                    break;
            }
        }

        return Arrays.copyOf(output, index);
    }
}
