package pl.sda.day7.automotive;

public class Car extends Vehicle implements HasEngine, HasAirControl {

    private boolean engineRunning;

    public Car() {
        super(4);
    }

    @Override
    public void ride() {
        startEngine();
        turnOnAC(21);
        System.out.println("I ride car");
    }

    @Override
    public void brake() {
        System.out.println("I brake car");
        stopEngine();
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            turnOffAC();
            System.out.println("I stop car");
        }
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("I start car");
        }
    }

    @Override
    public void turnOnAC(int temperature) {
        System.out.println("I set " + temperature + "C");
    }

    @Override
    public void turnOffAC() {
        System.out.println("I turn off AC");
    }
}
