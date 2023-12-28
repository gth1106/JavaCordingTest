import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class test_3052 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> cnt =new ArrayList<>(); // 동적인 배열 선언 ArrayList

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<10;i++){
            int line = Integer.parseInt(br.readLine());
            cnt.add(line%42); // 동적배열에 나머지를 순서대로 대입
        }
        HashSet<Integer> realCnt = new HashSet<>(); // 중복을 제거할 HashSet<타입> 변수 = new HashSet<>();
        for(int a: cnt){
            realCnt.add(a); //  cnt배열의 나머지들을 a 에 대입 순서대로 중복을 제거할 hash 원소 대입
        }
        System.out.println(realCnt.size()); // 리스트는 length , Array 는 size ?
    }
}
