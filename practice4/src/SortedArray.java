import java.util.Arrays;

public class SortedArray {
    private int[] data;

    public SortedArray(int[] inputArray) {
        data = new int[inputArray.length];
        Arrays.sort(data);
    }

    public void add(int x) {
        data = Arrays.copyOf(data, data.length + 1);
        for (int i = 0; i < data.length; i++) {
            if (data[i] < x) {
                for (int j = data.length - 1; j > i + 1; j--) {
                    data[j] = data[j - 1];
                }
                data[i + 1] = x;
            }
        }
    }

    public boolean contains(int x) {
        for (int entry : data) {
            if (entry == x) return true;
        }
        return false;
    }

    public void remove(int x) {
        int[] newData = new int[data.length - 1];
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            if (found) {
                newData[i - 1] = data[i];
            } else {
                if (data[i] == x) found = true;
                else newData[i] = data[i];
            }
        }

        if (found) {
            data = newData;
        }
    }

    public int countRange(int l, int r) {
        int result = 0;
        for (int entry : data) {
            if (result == 0) {
                if (entry >= l) result++;
            } else {
                if (entry > r) return result;
                result++;
            }
        }

        return result;
    }

    public String print() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            result.append(data[i]);

            if (i + 1 != data.length) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
