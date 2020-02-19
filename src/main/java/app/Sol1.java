package app;

import java.util.Arrays;
import java.util.logging.Level;

public class Sol1 {
    public static void main(String[] args) {
        final int LEN=30;
        int[] odd = new int[LEN];
        int[] even = new int[LEN];

        for(int i=0;i<odd.length;i++){
            odd[i]= (int) (Math.random()*60-30)*2+1;
        }
        for(int i=0;i<even.length;i++){
            even[i]= (int) (Math.random()*60-30)*2;
        }
        int sumEven=0;
        int sumOdd=0;
        for(int el: odd){
            sumOdd+=el;
        }
        for(int el: even){
            sumOdd+=el;
        }
        int sumTotal= sumEven + sumOdd;
        System.out.printf("Even: %s\n", Arrays.toString(even));
        System.out.printf("Odd: %s\n", Arrays.toString(odd));
        System.out.printf("The sum of even is:%d\n", sumEven);
        System.out.printf("The sum of odd is:%d\n", sumOdd);
        System.out.printf("The total sum is:%d\n", sumTotal);
    }
}
