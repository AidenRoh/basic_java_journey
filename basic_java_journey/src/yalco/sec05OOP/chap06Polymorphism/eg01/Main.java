package yalco.sec05OOP.chap06Polymorphism.eg01;

public class Main {
    public static void main(String[] args) {
        //  💡 가능 - 자식 클래스는 부모 클래스에 속함
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);
        // 잘 생각을 해보자 자식클래스가 부모클래스를 extends 하는 순간 사식클래스는 부모클래스의 필드 매서드 등을 다 사용할 수 있다.
        // 부모의 맴버들도 사용하고 자식 맴버도 사용을해서 클래스를 완성시켰을 때, 이 클래스의 객체를
        // 부모가 참조할 수 있다는 게 다형성인데, 부모클래스 입장에선 어찌됐든 자식 클래스에 부모클래스의 요소도 함께 들어있으니
        // 자식 클래스의 인스턴스를 부모 클래스가 참조할 수 있다고 생각하면 말이 되지 않을까?

        //  ⚠️ 불가
        ShutDownButton button4 = new Button("Enter");
        ToggleButton button5 = new ShutDownButton();

        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button button : buttons) {
            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
            button.func();
        }


        //-----

        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        //  true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        //  false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
        boolean typeCheck7 = shutDownButton instanceof ToggleButton;

        //----

        Button[] buttons2 = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }
    }
}
