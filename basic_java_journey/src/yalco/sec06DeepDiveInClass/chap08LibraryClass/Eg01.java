package yalco.sec06DeepDiveInClass.chap08LibraryClass;

public class Eg01 {
    //  ⚠️ 불가. 생성자 확인해 볼 것
    Math mathInst = new Math();

    //  ⭐️ 정적 필드들

    //  자연로그의 밑
    double e = Math.E;
    double pi = Math.PI;

    // ⭐️ 정적 메소드들

    //  절대값. 숫자 자료형마다 오버로드
    int absInt = Math.abs(-5);
    double absDbl = Math.abs(-3.14);

    //  올림, 내림, 반올림
    double ceil = Math.ceil(2.34);
    double floor = Math.floor(4.56);
    double round1 = Math.round(2.34);
    double round2 = Math.round(4.56);

    //  큰 수 또는 작은 수 반환. 자료형마다 오버로드
    int largerInt = Math.max(2, 3);
    float smallerFlt = Math.min(1.2f, 3.4f);

    //  제곱
    double pow1 = Math.pow(4, 3); // double을 받지만 묵시 형변환
    double pow2 = Math.pow(4, 0.5);

    //  0.0 이상 1.0 미만 무작위 수
    double rand1 = Math.random();
    double rand2 = Math.random();
    double rand3 = Math.random();

    //  1에서 10 사이의 무작위 정수
    int _1to10_1 = (int) Math.ceil(Math.random() * 10);
    int _1to10_2 = (int) Math.floor(Math.random() * 10) + 1;

    //  ~Exact 메소드들 : 자료형의 범위를 넘기면 오류 발생
    int add1 = Math.addExact(2_147_483_645, 2);
    int add2 = 2_147_483_645 + 3;
    //  int add3 = Math.addExact(2_147_483_645, 3);
}
