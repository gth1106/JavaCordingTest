import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_5597 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int Student[] = new int[31];


        for(int i=0;i<28;i++){
            Student[Integer.parseInt(br.readLine())]=1;
        }

        for(int i=1;i<Student.length;i++){
            if(Student[i] != 1){
                Student[i]=i;
                System.out.println(Student[i]);
            }
        }

    }

}
