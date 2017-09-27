/*
    This is the solution to Project Euler, Problem #1.

    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
    these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
 */

class EulerProblem1 {

    private static final int max = 1000;

    public static void main(String[] args) {
        // Code here
        int answer = 0;
        for (int i = 1; i < max; i++){
            if (i%3 == 0 || i%5 == 0){
                answer = answer + i;


            }
        }

        System.out.println("The answer is " + answer);
    }
}