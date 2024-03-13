package 자료구조;

public class FiboTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d번째 피보나치 수 = %4d\n", i, Fib(i));
        }
    }
//    public static long Fib(int n) { // 재귀함수 정의의 의미 : n번째 피보나치 수 반환
//        if ( n<=1 )
//            return n; // base case, 탈출구
//        return Fib(n-1) + Fib(n-2); // recursive case, 함수 정의와 의미 동일
//    }
    static Long next;
    public static long Fib(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0; // f(0)
        long current = 1; // f(1)
        for (int i = 2; i <= n; i++) {
            next = prev + current; // F(n) = F(n-1) + F(n-2)
            prev = current; // 이전 수는 현재수
            current = next; // 현재수는 다음수
        }
        return current;
    }
}
