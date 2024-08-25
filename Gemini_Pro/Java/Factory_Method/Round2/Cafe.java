public class Cafe {

    public interface MenuItem {
        String prepare();
    }

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
            if ("Coffee".equals(category)) {
                switch (type) {
                    case "Espresso":
                    case "Cappuccino":
                    case "Latte":
                    case "Mocha":
                    case "Americano":
                        return new Coffee(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Tea".equals(category)) {
                switch (type) {
                    case "Black Tea":
                    case "Green Tea":
                    case "Oolong Tea":
                    case "Lemon Tea":
                        return new Tea(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("ColdBeverage".equals(category)) {
                switch (type) {
                    case "Fruit Smoothies":
                    case "Milkshakes":
                    case "Fruit Juices":
                        return new ColdBeverage(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Bread".equals(category)) {
                switch (type) {
                    case "Croissant":
                    case "Bun":
                    case "Custard Bread":
                        return new Bread(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Cake".equals(category)) {
                switch (type) {
                    case "Chocolate Cake":
                    case "Strawberry Cake":
                    case "Coconut Cake":
                        return new Cake(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Cookie".equals(category)) {
                switch (type) {
                    case "Chocolate Chip Cookies":
                    case "Oat Cookies":
                        return new Cookie(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Sandwich".equals(category)) {
                switch (type) {
                    case "Chicken Sandwich":
                    case "Tuna Sandwich":
                        return new Sandwich(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Pasta".equals(category)) {
                switch (type) {
                    case "Spaghetti":
                    case "Penne":
                        return new Pasta(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else if ("Salad".equals(category)) {
                switch (type) {
                    case "Vegetable Salad":
                    case "Chicken Salad":
                        return new Salad(type);
                    default:
                        return null; // หรือ throw exception
                }
            } else {
                return null; // หรือ throw exception
            }
        }
    }
}