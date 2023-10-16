import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 공넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" "); // 첫번째 라인 N,M 입력
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int[] socket = new int[N]; // 바구니의 공번호
        for(int i=0;i<N;i++){
            socket[i]=0;  // 0번으로 초기화
        }

        for(int i=0;i<M;i++){
            String[] bline = br.readLine().split(" ");
            int a = Integer.parseInt(bline[0]);
            int b = Integer.parseInt(bline[1]);
            int c = Integer.parseInt(bline[2]);
            for(int j=a ; j<=b;j++){
                socket[j-1]=c;
            }
        }


        for(int x : socket)  // 바구니 안 공의번호
            System.out.print(x + " ");
    }
}
