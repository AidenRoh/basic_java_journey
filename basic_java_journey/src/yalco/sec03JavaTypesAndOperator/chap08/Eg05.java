package yalco.sec03JavaTypesAndOperator.chap08;

public class Eg05 {
    public static void main(String[] args) {
        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; // 🔴

        str1 = "고점에 익절";
    }
}
