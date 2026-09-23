package niva2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- STARTAR SMART HEM SYSTEM (NIVÅ 2) ---");

        // 1. Skapar objekten
        SmartLight lampa = new SmartLight(14);
        DoorSensor dörr = new DoorSensor(1, 5);
        System.out.println("\n[STARTLÄGE] Dörr öppen: " + dörr.isOpen + " | Lampa tänd: " + lampa.isOn);

        // 2. Dörraktivering (Toggle)
        System.out.println("\n>> HÄNDELSE: Någon öppnar dörren i zon " + dörr.zone);
        dörr.isOpen = true;
        if (dörr.isOpen) {
            lampa.toggle();
        }

        System.out.println("\n------------------------------------------------");
        System.out.println(">> HÄNDELSE: Startar dimmerloopen (0% till 100%)");

        // 3. UTMANING: Dimmerloop som ändrar brightness direkt och stegar med 20
        for (int i = 0; i <= 100; i += 20) {
            lampa.brightness = i;
            System.out.println("[INFO] Ljusstyrkan har ändrats till " + lampa.brightness + "%.");
        }

        System.out.println("\n------------------------------------------------");
        System.out.println(">> HÄNDELSE: Testar felhanteringen med ett ogiltigt värde (-50)");

        // 4. UTMANING: Validera värdet direkt och hantera fel via else
        int testVarde = -50;
        if (testVarde >= 0 && testVarde <= 100) {
            lampa.brightness = testVarde;
            System.out.println("[INFO] Ljusstyrkan ändrades till: " + lampa.brightness + "%.");
        } else {
            // Här är felhanteringen som efterfrågas!
            System.out.println("[FEL] Ljusstyrkan måste vara mellan 0 och 100. Värdet " + testVarde + " avvisades.");
        }

        System.out.println("\n--- TESTET AV NIVÅ 2 ÄR COMPLETED ---");
    }
}
