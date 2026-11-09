public class ThirdTask {
    static class Output {
        public Output(int[] array, int swaps, int iterations) {
            this.array = array;
            this.swaps = swaps;
            this.iterations = iterations;
        }

        int[] array;
        int swaps;
        int iterations;
    }

    static Output thirdTask(int[] array) {
        int[] sortedArray = array.clone();
        int swaps = 0;
        int iterations = 0;

        for (;;) {
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    int swapValue = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = swapValue;
                    swaps++;
                }
            }
            iterations++;

            boolean sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) break;
        }

        return new Output(sortedArray, swaps, iterations);
    }
}
