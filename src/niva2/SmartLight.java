package niva2;

public class SmartLight {
    int deviceId;
    boolean isOn;
    int brightness;

    public SmartLight(int deviceId) {
        this.deviceId = deviceId;
        this.isOn = false;
        this.brightness = 0;
    }

    // Toggle-metoden (Ändrar strömbrytaren)
    public void toggle() {
        this.isOn = !this.isOn;
        if (this.isOn) {
            this.brightness = 80;
            System.out.println("[LAMP-METOD] Lampan med Id " + deviceId + " har TÄNDTS (80%).");
        } else {
            this.brightness = 0;
            System.out.println("[LAMP-METOD] Lampan med Id " + deviceId + " har SLÄCKTS.");
        }
    }
}

