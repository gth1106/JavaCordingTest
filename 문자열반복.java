import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            String[] line = br.readLine().split(" ");
            int R = Integer.parseInt(line[0]);
            String S = line[1];
            for(int j=0;j<S.length();j++){
                for(int k =0 ; k<R;k++){
                    System.out.print(S.charAt(j));
                }
//                2
//                3 ABC
//                5 /HTP
            }
            System.out.println();
        }
    }
}
