package sortingalgorithms.selectionsort;

public class SelectionSort {

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int smallestVal = array[i];
            int smallestValIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallestVal) {
                    smallestVal = array[j];
                    smallestValIdx = j;
                }
            }

            if (smallestValIdx != i) {
                int temp = array[i];
                array[i] = smallestVal;
                array[smallestValIdx] = temp;
            }

        }

    }
}
