/* This problem was borrowed from the website HackerRank

   This program adds up all of the integers of an array and prints out the sum.

   The main() function of this program takes two lines of input.
   The first line is an integer which gives the size of the array.
   The second line is a space-separated list of integers which constitute the members of the array.

   After main() populates the array, it calls the function simpleArraySum() with the dimension of the
   array as well as the array itself. This function returns the sum of the elements in the passed
   array.

   Bonus: Write an exception to handle the case when the user inputs too many integers on the second line.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
    }



    public static void main(String[] args) {

        // in represents an input stream from the terminal.
        Scanner in = new Scanner(System.in);

        // read in the first line and take the integer off of it.
        int n = in.nextInt();

        // initialize the array with the dimension read off the first line of
        // terminal input.
        int[] ar = new int[n];

        // populater the array with the values from the second line of
        // terminal input
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        // call simpleArraySum() in order to complete the function.
        int result = simpleArraySum(n, ar);

        System.out.println(result);
    }
}