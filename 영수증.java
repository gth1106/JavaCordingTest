import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영수증 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        int total = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());

        for(int i=0 ; i<size;i++){
            String []line2=br.readLine().split(" ");
            int a =Integer.parseInt(line2[0]);
            int b =Integer.parseInt(line2[1]);

            total -= a*b;
        }
        if (total==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
