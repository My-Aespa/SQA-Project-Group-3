package Gemini_Pro.Factory_Method.Round3;

public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "Americano Coffee";
    }

    @Override
    public double getCost() {
        return 3.50; // ราคา Americano
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
