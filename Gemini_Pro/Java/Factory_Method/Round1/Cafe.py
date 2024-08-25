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
                return new Coffee(type);
            } else if ("Tea".equals(category)) {
                return new Tea(type);
            } else if ("ColdBeverage".equals(category)) {
                return new ColdBeverage(type);
            } else if ("Bread".equals(category)) {
                return new Bread(type);
            } else if ("Cake".equals(category)) {
                return new Cake(type);
            } else if ("Cookie".equals(category)) {
                return new Cookie(type);
            } else if ("Sandwich".equals(category)) {
                return new Sandwich(type);
            } else if ("Pasta".equals(category)) {
                return new Pasta(type);
            } else if ("Salad".equals(category)) {
                return new Salad(type);
            } else {
                return null;
            }
        }
    }
}