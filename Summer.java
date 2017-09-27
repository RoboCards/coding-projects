import java.io.*;
import java.util.Scanner;

public class Summer {

    // Sums the first n numbers.

    public static void main(String args[]) {

        // in represents an input stream from the terminal.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the highest number in the sum: ");

        // read in the first line and take the integer off of it.
        int n = in.nextInt();
        int answer = 1;
        for(int i=1; i<=n; i++) {
            answer = answer * i;
        }

        System.out.println("The factorial of the first " + n + " integers is " + answer);

    }

}
