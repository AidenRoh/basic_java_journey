package yalco.sec03JavaTypesAndOperator.chap04;

public class Eg02AndOr {
    public static void main(String[] args) {

        // AND
        boolean bool1 = true && true;
        boolean bool2 = true && false;
        boolean bool3 = false && true;
        boolean bool4 = false && false;

        // OR
        boolean bool5 = true || true;
        boolean bool6 = true || false;
        boolean bool7 = false || true;
        boolean bool8 = false || false;

        int num = 4;

        // is~~~ 로 시작하는 이름 명칭을 많이 사용한다.
        boolean isPositiveAndOdd = num >= 0 && num % 2 == 1;
        boolean isPositiveOrOdd = num >= 0 || num % 2 == 1;

        boolean isPositiveAndEven = num >= 0 && num % 2 == 0;
        boolean isPositiveOrEven = num >= 0 || num % 2 == 0;

        num = 6;

        //  💡 &&가 ||보다 우선순위 높음
        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10);

        // 1. (num % 3 == 0) && (num % 2 == 0)
        // 2. (num > 0) && (num > 10)
        // 3. 1. || 2.
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);

        // !!! 단축 평가 !!!
        // && 앞의 것이  false면 뒤의 것을 평가할 필요가 없음!
        // || 앞의 것이 true면 뒤의 것을 평가할 필요가 없음!
    }
}
