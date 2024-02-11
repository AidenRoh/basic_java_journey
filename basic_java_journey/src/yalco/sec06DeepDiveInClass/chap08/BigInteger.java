package yalco.sec06DeepDiveInClass.chap08;

public class BigInteger {
    long maxLong = Long.MAX_VALUE;

    //  💡 BigInteger 클래스
    //  - Long에서 다룰 수 있는 최대 정수 이상의 수를 다룰 수 있음
    BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
    BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

    BigInteger bigInt3 = bigInt1.add(bigInt2);
    BigInteger bigInt4 = bigInt2.subtract(bigInt1);
    BigInteger bigInt5 = bigInt1.multiply(bigInt2);
    BigInteger bigInt6 = bigInt2.divide(bigInt1);

    int bigIntCompare1 = bigInt1.compareTo(bigInt2);
    int bigIntCompare2 = bigInt2.compareTo(bigInt1);
}
