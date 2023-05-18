
class BankAccount { // 은행 계좌
 public int accountNumber; // 계좌 번호
 public String owner; // 예금주
 public int balance; // 잔액을 표시하는 변수
 public double interest; // 이자율  예 : 2% => 0.02
 
 void deposit(int amount) { // 저금
  balance = balance + amount;
 }

 void withdraw(int amount) { // 인출
  balance -= amount;
 }
 
 int 이자계산() { // 현재 잔액에 이자율을 이용하여 이자를 계좌에 추가하는 메소드 , 반환값은 이자 금액
  int 이자 = 0;
  이자 =  (int) (this.balance * interest);
  balance = balance + 이자;
  return 이자;
 }


 public String toString() {
  return "현재 잔액은 " + balance + "입니다.";
 }
}

public class des{
 public static void main(String[] args) {
  BankAccount  이몽룡A계좌 = new BankAccount();
  BankAccount  이몽룡B계좌;
  // 객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
  
  
  이몽룡A계좌.balance = 10000;
  System.out.println(이몽룡A계좌.toString());
  이몽룡A계좌.interest = 0.05;
  이몽룡A계좌.withdraw(8000);
  System.out.println(이몽룡A계좌.toString());
  int 이자 = 이몽룡A계좌.이자계산();
  System.out.println("이자는 " + 이자 + "이고, " + 이몽룡A계좌.toString());

 }
}