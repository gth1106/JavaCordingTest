import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int []x = new int[line];
        String[] rline = br.readLine().split(" ");
        for(int i =0; i<line ; i++){
            x[i]= Integer.parseInt(rline[i]);
        }
        int max = x[0];
        for(int i =1 ; i<x.length;i++){
            if(max<x[i]){
                max = x[i];
            }
        }
        double result = 0;
        for(int i=0 ; i<x.length;i++){
            result = result+ ((double) x[i] /max*100);
        }
        System.out.println(result/x.length);



    }
}
