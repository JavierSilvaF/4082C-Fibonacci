class FibonacciRecursive {
    // Function to calculate the Fibonacci Number through Recursion:
    public static long FibonacciCalculate(long n) {
        if (n == 0){ return n;}
        if (n == 1){ return n;}
        else
            return FibonacciCalculate(n - 1) + FibonacciCalculate(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        double result = FibonacciCalculate(n);

        System.out.printf("The 10th term of the Fibonnaci Sequence is %2.2f", result);
    }//Main
}// Class