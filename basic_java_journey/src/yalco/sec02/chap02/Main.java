package yalco.sec02.chap02;

import java.sql.SQLOutput;

public class Main {

    /** 1. 자바 클래스 이름은 해당 클래스 파일 이름과 같아야한다.
     *  2. 만약 달라진다면 파일에 우클릭을 해서 리팩토링을 통해 이름을 같게 맞추거나 클래스 이름을 파일이름에 맞게 변경해야한다.
     */
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Computer will ignore this part as it is comment
        // System.out.println("먼저 가, 난 틀렸어");

        System.out.println("Holla");

        // simple comment
        System.out.println("look at the right side"); // comment's here!

        /* if you start with '/*' you can make a comment
        as much as you want, even it continues next line.
        when it compiles, compiler will ignore comments
         */
    }
}
