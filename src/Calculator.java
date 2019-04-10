public class Calculator {

    public double plus(double a, double b) {
        System.out.println("Result: "+ (a + b));
        return a + b;
    }

    public double minus(double a, double b) {
        System.out.println("Result: "+ (a - b));
        return a - b;
    }

    public double multiply(double a, double b) {
        if (a == 0 || b == 0){
            System.out.println("Result: 0");
            return 0;
        }else{
            System.out.println("Result: "+(a*b));
            return a * b;}
    }

    public double division(double a, double b) {
        if (b == 0){
            System.out.println("error");
            return 0;}
        else {
            System.out.println("Result: "+(a/b));
            return a / b;
        }
    }

    public int factorial(int n) {
        if ((n == 0) || (n == 1))
            return 1;
        if (n > 20) {
            System.out.println("error, too big number");
            return 0;}
        if (n < 0) {
            System.out.println("error, negative number");
            return 0;
        }
        else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    }
}