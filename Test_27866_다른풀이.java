import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_27866_다른풀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int cnt = Integer.parseInt(br.readLine())-1;
        System.out.println(line.substring(cnt,cnt+1));

    }
}
