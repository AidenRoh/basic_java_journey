package yalco.sec05OOP.chap05Extends.eg02;

public class Main {
    public static void main(String[] args) {
        Button entrButton = new Button("Enter");
        ShutDownButton stdnButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);

        entrButton.func();

        System.out.println("\n- - - - -\n");

        stdnButton.func();

        System.out.println("\n- - - - -\n");

        tglButton.func();
        tglButton.func();
        tglButton.func();

    }
}
