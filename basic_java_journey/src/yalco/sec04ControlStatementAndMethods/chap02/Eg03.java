package yalco.sec04ControlStatementAndMethods.chap02;

public class Eg03 {
    public static void main(String[] args) {
        //  💡 break 관련 동작방식을 이용
        char yutnori = '도';

        switch (yutnori) {
            case '모': System.out.println("앞으로");
            case '윷': System.out.println("앞으로");
            case '걸': System.out.println("앞으로");
            case '개': System.out.println("앞으로");
            case '도': System.out.println("앞으로"); break;
            default:
                System.out.println("무효");
        } // break가 없을 시, true값이 나온 케이스를 기준으로 그 밑에 케이스들이 break문을 만날때까지 순차적으로 실행된다
            // e.g. '윷' 이라고 한다면 앞으로가 4번 실행됨
    }
}
