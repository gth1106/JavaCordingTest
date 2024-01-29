import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 공공바바꾸꾸기기기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split(" ");
        int M = Integer.parseInt(line[0]);
        int N = Integer.parseInt(line[1]);

        int[]basket = new int[M];
        int[]temp = new int[M];
        for(int i=0; i<M;i++){
            basket[i]=i+1;
            temp[i]=i+1;
        }
        for(int i=0; i<N;i++){
            String[] rline = br.readLine().split(" ");
            int a = Integer.parseInt(rline[0])-1;
            int b = Integer.parseInt(rline[1])-1;

            // 1 2 3 4 5  //  2 1 3 4 5
            for(int j=0 ; j<(b-a)/2+1; j++){
                int c = basket[b-j];
                basket[b-j] = basket[a+j];
                basket[a+j] = c;
            }

            }


        for(int k : basket){
            System.out.print(k+" ");
        }

    }
}
