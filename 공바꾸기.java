import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 공바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]); // 바구니의 수
        int M = Integer.parseInt(line[1]); // 교환 횟수
        int[] basket = new int[N];
        int[] temp = new int[N]; // 임시 배열

        // 바구니 초기화 (1부터 N까지 숫자를 넣는다)
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
            temp[i] = i + 1; // 임시 배열도 같은 값으로 초기화
        }

        // 공 교환
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1; // i번 바구니
            int b = Integer.parseInt(input[1]) - 1; // j번 바구니

            // 임시 배열에 현재 바구니의 공 상태를 복사
            temp[a] = basket[a];
            temp[b] = basket[b];

            // 교환 실행
            basket[a] = temp[b];
            basket[b] = temp[a];
        }

        // 결과 출력
        for (int x : basket) {
            System.out.print(x + " ");
        }
    }
}
