package yalco.sec04ControlStatementAndMethods.chap04WhileAndDoWhile;

public class Eg04Overlap {
    public static void main(String[] args) {
        final int LINE_WIDTH = 5;

        int lineWidth = LINE_WIDTH;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println(); // Enter와 같은 의미
        } // 순서 lineWidth = 5가 startToPrint에 변수로 초기화 --> 두 번째 While문 발동 -> ***** -> System.out.println() --> lineWidth-- 발동
    }
}
