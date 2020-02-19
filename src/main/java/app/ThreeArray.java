package app;

import java.util.Arrays;

public class ThreeArray {
    public static void main(String[] args) {
        // filling
        final int LEN = 10;
        int[] arr1 = new int[LEN];
        int[] arr2 = new int[LEN];
        int[] arr3 = new int[LEN];
        int[] arrFinal = new int[3*LEN];
        int a=0;
        for(int i = 0; i < LEN; i++) {
            arr1[i] = (int) (Math.random() * 10) * 2;
            arr2[i] = (int) (Math.random() * 10) * 7;
            arr3[i] = (int) (Math.random() * 10) * 11;
        }
        // calculating
        for(int i = 0; i <LEN; i++) {
            arrFinal[a]=arr1[i];
            arrFinal[a+1]=arr2[i];
            arrFinal[a+2]=arr3[i];
            a=a+3;
        }
        //printing
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arrFinal));
    }
}
