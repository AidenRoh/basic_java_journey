package yalco.sec05OOP.chap10singleton.eg01;

public class Setting {
    private int volume = 5;

    public int getVolume() {
        return volume;
    }
    public void incVolume() { volume++; }
    public void decVolume() { volume--; }
}