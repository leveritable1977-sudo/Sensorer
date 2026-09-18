package niva2; // <--- Startar programmet för Nivå 2

public class Main {
    public static void main(String[] args) {
        System.out.println("--- STARTAR SMART HEM SYSTEM (NIVÅ 2) ---");

        // Java fattar att den ska ta SmartLight och DoorSensor från samma mapp (niva2)
        SmartLight lampa = new SmartLight(14);
        DoorSensor dörr = new DoorSensor(1, 5);
        System.out.println("\n[STARTLÄGE] Dörr öppen: " + dörr.isOpen + " | Lampa tänd: " + lampa.isOn);

        System.out.println("\n>> HÄNDELSE: Någon öppnar dörren i zon " + dörr.zone);
        dörr.isOpen = true;
        if (dörr.isOpen) {
            lampa.toggle(); // Kör igång toggle-metoden som bara finns i niva2!
        }
    }
}
