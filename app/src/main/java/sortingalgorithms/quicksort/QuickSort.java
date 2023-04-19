package sortingalgorithms.quicksort;

public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivot = medianOfThreePivot(array, start, end);

        // first index starting from left where value is larger than pivot value
        int leftPointer = partition(array, start, end, pivot);

        sort(array, start, leftPointer);
        sort(array, leftPointer + 1, end);
    }

    private static int partition(int[] array, int start, int end, int pivotValue) {
        // first index starting from left where value is larger than pivot value
        int leftPointer = start;

        // first index starting from right where value is less than pivot value
        int rightPointer = end;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivotValue && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivotValue && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        // swaps pivot with value larger than pivot
        // all elements to left of pivot are now smaller and all elements to right are now larger
//        swap(array, leftPointer, end);

            swap(array, leftPointer, end);

        return leftPointer;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    private static int medianOfThreePivot(int[] array, int lowerBound, int upperbound) {
        int mid = (lowerBound + upperbound) / 2;

        if (array[mid] < array[lowerBound]) {
            swap(array, lowerBound, mid);
        }
        if (array[upperbound] < array[lowerBound]) {
            swap(array, lowerBound, upperbound);
        }
        if (array[mid] < array[upperbound]) {
            swap(array, mid, upperbound);
        }

        return array[upperbound];

    }
}
