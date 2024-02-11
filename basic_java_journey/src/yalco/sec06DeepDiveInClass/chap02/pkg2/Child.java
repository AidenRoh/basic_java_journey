package yalco.sec06DeepDiveInClass.chap02.pkg2;

//  상단에 임포트 필요
import yalco.sec06DeepDiveInClass.chap02.pkg1.Parent;

public class Child extends Parent {
    //  Parent와 다른 패키지
    //  int aa = a; // ⚠️ 불가 private
    //  int bb = b; // ⚠️ 불가 default
    int cc = c; // 💡 protected - 다른 패키지, 상속관계
    int dd = d;
}