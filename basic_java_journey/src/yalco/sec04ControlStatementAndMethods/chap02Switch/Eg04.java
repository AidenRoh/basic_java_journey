package yalco.sec04ControlStatementAndMethods.chap02Switch;

public class Eg04 {
    public static void main(String[] args) {
        byte month = 1;
        byte season;

        switch (month) {
            case 1: case 2: case 3: // 예제 3과 같이 1,2,3 이라면 break문을 만날떄까지 무언가를 실행시키는데, 여기선 season=1하나 있으니 저거하나만 실행된다
                season = 1;
                break;
            case 4:
            case 5:
            case 6:
                season = 2;
                break;
            case 7: case 8: case 9:
                season = 3;
                break;
            case 10: case 11: case 12:
                season = 4;
                break;
            default:
                season = 0;
        }

        System.out.println(
                season > 0
                        ? "지금은 %d분기입니다.".formatted(season)
                        : "무효한 월입니다."
        );
    }
}
