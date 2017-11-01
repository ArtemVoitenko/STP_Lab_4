public class Insertion implements Sort{
    public int[] sort(int[] arr) {
        int[] arrInsertionSort = new int[arr.length];
        for (int s = 0; s < arrInsertionSort.length; s++) {
            arrInsertionSort[s] = arr[s];
        }

        int i, j, newValue;
        for (i = 1; i < arrInsertionSort.length; i++) {
            newValue = arrInsertionSort[i];
            j = i;
            while (j > 0 && arrInsertionSort[j - 1] > newValue) {
                arrInsertionSort[j] = arrInsertionSort[j - 1];
                j--;
            }
            arrInsertionSort[j] = newValue;
        }
        return  arrInsertionSort;
    }
}
