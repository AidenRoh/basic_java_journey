package yalco.sec05OOP.chap02.eg01;

public class Main {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        slime1.attack(slime2);

        // 생성자를 통해서 만들어진 인스턴스는 참조형 데이터이기 때문에 인자로 전달될 시 내용이 변경될 수 있음
    }
}
