package 자료구조.스택_0328_4주차.과제.배열스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Postfix_Notation {

    static StringBuilder sb = new StringBuilder();

    static void input(){
        FastReader scan = new FastReader();
        String str = scan.nextLine();
        System.out.println(Postfix(str));
    }
    static int Postfix(String str){
        Stack<Integer> stack = new Stack<>();
        String[] token = str.split("\\s+");

        for(String t : token){
            if(t.matches("\\d+")){
                stack.push(Integer.parseInt(t));
            }else {
                int b = stack.pop(); // 2번째
                int a = stack.pop(); // 1번째
                switch ( t ) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;

                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
//        String str = "  2 5 + 3 * 4 -  ";
        input();
    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}

        String next(){
            while (st == null || !st.hasMoreElements()) {

                try {
                    st = new StringTokenizer((br.readLine()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
