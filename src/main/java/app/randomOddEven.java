package app;

import java.util.Arrays;

public class randomOddEven {
    public static void main(String[] args) {
        //1. creation

        final int Len = 20;
        int[] randomNumbers = new int[Len];
        int[] positiveNumbers = new int[Len];
        int[] negativeNumbers = new int[Len];
        int k=0, l=0;

        //2. calculating

        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random()*(200+1)-100);
        }
        for (int el :randomNumbers) {
            if (el > 0) {
                positiveNumbers[k] = el;
                k++;
            }
        }
        for (int el :randomNumbers) {
            if (el < 0) {
                negativeNumbers[l] = el;
                l++;
            }
        }

        int [] pos1 = Arrays.copyOf(positiveNumbers,k);
        int [] neg1 = Arrays.copyOf(negativeNumbers,l);
        //3. printing

        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(Arrays.toString(pos1));
        System.out.println(Arrays.toString(neg1));
    }


}
