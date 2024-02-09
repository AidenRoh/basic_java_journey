package yalco.sec03JavaTypesAndOperator.chap01;

public class Eg02Casting {
    public static void main(String[] args) {

        // 형변환 (Casting)

        byte byteNum;
        int smallIntNum = 123;

        //  명시적(강제) 형변환
        //  - 개발자 : "내가 책임질테니까 그냥 넣으세요."
        byteNum = (byte) smallIntNum;



        int intNum = 12345;

        //  ⚠️ 강제로 범주 외의 값을 넣을 경우 값 손실
        byteNum = (byte) intNum; // 💡 12345 % 128
    }
}