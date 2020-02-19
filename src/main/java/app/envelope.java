package app;

import java.util.Scanner;

public class envelope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int s1 = sc.nextInt();
        System.out.println("Enter the height: ");
        int s2 = sc.nextInt();

        for (int i = 0; i < s2; i++ ) {
            for (int j = 0; j < s1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
