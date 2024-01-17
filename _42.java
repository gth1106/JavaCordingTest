import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _42 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        HashSet<Integer> cnt = new HashSet<>();
        for(int i=0; i<10;i++){
            arr[i]=Integer.parseInt(br.readLine());
            cnt.add(arr[i]%42);
        }
        System.out.println(cnt.size());

//        for(int k : arr){
//            System.out.println(k);
//        }

    }
}
