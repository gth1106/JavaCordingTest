package 자료구조;

public class TypeTest {
    public static void main(String[] args){
         // byte형
        System.out.printf("%d, %d, %d\n", (byte)0x7F, (byte)0xFF, (byte)0x80);
         // short형
        System.out.printf("%d, %d, %d\n", (short)0x7FFF, (short)0xFFFF, (short)0x8000);
        // int형
        System.out.printf("%d, %d\n", 0x7FFF_FFFF, 0x8000_0000);
        // long형
        System.out.printf("%d, %d\n", 0x7FFFFFFF_FFFFFFFFL, 0x80000000_00000000L);
    }
}
