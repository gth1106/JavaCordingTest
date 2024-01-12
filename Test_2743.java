import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("");
        System.out.println(line.length);
    }
}

// readLine()을 사용하는 동안 다음과 같은 상황들이 발생할 수 있습니다

// 파일 또는 네트워크 리소스에 접근하는 도중 문제가 발생할 수 있습니다 (예: 파일이 없거나, 네트워크 연결 문제).
//데이터를 읽는 도중에 입출력 오류가 발생할 수 있습니다.
//외부 시스템과의 연결이 중단될 수 있습니다.