import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 단어개수_1152 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();

        if(line.isEmpty()){
            System.out.println(0);
        }
        else {
            String[] words = line.split(" ");
            System.out.println(words.length);
        }


    }
}
