package sortingalgorithms.bubblesort;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
