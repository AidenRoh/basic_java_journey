package yalco.sec07ClassAndReferenceType.chap03.eg04;

public class HyperLink implements Clickable {
    @Override
    public void onClick() {
        System.out.println("링크로 이동");
    }
}