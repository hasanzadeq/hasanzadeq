package app;

import java.util.Arrays;

public class shiftingPositiveNumbers {
    public static void main(String[] args) {
        //filling
        final int LEN=10;
        int[] array = new int[LEN];
        int[] shifted = new int[LEN];
        for(int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*20-10);
        }
        int k=0;
        //calculating
        for(int i=0;i<array.length;i++){
            if(array[i]>0);

        }

        //printing
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(shifted));
    }
}
