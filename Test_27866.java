import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("");
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0;i< line.length;i++){
            //System.out.println(line[i]);
            if(i==cnt-1){
                System.out.println(line[i]);
            }
        }

    }
}
