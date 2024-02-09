package yalco.sec03JavaTypesAndOperator.chap08;

public class Eg01BasicArray {
    public static void main(String[] args) {
        //  💡 사용할 자료형 뒤에 []를 붙여 선언
        char[] yutnori = {'도', '개', '걸', '윷', '모'};

        //  💡 length : 배열의 길이 반환
        int length = yutnori.length;

        //  💡 [] 안에 인덱스 정수를 넣어 접근
        //  ⭐ 0부터 시작
        char first = yutnori[0];
        char last = yutnori[yutnori.length - 1];



        //  💡 초기화하지 않고 일단 선언하기
        //  ⭐ 어떤 값으로 초기화되는지 확인
        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        double[] dblAry = new double[3];
        char[] chrAry = new char[3]; // 아래 확인
        String[] strAry = new String[3];

        //  아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
        char NUL = chrAry[0];



        //  다음과 같이 원하는 위치의 값 변경
        intAry[0] = 123;
        intAry[1] = 456;
        intAry[2] = 789;

        // 배열같은 경우 미리 크기를 정해놓는 특정이 있다. 크기가 얼마나 커질지 모르는 상황이라면, 컬렉터에 list같은 것을 사용하게 된다.
    }
}
