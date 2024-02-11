package yalco.sec05OOP.chap02.eg03;

public class Main2 {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 10000),
                new ChickenMenu("양념치킨", 12000),
                new ChickenMenu("화덕구이", 15000, "bake")
        };
        YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("오븐구이");


        int avgChickenPrice = 12000;
        ChickenMenu chickenMenu1 = new ChickenMenu("양념치킨", 12000);

        raisePrice(avgChickenPrice, chickenMenu1, 1000);
    }

    public static void raisePrice (int avg, ChickenMenu menu, int amount) {
        avg += amount;
        menu.price += amount;
    }
}
