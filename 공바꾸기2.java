import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 공바꾸기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]); // 바구니의 수
        int M = Integer.parseInt(line[1]); // 교환 횟수
        int[] basket = new int[N];
        int temp;

        // 바구니 초기화 (1부터 N까지 숫자를 넣는다)
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for(int i=0 ; i<M;i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0])-1;
            int b = Integer.parseInt(input[1])-1;
            temp = Integer.parseInt(input[0]);
            if(a!=b){
                basket[a]=basket[b];
                basket[b]=temp;
            }
        }
        for(int x : basket){
            System.out.print(x + " ");
        }

    }
}

