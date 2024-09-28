package Gemini_Flash.Facade.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CarTest2 {

    @Test
    void testStartEngine() {
        Car car = new Car();
        String output = captureOutput(() -> car.startEngine());
        assertEquals("เครื่องยนต์สตาร์ท", output);
    }

    @Test
    void testStopEngine() {
        Car car = new Car();
        String output = captureOutput(() -> car.stopEngine());
        assertEquals("เครื่องยนต์ดับ", output);
    }

    @Test
    void testTurnOnLights() {
        Car car = new Car();
        String output = captureOutput(() -> car.turnOnLights());
        assertEquals("ไฟหน้าเปิด", output);
    }

    @Test
    void testTurnOffLights() {
        Car car = new Car();
        String output = captureOutput(() -> car.turnOffLights());
        assertEquals("ไฟหน้าปิด", output);
    }

    @Test
    void testTurnLeft() {
        Car car = new Car();
        String output = captureOutput(() -> car.turnLeft());
        assertEquals("เลี้ยวซ้าย", output);
    }

    @Test
    void testTurnRight() {
        Car car = new Car();
        String output = captureOutput(() -> car.turnRight());
        assertEquals("เลี้ยวขวา", output);
    }

    @Test
    void testApplyBrakes() {
        Car car = new Car();
        String output = captureOutput(() -> car.applyBrakes());
        assertEquals("เบรก", output);
    }

    @Test
    void testReleaseBrakes() {
        Car car = new Car();
        String output = captureOutput(() -> car.releaseBrakes());
        assertEquals("ปลดเบรก", output);
    }

    // วิธีการช่วยในการรับข้อความจาก System.out
    private String captureOutput(Runnable task) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // เก็บ PrintStream เดิม
        System.setOut(new PrintStream(outputStream)); // ตั้งค่า PrintStream ใหม่

        task.run(); // เรียกใช้ฟังก์ชันที่จะตรวจสอบ

        System.setOut(originalOut); // คืนค่า PrintStream เดิม
        return outputStream.toString();
    }
}