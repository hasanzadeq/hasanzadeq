package app;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        int[] randomNumbers = new int[30];
        int[] evenNumbers = new int[30];
        int k = 0, l = 0;
        int MAX = 40;

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * (MAX + 2) - 20);
        }
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 == 0) {
                evenNumbers[k] = randomNumbers[i];
                k++;
            }
        }
        String s = Arrays.toString(evenNumbers);
        System.out.println(s);
    }
}