package app;

import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {
        //filling
        final int LEN = 20;
        int[] array = new int[LEN];
        int d=1;
        for(int i = 0; i < LEN; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        int[] shifted = array.clone();


        //calculating
        for(int i=LEN-1;i>=d;i--) {
            shifted[i] = array[i-d];
        }
        shifted[0]=array[LEN-1];


        //printing
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(shifted));
    }
}
