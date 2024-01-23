import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] basket = new int[26];
        String st = br.readLine();

        for(int i=0 ;i<basket.length;i++){
            basket[i]=-1;
        }
        for(int i=0;i<st.length();i++){
            char input = st.charAt(i);
            if(basket[input-'a'] == -1){
                basket[input-'a']=i;
            }
        }
        for(int k:basket){
            System.out.print(k+" ");
        }


    }
}
