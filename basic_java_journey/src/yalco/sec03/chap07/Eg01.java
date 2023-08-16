package yalco.sec03.chap07;

public class Eg01 {
    public static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        //  💡 formatted : 주어진 형식에 따라 문자열 생성
        //  ⭐️ 13+버전에 추가됨. 편의상 강의에서 많이 사용할 것
        String str2 = str1.formatted(circle, two, PI);

        //  💡 이전 버전에서의 방식. 실무에서 사용하려면 기억
        String str3 = String.format(str1, circle, two, PI);



        //  ⭐️ 시스템의 printf 메소드 : String.format과 같은 형식으로 출력
        //  줄바꿈을 하지 않으므로 직접 넣어줘야 함
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);

        // null 값이라는 것은 힙 메모리에 인스턴스조차 만들지 않은 상태이다. 컴파일 단계에선 초기화 되지 않은 인스턴스처럼 컴파일 에러를 내는 것처럼
        // null 값으로 되어 있는 것을 판별하지 않지만,
        // 실제로 run을 하게 될때, 에러를 만나게 된다.
    }
}
