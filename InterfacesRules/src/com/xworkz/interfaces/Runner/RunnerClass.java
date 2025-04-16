package com.xworkz.interfaces.Runner;

import com.xworkz.interfaces.connectors.*;
import com.xworkz.interfaces.implementors.HomeAlarm;
import com.xworkz.interfaces.implementors.KitchenMicrowave;
import com.xworkz.interfaces.implementors.SmartLight;
import com.xworkz.interfaces.twoImpClasses.*;
import javafx.scene.effect.Light;

public class RunnerClass {
    public static void main(String[] args) {
        AlarmSystem alarmSystem = new Home();
        LightControl lightControl = new Home();
        GameController gameController = new MobilePhone();
        LightControl lightControl1 = new MobilePhone();
        AlarmSystem alarmSystem1 = new SmartSecurity();
        GateControl gateControl = new SmartSecurity();
        BarcodeScanner barcodeScanner = new ExitChecker();
        GateControl gateControl1 = new ExitChecker();
        PlantWateringSystem plantWateringSystem = new GardenBot();
        LightControl lightControl2 = new GardenBot();
        SmartMirror smartMirror = new Singer();
        MusicPlayer musicPlayer = new Singer();
        Drone drone = new VideoGrapher();
        Camera camera = new VideoGrapher();
        Microwave microwave = new MicrowaveStreetUnit();
        StreetLight streetLight = new MicrowaveStreetUnit();
        Elevator elevator = new ElevatorSensor();
        LightControl lightControl3 = new ElevatorSensor();
        AquariumSystem aquariumSystem = new FishTankManager();
        BatteryCharger batteryCharger = new FishTankManager();
        FireAlarm fireAlarm = new Company();
        AirConditioner airConditioner = new Company();
        GameConsole gameConsole = new SportInstitute();
        GameController gameController1 = new SportInstitute();
        TrafficLight trafficLight = new TrafficPolice();
        StreetLight streetLight1 = new TrafficPolice();
        CoffeeMachine coffeeMachine = new KitchenTools();
        Microwave microwave1 = new KitchenTools();
        GateControl gateControl2 = new SecurityGuard();
        LightControl lightControl4  = new SecurityGuard();
        BatteryCharger batteryCharger1 = new ChargingHub();
        Microwave microwave2 = new ChargingHub();
        Drone drone1 = new PatrolDrone();
        AlarmClock alarmClock = new PatrolDrone();
        Drone drone2 = new DeliveryBot();
        BarcodeScanner barcodeScanner1 = new DeliveryBot();
        AquariumSystem aquariumSystem1 = new AquaGuard();
        AlarmSystem alarmSystem2 = new AquaGuard();
        MusicPlayer musicPlayer1  = new SmartPod();
        BatteryCharger batteryCharger2 = new SmartPod();
        Elevator elevator1 = new SmartElevator();
        AlarmSystem alarmSystem3 = new SmartElevator();
        CoffeeMachine coffeeMachine1 = new Cafe();
        Blender blender = new Cafe();
        StreetLight streetLight2 = new ParkControlUnit();
        TrafficLight trafficLight1 = new ParkControlUnit();
        Laptop laptop = new OfficeSecuritySystem();
        InkjetPrinter inkjetPrinter = new OfficeSecuritySystem();
        Robot robot = new HumanoidRobot();
        RobotVacuum robotVacuum = new HumanoidRobot();



        alarmSystem.arm();
        alarmSystem.triggerAlarm();
        alarmSystem.disarm();
        lightControl.turnOn();
        lightControl.dim();
        lightControl.turnOff();
        System.out.println("================================");
        gameController.startGame();
        gameController.pauseGame();
        gameController.resumeGame();
        lightControl1.turnOn();
        lightControl1.dim();
        lightControl1.turnOff();
        System.out.println("==================================");
        alarmSystem1.disarm();
        alarmSystem1.arm();
        alarmSystem1.triggerAlarm();
        gateControl.closeGate();
        gateControl.lockGate();
        gateControl.openGate();
        System.out.println("==================================");
        barcodeScanner.resetScanner();
        barcodeScanner.calibrate();
        barcodeScanner.scanItem();
        gateControl1.closeGate();
        gateControl1.lockGate();
        gateControl1.openGate();
        System.out.println("==================================");
        plantWateringSystem.startWatering();
        plantWateringSystem.checkMoisture();
        plantWateringSystem.stopWatering();
        lightControl2.turnOn();
        lightControl2.dim();
        lightControl2.turnOff();
        System.out.println("==================================");
        smartMirror.showTime();
        smartMirror.showWeather();
        smartMirror.turnOffDisplay();
        musicPlayer.pause();
        musicPlayer.play();
        musicPlayer.stop();
        System.out.println("=================================");
        drone.fly();
        drone.land();
        drone.takeOff();
        camera.capture();
        camera.record();
        camera.zoom();
        System.out.println("===================================");
        microwave.start();
        microwave.stop();
        microwave.openDoor();
        streetLight.blink();
        streetLight.turnOn();
        streetLight.turnOff();
        System.out.println("===================================");
        elevator.goDown();
        elevator.stop();
        elevator.goUp();
        lightControl3.turnOff();
        lightControl3.dim();
        lightControl3.turnOn();
        System.out.println("==================================");
        aquariumSystem.checkTemperature();
        aquariumSystem.cleanTank();
        aquariumSystem.feedFish();
        batteryCharger.showBatteryLevel();
        batteryCharger.stopCharging();
        batteryCharger.startCharging();
        System.out.println("===================================");
        fireAlarm.resetAlarm();
        fireAlarm.detectSmoke();
        fireAlarm.triggerAlarm();
        airConditioner.powerOff();
        airConditioner.powerOn();
        airConditioner.swing();
        System.out.println("====================================");
        gameController1.resumeGame();
        gameController1.pauseGame();
        gameController1.startGame();
        gameConsole.pauseGame();
        gameConsole.quitGame();
        gameConsole.startGame();
        System.out.println("====================================");
        trafficLight.red();
        trafficLight.green();
        trafficLight.yellow();
        streetLight1.turnOff();
        streetLight1.blink();streetLight1.turnOn();
        System.out.println("=======================================");
        coffeeMachine.brew();
        coffeeMachine.stop();coffeeMachine.clean();
        microwave1.openDoor();
        microwave1.stop();
        microwave1.start();
        System.out.println("=======================================");
        gateControl2.openGate();
        gateControl2.lockGate();
        gateControl2.closeGate();
        lightControl4.turnOn();
        lightControl4.dim();
        lightControl4.turnOff();
        System.out.println("=====================================");
        batteryCharger1.startCharging();
        batteryCharger1.showBatteryLevel();
        batteryCharger1.stopCharging();
        microwave2.start();microwave2.stop();
        microwave2.openDoor();
        System.out.println("========================================");
        drone1.takeOff();
        drone1.land();
        drone1.takeOff();
        alarmClock.setAlarm();
        alarmClock.ring();
        alarmClock.snooze();
        System.out.println("=======================================");
        drone2.takeOff();
        drone2.land();
        drone2.fly();
        barcodeScanner1.scanItem();
        barcodeScanner1.resetScanner();
        barcodeScanner1.calibrate();
        System.out.println("======================================");
        aquariumSystem1.feedFish();
        aquariumSystem1.checkTemperature();
        aquariumSystem1.cleanTank();
        alarmSystem2.triggerAlarm();
        alarmSystem2.arm();
        alarmSystem2.disarm();
        System.out.println("=====================================");
        musicPlayer1.stop();
        musicPlayer1.play();
        musicPlayer1.pause();
        batteryCharger2.stopCharging();
        batteryCharger2.showBatteryLevel();
        batteryCharger2.startCharging();
        System.out.println("======================================");
        elevator1.goUp();
        elevator1.goDown();
        elevator1.stop();
        alarmSystem3.disarm();
        alarmSystem3.arm();
        alarmSystem3.triggerAlarm();
        System.out.println("======================================");
        coffeeMachine1.clean();
        coffeeMachine1.brew();
        coffeeMachine1.stop();
        blender.startBlending();
        blender.stopBlending();
        blender.clean();
        System.out.println("======================================");
        streetLight2.turnOn();
        streetLight2.blink();
        streetLight2.turnOff();
        trafficLight1.yellow();
        trafficLight1.green();
        trafficLight1.red();
        System.out.println("======================================");
        laptop.bootUp();
        laptop.shutDown();
        laptop.sleep();
        inkjetPrinter.checkInkLevel();
        inkjetPrinter.cleanNozzle();
        inkjetPrinter.printPage();
        System.out.println("========================================");
        robot.recharge();
        robot.talk();
        robot.walk();
        robotVacuum.emptyDustbin();
        robotVacuum.returnToDock();
        robotVacuum.startCleaning();
    }
}
