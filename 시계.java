import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class 시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int H = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int add = Integer.parseInt(br.readLine());
        M = add+M;
        // 14 50 20 14 70   15 10  900 10
        int total = (H*60) + M; // 14 50 20 -->910

        if(total>1440){
            total -= 1440;
            int newtime = total/60;
        int minute = total%60 ;
        System.out.println(newtime+" "+minute);
    }
        else if(total<=1440){
            int newtime = total/60;
            int minute = total%60;
            if(newtime==24 && minute==0){
                newtime=0;
            }
            System.out.println(newtime+" "+minute);
        }
    }
}
