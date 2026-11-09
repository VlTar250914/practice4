public class FourthTask {
    static int[] fourthTask(int[] array, int newElement) {
        int[] newArray = new int[array.length + 1];
        boolean foundPosition = false;
        for (int i = array.length - 1; i >= 0; i--) {
            if (foundPosition) {
                newArray[i] = array[i];
            } else {
                if (array[i] <= newElement) {
                    newArray[i + 1] = newElement;
                    newArray[i] = array[i];
                    foundPosition = true;
                } else newArray[i + 1] = array[i];
            }
        }

        return newArray;
    }
}
