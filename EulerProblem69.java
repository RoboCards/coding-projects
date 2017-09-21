/*
    Project Euler, Problem 69

    Euler's Totient function, φ(n) [sometimes called the phi function], is used to determine the number of numbers less
    than n which are relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8, are all less than nine and relatively
    prime to nine, φ(9)=6.

    It can be seen that n=6 produces a maximum n/φ(n) for n ≤ 10.
    Find the value of n ≤ 1,000,000 for which n/φ(n) is a maximum.

    Note, this is an inefficient algorithm which uses the Euclidean algorithm to complete the gcd many times in order
    to calulate the phi function. You can use the Euler product formula to compute the phi function more efficiently.

 */

class EulerProblem69 {

    private final static int maxNumToCheck = 100;

    /**
     * Calculates the gcd of two integers using the Euclidean Algorithm.
     * @param m One of the numbers for which the gcd is being calculated.
     * @param n One of the numbers for which the gcd is being calculated.
     * @return an integer which is the gcd of m and n.
     */
    private static int gcd(int m, int n) {
        if (n == 0)
            return m;
        else
            return gcd(n, m%n);
    }

    private static int phi(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++)
            if (gcd(n, i) == 1)
                answer ++;
        return answer;
    }

    public static void main(String[] args) {
        int num = 0;
        double ratio;
        double maxRatio = 0.0;
        for (int i = 2; i <= maxNumToCheck; i++) {
            ratio = (double) i / (double) phi(i);
            if (ratio > maxRatio) {
                maxRatio = ratio;
                num = i;
            }
        }
        System.out.println("The n at which the maximum ratio occurs is " + num);
    }
}