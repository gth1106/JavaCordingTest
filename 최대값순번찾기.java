import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대값순번찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int max = -1 ;
        int cnt= 0;
        int position=0;
        for(int i = 0 ; i<9; i++){
            int k = Integer.parseInt(br.readLine());
            cnt+=1;
            if(k>max){
                max=k;
                position=cnt;
            }

        }
        System.out.println(max);
        System.out.println(position);
    }
}
