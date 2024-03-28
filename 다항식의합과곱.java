package 자료구조.연결리스트_0321_3주차.과제;

import java.util.LinkedList;

class Polynomial {
    int coef;
    int expo;

    public Polynomial(int coef, int expo) {
        this.coef = coef;
        this.expo = expo;
    }

    @Override
    public String toString() {
        if (expo == 0) {
            return String.format("%d", coef);
        } else if (expo == 1) {
            return String.format("%dx", coef);
        } else {
            return String.format("%dx^%d", coef, expo);
        }
    }
}

public class 다항식의합과곱 {

    public static LinkedList<Polynomial> addPolynomials(LinkedList<Polynomial> poly1, LinkedList<Polynomial> poly2) {
        LinkedList<Polynomial> result = new LinkedList<>();
        int i = 0, j = 0;
        while (i < poly1.size() && j < poly2.size()) {
            Polynomial term1 = poly1.get(i);
            Polynomial term2 = poly2.get(j);
            if (term1.expo > term2.expo) {
                result.add(term1);
                i++;
            } else if (term1.expo < term2.expo) {
                result.add(term2);
                j++;
            } else {
                int newCoefficient = term1.coef + term2.coef;
                if (newCoefficient != 0) {
                    result.add(new Polynomial(newCoefficient, term1.expo));
                }
                i++;
                j++;
            }
        }
        while (i < poly1.size()) result.add(poly1.get(i++));
        while (j < poly2.size()) result.add(poly2.get(j++));
        return result;
    }

    public static LinkedList<Polynomial> multiplyPolynomials(LinkedList<Polynomial> poly1, LinkedList<Polynomial> poly2) {
        LinkedList<Polynomial> result = new LinkedList<>();
        for (Polynomial term1 : poly1) {
            for (Polynomial term2 : poly2) {
                int newCoefficient = term1.coef * term2.coef;
                int newExponent = term1.expo + term2.expo;
                addTerm(result, newCoefficient, newExponent);
            }
        }
        return result;
    }

    private static void addTerm(LinkedList<Polynomial> result, int coefficient, int exponent) {
        for (Polynomial term : result) {
            if (term.expo == exponent) {
                term.coef += coefficient;
                return;
            }
        }
        result.add(new Polynomial(coefficient, exponent));
    }

    public static void main(String[] args) {
        LinkedList<Polynomial> poly1 = new LinkedList<>();
        LinkedList<Polynomial> poly2 = new LinkedList<>();

        poly1.add(new Polynomial(5, 4));
        poly1.add(new Polynomial(6, 3));
        poly1.add(new Polynomial(7, 0));

        poly2.add(new Polynomial(2, 3));
        poly2.add(new Polynomial(-7, 2));
        poly2.add(new Polynomial(3, 1));

        LinkedList<Polynomial> sum = addPolynomials(poly1, poly2);
        LinkedList<Polynomial> product = multiplyPolynomials(poly1, poly2);

        System.out.println("다항식의 합: " + sum);
        System.out.println("다항식의 곱: " + product);
    }
}
