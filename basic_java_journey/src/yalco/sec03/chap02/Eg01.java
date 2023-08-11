package yalco.sec03.chap02;

public class Eg01 {
    public static void main(String[] args) {
        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b;

        // float = 4 byte , double = 8 byte 이다. double 이 int 처럼 리터럴만 입력했을때 쓰이는 단위이고
        // double이 더 상세한 데이터를 담을 수 있기 때문에 Maximum, Minimum Value를 호출할때 float보다 더 크고 더 작다.
    }
}
