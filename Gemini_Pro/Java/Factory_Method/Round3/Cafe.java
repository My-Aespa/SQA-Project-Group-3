public class Cafe {

    public interface MenuItem {
        String prepare();
    }

    // เครื่องดื่ม
    public static class Coffee implements MenuItem {
        private String type;

        public Coffee(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " coffee";
        }
    }

    public static class Tea implements MenuItem {
        private String type;

        public Tea(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " tea";
        }
    }

    public static class ColdBeverage implements MenuItem {
        private String type;

        public ColdBeverage(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type;
        }
    }

    // ขนม
    public static class Bread implements MenuItem {
        private String type;

        public Bread(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " bread";
        }
    }

    public static class Cake implements MenuItem {
        private String type;

        public Cake(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " cake";
        }
    }

    public static class Cookie implements MenuItem {
        private String type;

        public Cookie(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " cookies";
        }
    }

    // อาหารว่าง
    public static class Sandwich implements MenuItem {
        private String type;

        public Sandwich(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " sandwich";
        }
    }

    public static class Pasta implements MenuItem {
        private String type;

        public Pasta(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " pasta";
        }
    }

    public static class Salad implements MenuItem {
        private String type;

        public Salad(String type) {
            this.type = type;
        }

        @Override
        public String prepare() {
            return "Preparing " + type + " salad";
        }
    }

    public static class CafeFactory {
        public MenuItem createMenuItem(String category, String type) {
            if (category == null || type == null) {
                return null; // หรือ throw new IllegalArgumentException("Category and type cannot be null");
            }

            switch (category) {
                case "Coffee":
                    return createCoffee(type);
                case "Tea":
                    return createTea(type);
                case "ColdBeverage":
                    return createColdBeverage(type);
                case "Bread":
                    return createBread(type);
                case "Cake":
                    return createCake(type);
                case "Cookie":
                    return createCookie(type);
                case "Sandwich":
                    return createSandwich(type);
                case "Pasta":
                    return createPasta(type);
                case "Salad":
                    return createSalad(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid category: " + category);
            }
        }

        private MenuItem createCoffee(String type) {
            switch (type) {
                case "Espresso":
                case "Cappuccino":
                case "Latte":
                case "Mocha":
                case "Americano":
                    return new Coffee(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid coffee type: " + type);
            }
        }

        private MenuItem createTea(String type) {
            switch (type) {
                case "Black Tea":
                case "Green Tea":
                case "Oolong Tea":
                case "Lemon Tea":
                    return new Tea(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid tea type: " + type);
            }
        }

        private MenuItem createColdBeverage(String type) {
            switch (type) {
                case "Fruit Smoothies":
                case "Milkshakes":
                case "Fruit Juices":
                    return new ColdBeverage(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid cold beverage type: " + type);
            }
        }

        private MenuItem createBread(String type) {
            switch (type) {
                case "Croissant":
                case "Bun":
                case "Custard Bread":
                    return new Bread(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid bread type: " + type);
            }
        }

        private MenuItem createCake(String type) {
            switch (type) {
                case "Chocolate Cake":
                case "Strawberry Cake":
                case "Coconut Cake":
                    return new Cake(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid cake type: " + type);
            }
        }

        private MenuItem createCookie(String type) {
            switch (type) {
                case "Chocolate Chip Cookies":
                case "Oat Cookies":
                    return new Cookie(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid cookie type: " + type);
            }
        }

        private MenuItem createSandwich(String type) {
            switch (type) {
                case "Chicken Sandwich":
                case "Tuna Sandwich":
                    return new Sandwich(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid sandwich type: " + type);
            }
        }

        private MenuItem createPasta(String type) {
            switch (type) {
                case "Spaghetti":
                case "Penne":
                    return new Pasta(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid pasta type: " + type);
            }
        }

        private MenuItem createSalad(String type) {
            switch (type) {
                case "Vegetable Salad":
                case "Chicken Salad":
                    return new Salad(type);
                default:
                    return null; // หรือ throw new IllegalArgumentException("Invalid salad type: " + type);
            }
        }
    }
}