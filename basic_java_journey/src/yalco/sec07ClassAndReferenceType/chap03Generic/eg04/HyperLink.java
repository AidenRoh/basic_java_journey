package yalco.sec07ClassAndReferenceType.chap03Generic.eg04;

public class HyperLink implements Clickable {
    @Override
    public void onClick() {
        System.out.println("링크로 이동");
    }
}