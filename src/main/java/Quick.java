public class Quick implements Sort{
    public int[] quickSort(int[] arr, int start, int end){
        if(start>=end) return arr;

        int i = start;
        int j = end;

        int op = (i+j)/2;
        int temp;

        while (i<j){
            while ((i<op) && (arr[i] <= arr[op]))i++;
            while ((j>op) && (arr[j] >= arr[op]))j--;

            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if(i==op)op=j;
                else if(j==op) op = i;
            }
        }

        quickSort(arr,start,op);
        quickSort(arr,op+1,end);

        return arr;
    }
    public int[] sort(int[]arr){
        int[] arrInsertionSort = new int[arr.length];
        for (int s = 0; s < arrInsertionSort.length; s++) {
            arrInsertionSort[s] = arr[s];
        }
        return  arrInsertionSort;
    }
}
