package Gemini_Pro.Factory_Method.Round2;

// Espresso.java
public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public double getCost() {
        return 3.00; // ราคา Espresso
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
