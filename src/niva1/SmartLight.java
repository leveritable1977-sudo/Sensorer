package niva1; // <--- Säger till Java att filen ligger i mappen 'niva1'

public class SmartLight {
    int deviceId;
    boolean isOn;
    int brightness;

    public SmartLight(int deviceId) {
        this.deviceId = deviceId;
        this.isOn = false;
        this.brightness = 0;
    }
}


