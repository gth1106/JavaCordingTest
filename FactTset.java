package 자료구조;

class FactTest {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++)
            System.out.printf("%2d! = %20d\n", i, Factorial(i));
    }
    public static long Factorial(int n) {
        if ( n<1 )
            return 1; // base case, 탈출구
        return n * Factorial(n-1); // recursive case
    }
}