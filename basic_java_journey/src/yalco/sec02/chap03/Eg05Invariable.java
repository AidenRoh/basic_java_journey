package yalco.sec02.chap03;

public class Eg05Invariable {
    public static void main(String[] args) {
        //  💡 final 연산자 : 변수의 값을 바꾸지 못하게 만듦 / 값을 한번만 넣을 수 있는 주머니
        final int INT_NUM = 1; // 상수는 보통 대문자로 이름을 짖는 것이 국룰
        INT_NUM = 2; // ⚠️ 불가

        /*
        자바의 식별자 명명 규칙

        - 문자, 숫자, 언더스코어 `_`, 달러사인 `$` 포함 가능
        - 한글도 사용은 가능 - 권장되지 않음
        - 문자 또는 `$`, `_`로 시작해야 함
        - 공백 *(스페이스)* 을 포함할 수 없음
        */

        //  사용 가능
        int yalco, _yalco, $yalco, 얄코;

        // 사용 불가
        int 1yalco;
        int yal co;
        int #yalco;

        /** 식별자 명명 관례
         - 패키지는 소문자로만
         - 클래스는 대문자로 시작
         - 상수는 대문자와 `_` 사용
            e.g. `PI`, `COMPANY_NAME`
         - 변수나 메서드는 낙타 표기법 *camel case* 사용
            e.g.  `myName`, `addNewObject`

         예약어 *reserved words*
         - 식별자로 사용 불가한 키워드들
         - 자바 언어에서 특정 의미를 갖고 있는 단어들
            e.g. int, double, instanceof etc.
         변수 이름으로 예약어를 사용할 수 없다
         */
    }
}
