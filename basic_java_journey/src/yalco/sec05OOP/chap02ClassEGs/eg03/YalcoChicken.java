package yalco.sec05OOP.chap02ClassEGs.eg03;

public class YalcoChicken {
    int no;
    String name;
    ChickenMenu[] menus;

    YalcoChicken (int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu (String name) {
        for (ChickenMenu menu : menus) {
            if (menu.name.equals(name)) { // 🔴
                return menu;
            }
        }
        return null;
    }
}