import java.util.ArrayList;
import java.util.List;

abstract class MenuItem {
    public abstract void serve();
}

// เครื่องดื่ม (Beverages)
class Espresso extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ เอสเปรสโซ");
    }
}

class Latte extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ ลาเต้");
    }
}

class Milkshakes extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ นมปั่น");
    }
}

class FruitJuices extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ น้ำผลไม้");
    }
}

// ขนม (Pastries)
class Croissant extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ ครัวซองต์");
    }
}

class ChocolateCake extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ เค้กช็อกโกแลต");
    }
}

class ChocolateChipCookies extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ คุกกี้ช็อกโกแลตชิป");
    }
}

// อาหารว่าง (Snacks)
class TunaSandwich extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ แซนวิชทูน่า");
    }
}

class Spaghetti extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ สปาเก็ตตี้");
    }
}

class VegetableSalad extends MenuItem {
    @Override
    public void serve() {
        System.out.println("เสิร์ฟ สลัดผัก");
    }
}

class CafeOrder {
    private List<MenuItem> order = new ArrayList<>();

    public MenuItem createItem(String itemName) {
        switch (itemName) {
            case "Espresso":
                return new Espresso();
            case "Latte":
                return new Latte();
            case "Milkshakes":
                return new Milkshakes();
            case "Fruit Juices":
                return new FruitJuices();
            case "Croissant":
                return new Croissant();
            case "Chocolate Cake":
                return new ChocolateCake();
            case "Chocolate Chip Cookies":
                return new ChocolateChipCookies();
            case "Tuna Sandwich":
                return new TunaSandwich();
            case "Spaghetti":
                return new Spaghetti();
            case "Vegetable Salad":
                return new VegetableSalad();
        }
        return null; // ถ้ารายการไม่ถูกต้อง
    }

    public void addItem(String itemName) {
        MenuItem item = createItem(itemName);
        if (item != null) {
            order.add(item);
        }
    }

    public void serveOrder() {
        for (MenuItem item : order) {
            item.serve();
        }
    }

    public static void main(String[] args) {
        CafeOrder order = new CafeOrder();
        order.addItem("Espresso");
        order.addItem("Chocolate Cake");
        order.addItem("Tuna Sandwich");

        order.serveOrder();
    }
}