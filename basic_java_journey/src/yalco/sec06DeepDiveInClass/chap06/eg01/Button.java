package yalco.sec06DeepDiveInClass.chap06.eg01;

public class Button {
    private ButtonMode buttonMode = ButtonMode.LIGHT;
    private ButtonSpace buttonSpace = ButtonSpace.SINGLE;

    public void setButtonMode(ButtonMode buttonMode) {
        this.buttonMode = buttonMode;
    }

    public void setButtonSpace(ButtonSpace buttonSpace) {
        this.buttonSpace = buttonSpace;
    }
}

