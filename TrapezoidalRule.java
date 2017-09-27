import java.util.Scanner;

public class TrapezoidalRule {

    private static double f(double x) {
        return x * x;
    }


    private static double trapezoidalRule(double a, double b) {
        double answer = 0;
        // write your function here.
        return answer;
    }


    // Ask for the upper and lower limits of integration, and find the area under the curve f(x)
    // from a to b by using the trapezoidal rule.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower limit of integration: ");
        double a = in.nextDouble();
        System.out.print("Enter the upper limit of integration: ");
        double b = in.nextDouble();

        double area = trapezoidalRule(a, b);

        System.out.println("The answer is " + area);
    }
}
