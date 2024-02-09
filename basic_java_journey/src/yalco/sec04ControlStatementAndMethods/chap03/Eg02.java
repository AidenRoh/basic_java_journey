package yalco.sec04ControlStatementAndMethods.chap03;

public class Eg02 {
    public static void main(String[] args) {
        //  종료조건이 없는 for 루프
        for (;;) {// 조건 없이 ;; 만 둘 경우 true로 인식하기 떄문에 영원히 실행하게됨
            System.out.println("영원히");
        }
        System.out.println("닿지 않아"); // ⚠️ 실행되지 않음 --> 위에 for문이 무한루프다 보니 이 실행문이 실행되지 않기때문에 'unreachable statement가 나옴


        //  종료조건을 만족시키지 못하는 무한루프
        for (int i = 0; i < 10; i++) {
            System.out.println("그래도");
            i--;
        }
        System.out.println("닿지 않아"); // ⚠️ 실행되지 않음
    }
}
