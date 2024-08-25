import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Car_unittest {
    private Car_code.CarFacade car; // เปลี่ยนชื่อคลาส Car เป็น Car__code

    @BeforeEach
    void setUp() {
        car = new Car_code.CarFacade(); // เปลี่ยนชื่อคลาส Car เป็น Car__code
    }

    // ... (JUnit Test methods เหมือนเดิม)
    @Test
    void testStartCar() {
        car.startCar();
        assertTrue(car.getEngine().isStarted());
        assertTrue(car.getLights().isOn());
    }

    @Test
    void testStopCar() {
        car.getEngine().start(); // Start the car first
        car.getLights().turnOn();
        car.stopCar();
        assertFalse(car.getEngine().isStarted());
        assertFalse(car.getLights().isOn());
    }

    @Test
    void testTurnLeft() {
        car.turnLeft();
        assertEquals("left", car.getSteeringWheel().getDirection());
    }

    @Test
    void testTurnRight() {
        car.turnRight();
        assertEquals("right", car.getSteeringWheel().getDirection());
    }

    @Test
    void testApplyBrakes() {
        car.applyBrakes();
        assertTrue(car.getBrakes().isApplied());
    }

    @Test
    void testReleaseBrakes() {
        car.getBrakes().apply(); // Apply brakes first
        car.releaseBrakes();
        assertFalse(car.getBrakes().isApplied());
    }

    // Branch Coverage Tests
    @Test
    void testStartCarAlreadyStarted() {
        car.getEngine().start(); // Start engine manually
        car.startCar();
        assertTrue(car.getEngine().isStarted()); 
    }

    @Test
    void testStopCarAlreadyStopped() {
        car.getEngine().stop(); // Stop engine manually
        car.stopCar();
        assertFalse(car.getEngine().isStarted());
    }
}