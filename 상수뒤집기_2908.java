import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상수뒤집기_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        String A =line[0];
        String B =line[1];


        int reversedA = Integer.parseInt(reverseString(A));
        int reversedB = Integer.parseInt(reverseString(B));

        System.out.println(Math.max(reversedA,reversedB));


    }
    public static String reverseString(String str){
        String reversed ="";
        for(int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
