import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSet중복제거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> cnt = new HashSet<>();
        for(int i=0; i<10; i++){
            int line =Integer.parseInt(br.readLine());
            cnt.add(line%42);
        }
        System.out.println(cnt.size());
    }
}
