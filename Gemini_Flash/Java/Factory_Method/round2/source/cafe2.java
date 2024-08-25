import java.util.ArrayList;
import java.util.List;

abstract class MenuItem {
    public abstract void prepare();
}

// เครื่องดื่ม (Beverages)
class Coffee extends MenuItem {
    private String type;

    public Coffee(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " กาแฟ");
    }
}

class Tea extends MenuItem {
    private String type;

    public Tea(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " ชา");
    }
}

class ColdBeverage extends MenuItem {
    private String type;

    public ColdBeverage(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " เครื่องดื่มเย็น");
    }
}

// ขนม (Pastries)
class Bread extends MenuItem {
    private String type;

    public Bread(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " ขนมปัง");
    }
}

class Cake extends MenuItem {
    private String type;

    public Cake(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " เค้ก");
    }
}

class Cookies extends MenuItem {
    private String type;

    public Cookies(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " คุกกี้");
    }
}

// อาหารว่าง (Snacks)
class Sandwiches extends MenuItem {
    private String type;

    public Sandwiches(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " แซนวิช");
    }
}

class Pasta extends MenuItem {
    private String type;

    public Pasta(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " พาสต้า");
    }
}

class Salads extends MenuItem {
    private String type;

    public Salads(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("กำลังเตรียม " + type + " สลัด");
    }
}

class CafeOrder {
    private List<MenuItem> order = new ArrayList<>();

    public MenuItem createItem(String itemType, String itemName) {
        switch (itemType) {
            case "Beverage":
                if (itemName.equals("Espresso")) {
                    return new Coffee("Espresso");
                } else if (itemName.equals("Cappuccino")) {
                    return new Coffee("Cappuccino");
                } else if (itemName.equals("Latte")) {
                    return new Coffee("Latte");
                } else if (itemName.equals("Mocha")) {
                    return new Coffee("Mocha");
                } else if (itemName.equals("Americano")) {
                    return new Coffee("Americano");
                } else if (itemName.equals("Black Tea")) {
                    return new Tea("Black Tea");
                } else if (itemName.equals("Green Tea")) {
                    return new Tea("Green Tea");
                } else if (itemName.equals("Oolong Tea")) {
                    return new Tea("Oolong Tea");
                } else if (itemName.equals("Lemon Tea")) {
                    return new Tea("Lemon Tea");
                } else if (itemName.equals("Fruit Smoothies")) {
                    return new ColdBeverage("Fruit Smoothies");
                } else if (itemName.equals("Milkshakes")) {
                    return new ColdBeverage("Milkshakes");
                } else if (itemName.equals("Fruit Juices")) {
                    return new ColdBeverage("Fruit Juices");
                }
                break;
            case "Pastry":
                if (itemName.equals("Croissant")) {
                    return new Bread("Croissant");
                } else if (itemName.equals("Bun")) {
                    return new Bread("Bun");
                } else if (itemName.equals("Custard Bread")) {
                    return new Bread("Custard Bread");
                } else if (itemName.equals("Chocolate Cake")) {
                    return new Cake("Chocolate Cake");
                } else if (itemName.equals("Strawberry Cake")) {
                    return new Cake("Strawberry Cake");
                } else if (itemName.equals("Coconut Cake")) {
                    return new Cake("Coconut Cake");
                } else if (itemName.equals("Chocolate Chip Cookies")) {
                    return new Cookies("Chocolate Chip Cookies");
                } else if (itemName.equals("Oat Cookies")) {
                    return new Cookies("Oat Cookies");
                }
                break;
            case "Snack":
                if (itemName.equals("Chicken Sandwich")) {
                    return new Sandwiches("Chicken Sandwich");
                } else if (itemName.equals("Tuna Sandwich")) {
                    return new Sandwiches("Tuna Sandwich");
                } else if (itemName.equals("Spaghetti")) {
                    return new Pasta("Spaghetti");
                } else if (itemName.equals("Penne")) {
                    return new Pasta("Penne");
                } else if (itemName.equals("Vegetable Salad")) {
                    return new Salads("Vegetable Salad");
                } else if (itemName.equals("Chicken Salad")) {
                    return new Salads("Chicken Salad");
                }
                break;
        }
        return null; // ถ้ารายการไม่ถูกต้อง
    }

    public void addItem(String itemType, String itemName) {
        MenuItem item = createItem(itemType, itemName);
        if (item != null) {
            order.add(item);
        }
    }

    public void prepareOrder() {
        for (MenuItem item : order) {
            item.prepare();
        }
    }

    public static void main(String[] args) {
        CafeOrder order = new CafeOrder();
        order.addItem("Beverage", "Espresso");
        order.addItem("Pastry", "Chocolate Cake");
        order.addItem("Snack", "Chicken Sandwich");

        order.prepareOrder();
    }
}