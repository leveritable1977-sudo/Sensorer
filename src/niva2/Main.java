package niva2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- STARTAR SMART HEM SYSTEM (NIVÅ 2) ---");

        // 1. Skapar objekten
        SmartLight lampa = new SmartLight(14);
        DoorSensor dörr = new DoorSensor(1, 5);
        System.out.println("\n[STARTLÄGE] Dörr öppen: " + dörr.isOpen + " | Lampa tänd: " + lampa.isOn);

        // 2. Din dörraktivering (Toggle)
        System.out.println("\n>> HÄNDELSE: Någon öppnar dörren i zon " + dörr.zone);
        dörr.isOpen = true;
        if (dörr.isOpen) {
            lampa.toggle();
        }

        System.out.println("\n------------------------------------------------");
        System.out.println(">> HÄNDELSE: Startar dimmerloopen (0% till 100%)");

        // 3. UTMANING: Dimmerloop som stegar med 20 i taget (i += 20)
        for (int i = 0; i <= 100; i += 20) {
            lampa.setBrightness(i);
        }

        System.out.println("\n------------------------------------------------");
        System.out.println(">> HÄNDELSE: Testar felhanteringen med ett ogiltigt värde (-50)");

        // 4. UTMANING: Validera ogiltigt värde via else i settern
        lampa.setBrightness(-50);

        System.out.println("\n--- TESTET AV NIVÅ 2 ÄR COMPLETED ---");
    }
}
