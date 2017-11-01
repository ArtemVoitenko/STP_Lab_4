public class Bubble implements Sort{
    public  int[] sort(int[] arrBubble){

        int[] arrBubbleSort = new int[arrBubble.length];
        for (int s = 0; s<arrBubbleSort.length; s++){
            arrBubbleSort[s] = arrBubble[s];
        }
        int element;
        int count = -1;
        boolean check = true;

        while (check){
            for (int i = 0; i<arrBubbleSort.length-1;i++){
                if(arrBubbleSort[i]>arrBubbleSort[i+1]){
                    element = arrBubbleSort[i];
                    arrBubbleSort[i] = arrBubbleSort[i+1];
                    arrBubbleSort[i+1] = element;
                }
                else {
                    count++;
                }
                if (count==arrBubbleSort.length-1){
                    check = false;
                }
            }
            count = 0;
        }

        return arrBubbleSort;
    }
}
