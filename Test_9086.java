import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());

        for(int i=0 ; i<index; i++){
            String line = br.readLine();
            System.out.println(line.charAt(0)+""+line.charAt(line.length()-1));
        }
    }
}
