package OOPS.Downcasting;
class Device {
    void turnOn() {
        System.out.println("Device Turned On");
    }
}
class smartPhone extends Device {
    void turnOn() {
        System.out.println("SmartPhone Turned On");
    }
    void openCamera() {
        System.out.println("Camera Opened");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Device d = new smartPhone();
        d.turnOn();
        smartPhone s = (smartPhone) d;
        s.openCamera();
    }
}
