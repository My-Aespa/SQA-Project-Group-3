package Gemini_Pro.Factory_Method.Round3;

// Latte.java
public class Latte implements Coffee {
    @Override
    public String getDescription() {
        return "Latte Coffee";
    }

    @Override
    public double getCost() {
        return 4.00; // ราคา Latte
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
