package yalco.sec04ControlStatementAndMethods.chap07;

import java.util.Scanner;

public class Eg02OtherTypesOfData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();
        // 🧪 기타 next~ 메서드들 확인해 볼 것

        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);
    }
}
