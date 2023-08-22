package yalco.sec05OOP.chap05InheritanceExtends.eg01;

public class YalcoChickenDT extends YalcoChicken { // 상속한다는 것은 상위클래스의 맴버들 (YalcoChicken의 필드 메서드 내부 클래스를) 을 공유하는 것을 의미합니다.
    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name) {
        super(no, name); // 다음 예제에서 다룰 것
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder () {
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}
