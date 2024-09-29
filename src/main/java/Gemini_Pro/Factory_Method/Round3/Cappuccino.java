package Gemini_Pro.Factory_Method.Round3;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino Coffee";
    }

    @Override
    public double getCost() {
        return 4.50; // ราคา Cappuccino
    }

    @Override
    public void prepare() {
        // โค้ดสำหรับเตรียมกาแฟ
    }

    @Override
    public void serve() {
        // โค้ดสำหรับเสิร์ฟกาแฟ
    }
}