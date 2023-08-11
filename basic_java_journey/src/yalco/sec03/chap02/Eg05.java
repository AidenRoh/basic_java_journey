package yalco.sec03.chap02;

public class Eg05 {
    public static void main(String[] args) {
        int int1 = 5;
        float flt1 = 2f;
        double dbl1 = 3;
        double dbl2 = 7;

        //  💡 정수 자료형과 실수 자료형의 계산은 실수 반환
        int flt2 = int1 / flt1; // ⚠️ 불가
        double dbl3 = int1 / dbl1;
        double dbl4 = dbl2 / int1;

        //  💡 리터럴로 작성시 double임을 명시하려면 .0을 붙여줄 것
        double dbl5 = 5 / 2; // 정수 자료형은 실수 자료형에 그냥 넣을 수 있기 때문에 여가서 나온 5와 2는 int value이다 그렇기 때문에 2.5가 아닌 2가 나온다
        // 나머지는 버리는 특징을 가지고 있기때문
        double dbl6 = 5.0 / 2; // 그것을 방지하기 위해선 둘 중 하나에 '.0' 을 넣어줘 실수화 시키면된다.
        double dbl7 = (double) 5 / 2;

        float fltNum = 4.567f;
        double dblNum = 5.678;

        //  💡 정수 자료형에 강제로 넣으면 소수부를 '버림'
        int int2 = (int) fltNum;
        int int3 = (int) dblNum;
    }
}
