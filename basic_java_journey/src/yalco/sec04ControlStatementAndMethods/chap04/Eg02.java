package yalco.sec04ControlStatementAndMethods.chap04;

public class Eg02 {
    public static void main(String[] args) {
        //  100보다 작은 3의 배수들 출력해보기

        int i = 1;

        // ⚠️ 의도대로 작동하지 않음. 이유는?
        while (true) {
            if (i % 3 != 0) continue;  // 🔴
            System.out.println(i);

            if (i++ == 100) break;
        }

        int i = 1;

        while (true) {
            if (i++ == 100) break;
            if ((i - 1) % 3 != 0) continue;

            System.out.println(i - 1);
        }

        int i = 1;

        //  보다 가독성을 높이고 의도를 잘 드러낸 코드
        while (true) {
            int cur = i++;

            if (cur == 100) break;
            if (cur % 3 != 0) continue;

            System.out.println(cur);
            // 순서: int cur 에 변수 i값 들어감 -> i값으로 if 문 돌림 -> 그 후 i++ 실행됨
        }
    }
}
