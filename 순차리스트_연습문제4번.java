package 자료구조.순차리스트_0314_2주차;

import java.util.ArrayList;
import java.util.List;

public class 순차리스트_연습문제4번 {

    public static void main(String[] args) {
        // 각 항은 계수, 지수
        int[][] poly1 = { {5,4}, {6,3}, {7,0} };
        int[][] poly2 = { {2,3}, {-4,2}, {3,1}, {4,0} };

        List<int[]> result = powPolynomial(poly1, poly2);

        System.out.println("다항식 A*B: " + polynomialToString(result));
    }

    public static List<int[]> powPolynomial(int[][] poly1, int[][] poly2) {
        List<int[]> resultList = new ArrayList<>();

        // 두 다항식 항의 곱 -> resultList에 추가하기
        for (int[] term1 : poly1) {
            for (int[] term2 : poly2) {
                int newCoef = term1[0] * term2[0];
                int newExpo = term1[1] + term2[1];

                // resultList에 같은 지수 항 더하기
                boolean found = false;
                for (int[] term : resultList) {
                    if (term[1] == newExpo) {
                        term[0] += newCoef;
                        found = true;
                        break;
                    }
                }
                // 같은 지수를 가진 항 X -> 새항추가
                if (!found) {
                    resultList.add(new int[] { newCoef, newExpo });
                }
            }
        }

        // 결과를 내림차순으로 정렬
        resultList.sort((a, b) -> b[1] - a[1]);

        return resultList;
    }

    public static String polynomialToString(List<int[]> poly) {
        StringBuilder sb = new StringBuilder();

        for (int[] term : poly) {
            if (term[0] == 0) continue; // 계수가 0인 항은 출력하지 않습니다.
            if (sb.length() > 0) sb.append(" + ");

            if (term[1] == 0) {
                sb.append(term[0]);
            } else if (term[1] == 1) {
                sb.append(term[0]).append("x");
            } else {
                sb.append(term[0]).append("x^").append(term[1]);
            }
        }

        return sb.toString();
    }
}
