package yalco.sec05OOP.chap09Interface.eg01;

public interface Hunter {
    String position = "포식자"; // ⭐️ final - 초기화하지 않을 시 오류
    void hunt ();
}