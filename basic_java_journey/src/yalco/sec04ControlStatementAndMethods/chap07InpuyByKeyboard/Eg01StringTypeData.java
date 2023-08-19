package yalco.sec04ControlStatementAndMethods.chap07InpuyByKeyboard;

import java.util.Scanner
public class Eg01StringTypeData {
    public static void main(String[] args) {

        //  IDE가 최상단에 import java.util.Scanner 자동 작성
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(); // Space 같은 공백 단위로 끊어서 문자열 받음
        String str2 = sc.next();
        String str3 = sc.nextLine(); // 줄바꿈 단위로 받음

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
