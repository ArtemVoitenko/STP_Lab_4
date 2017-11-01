import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*100000);
        }
        measureTime(array);
        array();
        int[][] matr = {{2,7,4},{7,6,2},{9,1,8}};
        matrix(matr);
    }

    public static void measureTime(int[] array){
        Sort target = new Bubble();

        int beforeSort = (int) System.currentTimeMillis();
        target.sort(array);
        int afterSort = (int) System.currentTimeMillis();
        System.out.println("Час виконання bubbleSort = " + (afterSort - beforeSort) + " мс.\n");

        target = new Coocktail();

        beforeSort = (int) System.currentTimeMillis();
        target.sort(array);
        afterSort = (int) System.currentTimeMillis();
        System.out.println("Час виконання coctailSort = " + (afterSort - beforeSort) + " мс.\n");

        target = new Selection();

        beforeSort = (int) System.currentTimeMillis();
        target.sort(array);
        afterSort = (int) System.currentTimeMillis();
        System.out.println("Час виконання selectionSort = " + (afterSort - beforeSort) + " мс.\n");


        target = new Quick();

        beforeSort = (int) System.currentTimeMillis();
        target.sort(array);
        afterSort = (int) System.currentTimeMillis();
        System.out.println("Час виконання quickSort = " + (afterSort - beforeSort) + " мс.\n");

        target = new Insertion();

        beforeSort = (int) System.currentTimeMillis();
        target.sort(array);
        afterSort = (int) System.currentTimeMillis();
        System.out.println("Час виконання insertionSort = " + (afterSort - beforeSort) + " мс.\n");
    }
    public  static int array(){
        try{
            Array arr = new Array();
            int[] numbersArray = {4,2,7,34,2,-1,4,-10,4,-11,34,2,100};

            arr.mean(numbersArray);

            arr.difference(numbersArray);

            arr.countPos(numbersArray);

            arr.sumNeg(numbersArray);

            arr.sumMult(numbersArray);

            arr.prod(numbersArray);

            return 1;
        }catch (Exception e){return 0;}
    }
    public static int matrix(int[][] matriX){
        try {
            Matrix matrix = new Matrix();


            int[][] matr = matriX;

            System.out.println(matrix.sumElement(matr));


            System.out.println(matrix.sequence(matr));
            return 1;
        }
        catch (Exception e) {
            return 0;
        }
    }
}

