import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testStartEngine() {
        Car car = new Car();
        car.startEngine();
        // ตรวจสอบข้อความที่ถูกพิมพ์ออกไป
        String expectedOutput = "เครื่องยนต์สตาร์ท\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testStopEngine() {
        Car car = new Car();
        car.stopEngine();
        String expectedOutput = "เครื่องยนต์ดับ\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testTurnOnLights() {
        Car car = new Car();
        car.turnOnLights();
        String expectedOutput = "ไฟหน้าเปิด\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testTurnOffLights() {
        Car car = new Car();
        car.turnOffLights();
        String expectedOutput = "ไฟหน้าปิด\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testTurnLeft() {
        Car car = new Car();
        car.turnLeft();
        String expectedOutput = "เลี้ยวซ้าย\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testTurnRight() {
        Car car = new Car();
        car.turnRight();
        String expectedOutput = "เลี้ยวขวา\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testApplyBrakes() {
        Car car = new Car();
        car.applyBrakes();
        String expectedOutput = "เบรก\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    @Test
    void testReleaseBrakes() {
        Car car = new Car();
        car.releaseBrakes();
        String expectedOutput = "ปลดเบรก\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    // วิธีการช่วยในการรับข้อความจาก System.out
    private String getOutputFromSystemOut() {
        // นี่คือตัวอย่างการรับข้อความจาก System.out 
        // คุณอาจต้องปรับเปลี่ยนวิธีการนี้ตามความเหมาะสม
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        return outputStream.toString();
    }
}