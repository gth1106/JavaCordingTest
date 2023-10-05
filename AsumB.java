import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsumB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;

        while((inputLine = br.readLine()) != null) {
            String testCase[] = inputLine.split(" ");
            int a = Integer.parseInt(testCase[0]);
            int b = Integer.parseInt(testCase[1]);
            System.out.println(a + b);
        }
    }
}
