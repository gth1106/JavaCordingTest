package 자료구조;

import java.io.*;
import java.util.StringTokenizer;

public class _5번문제 {

    StringBuilder sb = new StringBuilder();
    static void input(){
        FastReader scan = new FastReader();
        String str = scan.nextLine();
        int dec = scan.nextInt();
        int decToBinaryResult = toBinary(dec);
        int decToBinaryResult2 = Integer.parseInt(toBinary2(dec));
        int bin = scan.nextInt();
        int bintoDecimalResult = toDecimal(bin);

        boolean palResult = isPalindrome(str);
        System.out.println("1) isPalindrome(\""+str+"\") == " +palResult);
        System.out.println("2-1) toBinary(\""+dec+"\") == " + decToBinaryResult + " -> 정수형태");
        System.out.println("2-2) toBinary2(\""+dec+"\") == " + decToBinaryResult2 + " -> 문자형태의 클래스(형변환)" );
        System.out.println("3) toDecimal(\""+bin+"\") == " + bintoDecimalResult);
    }

    static boolean isPalindrome(String s) {
        // 기저 조건
        if (s.length() <= 1) {
            return true;
        }
        // pal 탐색
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1)); //재귀
        } else {
            return false;
        }
    }
    static int toBinary(int dec) {
        if(dec == 0) return 0;
        return dec % 2 + 10 * toBinary(dec/2);
    }
    static String toBinary2(int dec){
        // 기저 조건
        if(dec ==0){
            return "";
        }
        return toBinary2(dec/2) + (dec % 2);
    }
static int i=0;
    static int toDecimal(int bin){
        return toDecimalReal(bin , 0);}

    static int toDecimalReal(int bin, int depth){
        if(bin==0){
            return 0;
        }
        int R = bin % 10 ;
        int result = R * (int)Math.pow(2,depth);
        return toDecimalReal(bin/10, depth+1) + result;
    }





    public static void main(String[] args) {
        input();
    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
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
        int nextInt(){ return  Integer.parseInt(next()); }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
}
