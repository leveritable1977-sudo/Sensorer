package niva1; // <--- Ligger i samma mapp, så den har samma paketnamn

public class Main {
    public static void main(String[] args) {
        System.out.println("--- STARTAR SMART BELYSNING (NIVÅ 1) ---");

        // Java vet automatiskt att den ska använda SmartLight från mappen niva1
        SmartLight vardagsrumLampa = new SmartLight(101);
        SmartLight kokslampa = new SmartLight(102);
        vardagsrumLampa.isOn = true;
        vardagsrumLampa.brightness = 80;
        kokslampa.isOn = true;
        kokslampa.brightness = 40;

        System.out.println("[LAMPSTATUS 1] Id: " + vardagsrumLampa.deviceId + " | Tänd: " + vardagsrumLampa.isOn + " | Styrka: " + vardagsrumLampa.brightness + "%");
        System.out.println("[LAMPSTATUS 2] Id: " + kokslampa.deviceId + " | Tänd: " + kokslampa.isOn + " | Styrka: " + kokslampa.brightness + "%");
    }
}
