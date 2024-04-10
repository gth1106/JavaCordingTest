import java.util.LinkedList;
import java.util.Queue;

class Customer {
    String name;
    int arrivalTime;
    int serviceTime;
    int startTime;
    int endTime;
    int waitingTime;

    Customer(String name, int arrivalTime, int serviceTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    // 서비스 시작 및 종료 시간 설정
    void setServiceTime(int currentTime) {
        this.waitingTime = currentTime - this.arrivalTime;
        this.startTime = currentTime;
        this.endTime = this.startTime + this.serviceTime;
    }

    @Override
    public String toString() {
        return name + ": " + "도착시간=" + arrivalTime + ", 서비스시작시간=" + startTime + ", 서비스종료시간=" + endTime;
    }
}

public class CustomerServiceSimulation {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        queue.add(new Customer("A", 20, 5));
        queue.add(new Customer("B", 22, 4));
        queue.add(new Customer("C", 23, 2));
        queue.add(new Customer("D", 30, 3));

        int currentTime = 0;
        int totalWaitingTime = 0; // 모든 고객의 대기 시간 총합

        // 서비스 처리
        while (!queue.isEmpty()) {
            Customer currentCustomer = queue.peek();
            if (currentTime < currentCustomer.arrivalTime) {
                currentTime = currentCustomer.arrivalTime;
            }
            currentCustomer.setServiceTime(currentTime);
            currentTime = currentCustomer.endTime;

            totalWaitingTime += currentCustomer.waitingTime;
            System.out.println(currentCustomer);

            queue.remove();
        }

        // 평균 대기시간 계산 및 출력
        double averageWaitingTime = (double) totalWaitingTime / 4; // 여기서 4는 고객의 수
        System.out.println("평균 대기시간: " + averageWaitingTime);
    }
}
