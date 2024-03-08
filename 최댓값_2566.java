package _0304;

import java.io.*;
import java.util.StringTokenizer;

public class 최댓값_2566 {
    StringBuilder sb = new StringBuilder();
    static int[][] list = new int[9][9];
    static int Max=-1;
    static int low ;
    static int column;
    static void input(){
        FastReader scan = new FastReader();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                list[i][j]=scan.nextInt();
            }
        }

    }
    static void  maxFind_func(){
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if(list[i][j]>Max){
                    Max = list[i][j];
                    column =j+1 ;
                    low = i+1;

                }
            }
        }
        System.out.println(Max + "\n"+low+" "+column);
    }

    public static void main(String[] args) {
        input();
        maxFind_func();
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){ br = new BufferedReader(new InputStreamReader(System.in));}
        public FastReader(String s)throws FileNotFoundException {
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){ return Integer.parseInt(next()); }
        long nextLong(){return Long.parseLong(next());}
        double nextDouble(){return Double.parseDouble(next());}
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e ){
                e.printStackTrace();
            }
            return str;
        }
    }

}
