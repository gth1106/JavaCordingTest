import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class asdasd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int []arr = new int[line];
        int max =-1 ;
        int min = 99;
        String[] sline = br.readLine().split(" ");
        for(int i=0 ; i<line ; i++){
            arr[i]= Integer.parseInt(sline[i]);
        }

        for(int i=0 ; i<arr.length;i++){
            if(arr[i]>max){  // -1  20  35 > 20
                max = arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min+ " "+ max);
    }
}
