package yalco.sec05OOP.chap05InheritanceExtends.eg02;

public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출
    }

    //  💡 부모의 메소드를 override // ShutDownButton은 Button의 메서드인 func 도 공유를 받기 때문에 오버라이딩을 하지 않으면
    // func 이라는 이름으로 ShutDownButton 만의 메서드를 만들 수는 없다.
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
