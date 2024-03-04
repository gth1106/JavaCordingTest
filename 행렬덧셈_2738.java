package _0304;

import java.io.*;
import java.util.StringTokenizer;

public class 행렬덧셈_2738 {
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static int[][] two_list;
    static int[][] two_list2;
    static void input(){  // 입력문
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        two_list = new int[N][M];
        two_list2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
               two_list[i][j]=scan.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                two_list2[i][j]=scan.nextInt();
            }
        }
        sum_func();
    }
    static void sum_func(){
        for(int i=0;i<N;i++) {
            for (int j = 0; j < M; j++) {
                sb.append(two_list[i][j] + two_list2[i][j]).append(' ');

            }
            sb.append('\n');
        }

    }
    public static void main(String[] args) {
        input();

        System.out.println(sb.toString());
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
