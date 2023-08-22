package yalco.sec05OOP.chap06Polymorphism.eg01;

public class Button {
    private String print;

    public Button(String print) {
        this.print = print;
    }

    public void func () {
        System.out.println(print + " 입력 적용");
    }
}
