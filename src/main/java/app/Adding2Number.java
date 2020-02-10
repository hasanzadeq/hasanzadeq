package app;
import java.io.PrintStream;
import java.util.Scanner;

public class Adding2Number {
    public static void main(String[] args) {
        PrintStream output = System.out;
        Scanner scanner = new Scanner(System.in);
        int FirstNumber = scanner.nextInt();
        int SecondNumber = scanner.nextInt();
        int Sum = FirstNumber + SecondNumber;
        output.println(Sum);

    }
}
