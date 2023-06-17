package backjoon재풀이;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 상수뒤집기_정답 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        String n1 = reverseString(num[0]);
        String n2 = reverseString(num[1]);

        System.out.println(Math.max(Integer.parseInt(n1), Integer.parseInt(n2)));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
