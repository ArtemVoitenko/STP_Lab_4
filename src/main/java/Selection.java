public class Selection implements Sort {
    public int[] sort(int[] arr){
        int[] arrInsertionSort = new int[arr.length];
        for (int s = 0; s < arrInsertionSort.length; s++) {
            arrInsertionSort[s] = arr[s];
        }

        for (int i = 0; i < arrInsertionSort.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arrInsertionSort.length; j++) {
                if (arrInsertionSort[j] < arrInsertionSort[index])
                    index = j;
            }

            int smallerNumber = arrInsertionSort[index];
            arrInsertionSort[index] = arrInsertionSort[i];
            arrInsertionSort[i] = smallerNumber;
        }
        return arrInsertionSort;
    }
}
