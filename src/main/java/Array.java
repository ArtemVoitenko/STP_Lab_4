import java.util.Scanner;

public class Array {

    public int mean(int[] numbersArray){
        int max = numbersArray[0],  min = numbersArray[0];

        for(int q = 0; q<numbersArray.length-1;q++){
            if(numbersArray[q] < min){
                min = numbersArray[q];
            }
            if(numbersArray[q] > max){
                max = numbersArray[q];
            }
        }
        if(min>0) {
            System.out.println("Середнє геометричне максимального і мінімального елементів масиву = " + Math.round(Math.sqrt(min*max)));
            return  (int)Math.round(Math.sqrt(min*max));
        }
        else{
            System.out.println("Неможливо знайти середнє геометричне значення, тому що присутнє від'ємне число.");
            return -1;
        }
    }
    public int difference(int[] numbersArray){
        int countNeg = 0;
        int countPos = 0;

        for(int r = 0; r<numbersArray.length; r++){
            if(numbersArray[r]<0){
                countNeg+=1;
            }else{
                countPos+=1;
            }
        }
        int[] negative = new int[countNeg];
        int[] positive = new int[countPos];
        for(int e = 0, n = 0, p = 0; e<numbersArray.length; e++){
            if(numbersArray[e]<0){
                negative[n] = numbersArray[e];
                n++;
            }
            else{
                positive[p]= numbersArray[e];
                p++;
            }
        }

        int sumNeg  = 0;
        for(int l = 0; l<negative.length;l++){
            sumNeg = sumNeg + negative[l];
        }

        int sumPos = 0;
        for (int c = 0; c<positive.length; c++){
            sumPos = sumPos + positive[c];
        }
        int dif = sumPos - Math.abs(sumNeg);
        System.out.println("Різниця між позитивними та негативними елементами масиву = " + Math.abs(dif));
        return Math.abs(dif);
    }
    public int countPos(int[] numbersArray){
        int countPos = 0;

        for(int r = 0; r<numbersArray.length; r++){
            if(numbersArray[r]<0){
            }else{
                countPos+=1;
            }
        }
        System.out.println("Кількість позитивних елементів в масиві = " + countPos);
        return countPos;
    }
    public int sumNeg(int[] numbersArray){
        int countNeg = 0;

        for(int r = 0; r<numbersArray.length; r++){
            if(numbersArray[r]<0){
                countNeg+=1;
            }
        }

        int[] negative = new int[countNeg];
        for(int e = 0, n = 0, p = 0; e<numbersArray.length; e++){
            if(numbersArray[e]<0){
                negative[n] = numbersArray[e];
                n++;
            }
        }

        int sumNeg  = 0;
        for(int l = 0; l<negative.length;l++){
            sumNeg = sumNeg + negative[l];
        }
        System.out.println("Сума негативних елементів масиву = " + sumNeg);
        return sumNeg;
    }
    public int sumMult(int[] numbersArray){
        int sumMult = 0;
        for(int j = 0; j<numbersArray.length; j++){
            if(j%3 == 0 && j!=0){
                sumMult = sumMult + numbersArray[j];
            }
        }

        System.out.println("Сума елементів масиву, в яких індекс має кратне число 3 = " + sumMult);
        return sumMult;
    }
    public int prod(int[] numbersArray){
        int max = numbersArray[0],  min = numbersArray[0];

        for(int q = 0; q<numbersArray.length-1;q++){
            if(numbersArray[q] < min){
                min = numbersArray[q];
            }
            if(numbersArray[q] > max){
                max = numbersArray[q];
            }
        }
        int prod = max * min;
        System.out.println("Добуток найбільшого і найменшого елементу масиву = " + prod);
        return prod;
    }
}
