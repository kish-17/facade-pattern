// Subsystems
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class Fan {
    public void start() {
        System.out.println("Fan is spinning");
    }

    public void stop() {
        System.out.println("Fan stopped");
    }
}

class AC {
    public void setTemperature(int temp) {
        System.out.println("AC temperature set to " + temp);
    }
}

class TV {
    public void turnOnTv() {
        System.out.println("TV is on");
    }
}

// Facade
class SmartHomeFacade {
    private Light light;
    private Fan fan;
    private AC ac;
    private TV tv;
    public SmartHomeFacade() {
        this.light = new Light();
        this.fan = new Fan();
        this.ac = new AC();
        this.tv = new TV();
    }

    public void startMorningRoutine() {
        light.turnOn();
        fan.start();
        ac.setTemperature(24);
        tv.turnOnTv();
        System.out.println("Morning routine started");
    }

    public void stopEverything() {
        light.turnOff();
        fan.stop();
        System.out.println("Everything is turned off");
    }

}

// Client
public class Main {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.startMorningRoutine();
        smartHome.stopEverything();
    }
}