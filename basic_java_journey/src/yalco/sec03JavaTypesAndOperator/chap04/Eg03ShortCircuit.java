package yalco.sec03JavaTypesAndOperator.chap04;

public class Eg03ShortCircuit {
    public static void main(String[] args) {

        // !!! 단축 평가 !!!
        // && 앞의 것이  false면 뒤의 것을 평가할 필요가 없음!
        // || 앞의 것이 true면 뒤의 것을 평가할 필요가 없음!

        int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

        boolean bool1 = a < b && c++ < (d += 3); // a<b가 true 이기 때문에 뒤에 것 까지 확인할 필요가 있음 -> c++ < (ㅇ ++ 3) 값을 연산함
        boolean bool2 = a < b || e++ < (f += 3); // a<b가 true 라면 뒤에 것을 확인 할 필요도 없이 true 이기때문에 뒤에 e++ < (f += 3)을 연산하지 않음.

        boolean bool3 = a > b && c++ < (d += 3); // 🔴
        boolean bool4 = a > b || e++ < (f += 3);
    }
}
