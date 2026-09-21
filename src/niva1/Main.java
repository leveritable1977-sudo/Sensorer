package niva1; // <-- Håller ordning på mappen så att inga filer krockar!

public class Main {
    public static void main(String[] args) {
        System.out.println("--- STARTAR SMART BELYSNING (NIVÅ 1) ---");

        // 1. DEKLARERA VARIABLER (Helt lösa i main, ingen separat klass)
        int lightId = 101;
        boolean isLightOn = false;
        int brightness = 0;

        int doorZone = 5;
        boolean isOpen = true; // Sätts till true för att testa att dörren öppnas

        // 2. STYRLOGIK: Om dörren är öppen, tänd lampan och sätt styrka till 80
        if (isOpen) {
            isLightOn = true;
            brightness = 80;

            // Skriv ut larm och lampstatus på skärmen
            System.out.println("[LARM] Dörren i zon " + doorZone + " har öppnats!");
            System.out.println("[STATUS] Lampan med ID " + lightId + " är nu tänd.");
        }

        // 3. VALIDERA LJUSSTYRKA (Kontrollera att värdet är mellan 0 och 100)
        if (brightness >= 0 && brightness <= 100) {
            System.out.println("[INFO] Ljusstyrkan är giltig: " + brightness + "%");
        } else {
            System.out.println("[FEL] Ogiltig ljusstyrka upptäckt!");
        }

        System.out.println("--- PROTOTYP NIVÅ 1 KLAR ---");
    }
}
