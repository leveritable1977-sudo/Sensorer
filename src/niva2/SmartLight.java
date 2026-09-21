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

    // Toggle-metoden (Vänder på strömbrytaren)
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

    // 3 Getters (Utan "this." för renare kod)
    public int getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return isOn; // Använder "is" istället för "get" för boolean
    }

    public int getBrightness() {
        return brightness;
    }

    // 1 Setter (Med "this." på grund av namnkrock och felhantering)
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println("[INFO] Ljusstyrkan har ändrats till " + this.brightness + "%.");
        } else {
            // Här är felhanteringen via else som uppgiften ber om!
            System.out.println("[FEL] Ljusstyrkan måste vara mellan 0 och 100.");
        }
    }
}
