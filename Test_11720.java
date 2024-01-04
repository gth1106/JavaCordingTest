import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_11720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split("");
        int sum=0;

        for(int i=0; i<index ; i++){
            sum += Integer.parseInt(line[i]);
        }
        System.out.println(sum);
    }
}
