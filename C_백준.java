import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;

 class Mydata {
     int value;
    public  Mydata(int value) {
        this.value =value;
    }
    static Mydata create(int v){
        return new Mydata(v);
    }

     @Override
     public String toString() {
         return ""+value;
     }
 }

public class C_백준 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        List<Mydata> list = new Vector<>(); // 벡터형인데 리스트형으로도 표현
        // 다형성

        list.add(Mydata.create(1));
        list.add(Mydata.create(2));
        list.add(Mydata.create(3));

        method1(list);
    }


    static void method1(List<Mydata> list){
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
