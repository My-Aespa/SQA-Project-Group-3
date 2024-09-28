package Copilot.Facade.round1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CarFacadeTest1 {
    private CarFacade carFacade;
    private Engine engine;
    private Lights lights;
    private SteeringWheel steeringWheel;
    private Brakes brakes;

    @BeforeEach
    public void setUp() {
        engine = mock(Engine.class);
        lights = mock(Lights.class);
        steeringWheel = mock(SteeringWheel.class);
        brakes = mock(Brakes.class);
        carFacade = new CarFacade(engine, lights, steeringWheel, brakes);
    }

    @Test
    public void testStartEngine() {
        carFacade.startEngine();
        verify(engine).start();
    }

    @Test
    public void testStopEngine() {
        carFacade.stopEngine();
        verify(engine).stop();
    }

    @Test
    public void testTurnOnLights() {
        carFacade.turnOnLights();
        verify(lights).turnOn();
    }

    @Test
    public void testTurnOffLights() {
        carFacade.turnOffLights();
        verify(lights).turnOff();
    }

    @Test
    public void testTurnLeft() {
        carFacade.turnLeft();
        verify(steeringWheel).turnLeft();
    }

    @Test
    public void testTurnRight() {
        carFacade.turnRight();
        verify(steeringWheel).turnRight();
    }

    @Test
    public void testApplyBrakes() {
        carFacade.applyBrakes();
        verify(brakes).apply();
    }

    @Test
    public void testReleaseBrakes() {
        carFacade.releaseBrakes();
        verify(brakes).release();
    }
}