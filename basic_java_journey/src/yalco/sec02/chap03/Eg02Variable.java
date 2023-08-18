package yalco.sec02.chap03;

public class Eg02Variable{
    public static void main(String[] args) {


        /*
            변수
            데이터를 담는 주머니
            - 특정 값을 코드의 여러 곳에서 사용할 때
            - 해당 값이 프로그램의 동작에 영향ㅇ르 끼치는 상태로 작용할
            - 값을 언제든지 변경할 수 있는 데이터
            - Java는 정적 자료형이다 즉, 1. 자무니와 자료형이 다른 데이터는 넣을 수 없다. 2. 크기가 다른 주판으로 갈아끼울 수 없다 3. 어길 시 컴파일 단계에서 차단된다.
         */
        System.out.println("원주율: " + 3.14);
        System.out.println("원의 둘레: 지름 X " + 3.14);
        System.out.println("원의 넓이: 반지름의 제곱 X " + 3.14);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + 3.14);

        System.out.println("\n- - - - -\n"); // 💡 \n : 줄바꿈

        double pi = 3.14;

        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);

        System.out.println("\n- - - - -\n");

        pi = 3.14159265358979; // 💡 값이 바뀔 수 있으므로 '변수'라 부름

        System.out.println("원주율: " + pi);

        //  자바의 변수: 앞에 담을 데이터의 자료형을 명시
        //  - (이후 배울 var 제외)
        int age; // 💡 변수 선언: 주머니 만들기

        //  ⚠️ 아직 값이 없으므로 사용할 수는 없음
        System.out.println(age);

        age = 20; // 초기화: 빈 주머니에 값 넣기

        //  이제 해당 값을 사용 가능
        System.out.println(age);

    }
}
