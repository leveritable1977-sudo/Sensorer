package niva2; // <--- Den här dörren hör också till niva2

public class DoorSensor {
    int sensorId;
    boolean isOpen;
    int zone;

    public DoorSensor(int sensorId, int zone) {
        this.sensorId = sensorId;
        this.zone = zone;
        this.isOpen = false;
    }
}
