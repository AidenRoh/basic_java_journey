package yalco.sec04ControlStatementAndMethods.chap03;

public class Eg03 {
    public static void main(String[] args) {
        //  4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i; // c++ 을 사용했기 때문에 multiOf4[c++] = i; 가 실행이 된 후에 c 값이 1이 더해진다
            }
        }


        //  💡 배열 순환 (기본적인 방법)
        for (int i = 0; i < multiOf4.length; i++) {
            System.out.println(multiOf4[i]);
        }


        System.out.println("\n- - - - -\n");

        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용
        for (int num : multiOf4) {  //  for(int num: multiOf4) 에서 multiOf4 가 배열, num은 그 배열의 요소를 하나하나 빼서 잠시 넣는 변수
            System.out.println(num);
        }

        // foreach + tab하면 자동으로 형식이 만들어짐

        System.out.println("\n- - - - -\n");

        int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }


        System.out.println("\n- - - - -\n");

        for (String s : "호롤롤로".split("")) { //.split이 반환하는 값이 배열이기 때문에 활용가능하다!
            System.out.println(s);
        }
    }
}
