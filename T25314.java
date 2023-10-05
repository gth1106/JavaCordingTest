import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String line ="";

        while(N!=0){
           if (N%4==0){
               line+="long"+" ";
               N -=4;
           }
        }
        System.out.print(line+"int");


    }
}
