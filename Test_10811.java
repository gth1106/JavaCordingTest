import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int[] basket = new int[5];
        int[] temp= new int[5];
        // 바구니 1 2 3 4 5
        for(int i = 0 ;i<a ; i++){
             basket[i] = i+1;
             temp[i]=0;
             // OK System.out.println(basket[i]);
        }
        //4번반복  바구니 역순
        for(int i = 0 ; i < b ; i++){
            //  바구니 선정
            String[] rline = br.readLine().split(" ");
            int b1 = Integer.parseInt(rline[0]);
            int b2 = Integer.parseInt(rline[1]);
            for( int j = 0 ; j<b2-b1 ; j++){

            }
        }
        for(int k : basket){
            System.out.print(k+" ");
        }
    }
}
