package 자료구조.연결리스트_0321_3주차.과제;

import java.math.BigInteger;
import java.util.LinkedList;

public class PowOfTwo {
    public static void main(String[] args) {
        // long 자료형 -> 2^63-1 , int ->30억 == 2^31-1 , Double
        System.out.println("Double 자료형의 최대값 " +Double.MAX_VALUE);
        double result = Math.pow(2, 100);
        LinkedList<String> list = new LinkedList<>();
        list.add(String.valueOf(result));
        System.out.println("\nDouble 자료형의 2의 100 제곱은 : " + list.get(0));

        // BigInteger 자료형
//        System.out.println("해당 자료형 최대값 " + BigInteger.MAX_VALUE);
        BigInteger two = BigInteger.valueOf(2);
        BigInteger result2 = two.pow(100);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add(result2.toString());

        System.out.println("BigInteger 자료형의 2의 100 제곱은 : " + list2.get(0));
    }
}