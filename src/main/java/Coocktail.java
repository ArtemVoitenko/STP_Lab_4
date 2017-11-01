public class Coocktail implements Sort {
    public int[] sort( int[] array ){
        int[] clonedArray = array.clone();
        boolean swapped;
        int temp;
        do {
            swapped = false;
            for (int i =0; i<=  clonedArray.length  - 2;i++) {
                if (clonedArray[ i ] > clonedArray[ i + 1 ]) {
                    temp = clonedArray[i];
                    clonedArray[i] = clonedArray[i+1];
                    clonedArray[i+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i= clonedArray.length - 2;i>=0;i--) {
                if (clonedArray[ i ] > clonedArray[ i + 1 ]) {
                    temp = clonedArray[i];
                    clonedArray[i] = clonedArray[i+1];
                    clonedArray[i+1]=temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return clonedArray;
    }
}
