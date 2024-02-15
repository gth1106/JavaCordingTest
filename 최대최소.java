import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대최소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 사이즈 개수
        String[] line= br.readLine().split(" "); // 두번째 줄 입력
        int[] lst = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE ;
        for(int i=0;i<N;i++){
            lst[i]=Integer.parseInt(line[i]);
            if(lst[i]>max){
                max=lst[i];
            }
            else if(lst[i]<max){
                min=lst[i];

            }
        }
        System.out.println(min+" "+max);
    }
}
