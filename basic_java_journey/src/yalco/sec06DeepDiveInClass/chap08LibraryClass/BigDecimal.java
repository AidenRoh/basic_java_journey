package yalco.sec06DeepDiveInClass.chap08LibraryClass;

public class BigDecimal {
    //  부동소수점 오차
    var num1 = 0.2 + 0.3f;
    var num2 = 0.3f * 0.7f;
    var num3 = 0.4 - 0.3;
    var num4 = 0.9f / 0.3;
    var num5 = 0.9 % 0.6;

    //  💡 BigDecimal 클래스
    //  - 부동소수점 오차를 해결

    var num6 = new BigDecimal("0.2")
            .add(new BigDecimal("0.3"))
            .floatValue();

    var num7 = new BigDecimal("0.3")
            .multiply(new BigDecimal("0.7"))
            .floatValue();

    var num8 = new BigDecimal("0.4")
            .subtract(new BigDecimal("0.3"))
            .floatValue();

    var num9 = new BigDecimal("0.9")
            .divide(new BigDecimal("0.3"))
            .doubleValue();

    var num10 = new BigDecimal("0.9")
            .remainder(new BigDecimal("0.6"))
            .doubleValue();
}
