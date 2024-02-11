package yalco.sec06DeepDiveInClass.chap02.pkg4;

import yalco.sec06DeepDiveInClass.chap02.pkg1.Parent;
//import yalco.sec06DeepDiveInClass.chap02Package.pkg3.Cls1;
//import yalco.sec06DeepDiveInClass.chap02Package.pkg3.Cls2;
//import yalco.sec06DeepDiveInClass.chap02Package.pkg3.Cls3;
import yalco.sec06DeepDiveInClass.chap02.pkg3.*;


public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //  ⭐️ 패키지가 다른 동명의 클래스들을 불러올 경우
        yalco.sec06DeepDiveInClass.chap02.pkg1.Child child1 = new yalco.sec06DeepDiveInClass.chap02.pkg1.Child();
        yalco.sec06DeepDiveInClass.chap02.pkg2.Child child2 = new yalco.sec06DeepDiveInClass.chap02.pkg2.Child();

        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        Cls3 cls3 = new Cls3();
    }
}
