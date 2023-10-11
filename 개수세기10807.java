import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 개수세기10807 {
    public static void main(String[] args) throws IOException {
        int cnt=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int lst[] =new int[size];
        String rlist[]=br.readLine().split(" ");
        for(int i=0;i<size;i++){
            lst[i]=Integer.parseInt(rlist[i]);

        }
        int num =Integer.parseInt(br.readLine());
        for( int s : lst){
            if (s==num){
                cnt+=1;
            }
        }
        System.out.println(cnt);


    }
}

