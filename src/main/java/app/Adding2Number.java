package app;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Adding2Number {
    public static void main(String[] args) {
        InputStream in = System.in;
        PrintStream output = System.out;
        Scanner scanner = new Scanner(in);
        int FirstNumber = scanner.nextInt();
        int SecondNumber = scanner.nextInt();
        int Sum = FirstNumber + SecondNumber;
        output.println(Sum);

    }
}
