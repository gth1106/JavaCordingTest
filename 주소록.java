package 자료구조.연결리스트_0321_3주차.과제;

import java.util.LinkedList;
import java.util.List;

class Node{
    private  String name;
    private  String phoneNumber;
    private  String email;
    private  String address;
    public  String getName() {
        return name;
    }

    public  String getPhoneNumber() {
        return phoneNumber;
    }
    public  String getEmail() {
        return email;
    }
    public  String getAddress() {
        return address;
    }

    public Node(String name, String phoneNumber, String email , String address){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
    }
    @Override
    public String toString(){
        return ( "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", Address: " + address );
    }

}
public class 주소록 {
    static LinkedList<Node> list = new LinkedList<>();

    // 데이터 추가
    public static void appendOfData(Node data){
        list.add(data);
    }

    // 특정 데이터 삭제
    public static void deleteOfData(String data){
        list.removeIf(node -> node.getName().equals(data) ||
                node.getPhoneNumber().equals(data) ||
                node.getEmail().equals(data) ||
                node.getAddress().equals(data));
    }

    // 특정 데이터 탐색
    public static void selectOfData(String data){
        boolean found = false;
        for(Node node : list){
            if (node.getName().equals(data) || node.getPhoneNumber().equals(data) ||
                    node.getEmail().equals(data) || node.getAddress().equals(data)) {
                System.out.println(node);
                found = true;
            }
        }
        if (!found) {
            System.out.println("탐색 -> 일치 데이터 X");
        }
    }

    // 리스트 출력
    public static void printList() {
        for (Node node : list) {
            System.out.println(node);
        }
    }

    public static void main(String[] args) {
        // 예시 데이터 추가
        Node node = new Node("고태현", "010-2475-6959", "gth6627@naver.com", "동부로");
        Node node2 = new Node("권정무", "010-1111-1111", "kmj@naver.com", "서부로");
        appendOfData(node);
        appendOfData(node2);

        // 데이터 추가 후 출력
        System.out.println("추가 후 리스트:");
        printList();

        // 특정 데이터 탐색
        System.out.println("\n탐색 결과:");
        selectOfData("고태현");

        // 특정 데이터 삭제
        System.out.println("\n고태현리스트 삭제 후 리스트:");
        deleteOfData("고태현");
        printList();

        System.out.println("\n일치하는 데이터가 없는 리스트:");
        selectOfData("김근형");

    }
}
