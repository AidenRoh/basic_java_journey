package yalco.sec03JavaTypesAndOperator.chap04;

public class Eg01Boolean {
    public static void main(String[] args) {
        // 참/거짓 둘 중 한 값을 가짐
        // 1 바이트(8비트)의 공간을 차지 -- 컴퓨터가 메모리상에서 집을 수 있는 가장 작은 단위가 1 바이트이기 때문
        // 리터럴 보다 반환값으로 많이 사용된다.

        boolean bool1 = true;
        boolean bool2 = false;

        boolean bool3 = !true;
        boolean bool4 = !false;

        boolean bool5 = !!bool3;
        boolean bool6 = !!!bool3;

        boolean bool7 = !(1 > 2);
        boolean bool8 = !((5 / 2) == 2.5);
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));
    }
}
