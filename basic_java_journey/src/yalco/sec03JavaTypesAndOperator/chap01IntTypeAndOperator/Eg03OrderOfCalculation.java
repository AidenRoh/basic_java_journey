package yalco.sec03JavaTypesAndOperator.chap01IntTypeAndOperator;

public class Eg03OrderOfCalculation {
    public static void main(String[] args) {
        int a = 1 + 2;
        int b = a - 1;
        int c = b * a;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;
    }
}
