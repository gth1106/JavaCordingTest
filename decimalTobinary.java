package 자료구조.스택_0328_4주차.과제.배열스택;

import _0304.inputTest;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class decimalTobinary {

        static StringBuilder sb = new StringBuilder();

        static void input() {
            FastReader scan = new FastReader();
            int num = scan.nextInt();
            System.out.println(decimalTobinary(num));
        }

        public static void main(String[] args) {
            input();
        }
        static String decimalTobinary(int num){
            if(num == 0){
                return "0";
            }
            Stack<Integer> stack = new Stack<>();
            while (num>0){
                stack.push(num%2);
                num = num / 2;
            }
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
            return sb.toString();
        }


        static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            public FastReader(String s) throws FileNotFoundException {
                br = new BufferedReader(new FileReader(new File(s)));
            }

            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
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

