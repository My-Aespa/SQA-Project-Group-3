package Gemini_Pro.Factory_Method.Round3;

// Mocha.java
public class Mocha implements Coffee {
    @Override
    public String getDescription() {
        return "Mocha Coffee";
    }

    @Override
    public double getCost() {
        return 4.25; // ราคา Mocha
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
