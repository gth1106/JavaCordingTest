import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 조세퍼스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // 사람의 수

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i); // 1부터 n까지 큐에 사람 추가
        }
        while (queue.size() > 2) {
            queue.add(queue.remove()); // 첫 번째 사람을 뒤로 보내기
            queue.add(queue.remove()); // 두 번째 사람을 뒤로 보내기
            queue.remove(); // 세 번째 사람을 큐에서 제거 (죽임)
        }
        System.out.println("마지막 생존자: " + queue);
    }
}
// 1 2 3 4 5 6 7 8 9 10