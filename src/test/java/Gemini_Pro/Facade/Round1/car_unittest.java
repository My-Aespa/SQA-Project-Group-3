package Gemini_Pro.Facade.Round1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class car_unittest {
    private Car_code.CarFacade car;

    @BeforeEach
    void setUp() {
        car = new Car_code.CarFacade(); // สร้าง instance ของ CarFacade
    }

    @Test
    void testStartCar() {
        car.startCar();
        assertTrue(car.getEngine().isStarted());
        assertTrue(car.getLights().isOn());
    }

    @Test
    void testStopCar() {
        car.startCar();
        car.stopCar();
        assertFalse(car.getEngine().isStarted());
        assertFalse(car.getLights().isOn());
    }

    @Test
    void testTurnLeft() {
        car.turnLeft();
        assertEquals("left", car.getSteering().getDirection());
    }

    @Test
    void testTurnRight() {
        car.turnRight();
        assertEquals("right", car.getSteering().getDirection());
    }

    @Test
    void testApplyBrakes() {
        car.applyBrakes();
        assertTrue(car.getBrakes().isApplied());
    }

    @Test
    void testReleaseBrakes() {
        car.applyBrakes();
        car.releaseBrakes();
        assertFalse(car.getBrakes().isApplied());
    }

    @Test
    void testStartCarAlreadyStarted() {
        car.getEngine().start();
        car.startCar();
        assertTrue(car.getEngine().isStarted());
    }

    @Test
    void testStopCarAlreadyStopped() {
        car.stopCar();
        assertFalse(car.getEngine().isStarted());
    }
}
