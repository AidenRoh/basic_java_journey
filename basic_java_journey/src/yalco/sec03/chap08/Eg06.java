package yalco.sec03.chap08;

public class Eg06 {
    public static void main(String[] args) {
        //  상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};

        //  ⚠️ 다른 배열을 할당하는 것은 불가
        NUMBERS = new int[] {2, 3, 4, 5, 6};

        //  ⭐️ 배열의 요소를 바꾸는 것은 가능
        NUMBERS[0] = 11;

        // 상수는 참조자료형의 주소를 고정하는 것으로 볼 수 있음.
    }
}
