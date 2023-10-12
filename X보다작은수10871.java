import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X보다작은수10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 줄 두 숫자 입력
        String[] line1 =br.readLine().split(" ");
        int M = Integer.parseInt(line1[0]); // 숫자개수
        int N = Integer.parseInt(line1[1]); // 기준이 되는 수

        // 숫자 한번에 입력받기
        String[] line2 = br.readLine().split(" "); // 두번째줄
        int[] list =new int[M];
        for(int i=0;i<M;i++){
            list[i]=Integer.parseInt(line2[i]);
        }

        for(int x : list){
            if(N>x){
                System.out.print(x+ " ");
            }

        }






    }
}
