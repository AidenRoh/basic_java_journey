package yalco.sec05OOP.chap08AbstractClass.eg02;

public abstract class FormElement {
    protected int space;

    public FormElement(int space) {
        this.space = space;
    }

    abstract void func ();
}