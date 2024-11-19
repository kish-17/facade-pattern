//Key Terms
	// 1.	Client: The person or system making the request (you).
	// 2.	Facade: The client interacts only with the SmartHomeFacade class.
	// 3.	Subsystems: The complex systems that do the actual work

// Subsystems
// These subsystems are abstracted and are used in a fashion where the complexities of these subsystems are hidden
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
//The Facade manages the Light, Fan, TV, and AC subsystems
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
//Client is a system or a person making the request
//The client (Main class) only interacts with the facade and doesn’t care about how the subsystems work
public class Main {
    public static void main(String[] args) {
        //The SmartHomeFacade hides the complexity of interacting with the Light, Fan, and AC.
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.startMorningRoutine();
        smartHome.stopEverything();
    }
}
