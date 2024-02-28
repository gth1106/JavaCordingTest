import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대최소Integer클래스없이  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] lst = new int[N];
        int max = Integer.parseInt(line[0]);
        int min = max;

        for(int i = 0 ; i < N ; i++ ){
            lst[i]=Integer.parseInt(line[i]);

            if(lst[i]>max){
                max=lst[i];
            }
            else if(lst[i]<min){
                min=lst[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
