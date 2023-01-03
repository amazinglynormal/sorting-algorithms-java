package sortingalgorithms.insertionsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        int[] arr2 = {68,101,-32,99,-56,256};
        int[] arr3 = {6};
        int[] arr4 = {};

        InsertionSort.sort(arr1);
        InsertionSort.sort(arr2);
        InsertionSort.sort(arr3);
        InsertionSort.sort(arr4);

        int [] expectedArr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] expectedArr2 = {-56,-32,68,99,101,256};
        int [] expectedArr3 = {6};
        int [] expectedArr4 = {};

        assertArrayEquals(expectedArr1, arr1);
        assertArrayEquals(expectedArr2, arr2);
        assertArrayEquals(expectedArr3, arr3);
        assertArrayEquals(expectedArr4, arr4);
    }

}