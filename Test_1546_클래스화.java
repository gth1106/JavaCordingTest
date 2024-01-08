import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1546_클래스화 {
    public static void main(String[] args) throws IOException { //메인메소드 시작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int[] x = new int[line]; // 입력받은 길이의 임의의 배열 생성
        String[] rline = br.readLine().split(" "); // 한줄에 공백을 구분으로 숫자를 문자형으로 받음

        for (int i = 0; i < line; i++) {
            x[i] = Integer.parseInt(rline[i]); // 문자형으로 받은 숫자들을 임의의 배열에 순차적대입
        }

        double average = calculateNewAverage(x); // 평균값 처리를 할 메소드 , 배열을 대입해줌 받는 매개변수 또한 배열형태이여야함.
        printAverage(average);

    }  // 메인메소드끝
    public static double calculateNewAverage ( int[] x ){
        int max = findMax(x); // 평균값 처리에 있어 문제에있는 최대값을 활용할 메소드 활용
        double sum = 0;

        for (int k : x ){
            sum += ((double) k / max *100);
        }

        return  sum/x.length;
    }
    public static void printAverage ( double average){  // 출력을 도울 메소드 , void- > return 값 없는
        System.out.println(average);
    }
    public static int findMax(int[] x){ // 매개변수로 받은 배열을 씀 , 최대값을 구하는 로직
            int max = x[0]; // 배열의 첫번째 수로 초기화
            for(int score : x){ // 새 변수에 x 대입
                if( score > max){
                    max =score;
                }
            }
            return max; // void 가 없으면 return 이 필요함
        }
}
