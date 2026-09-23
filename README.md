# Projekt: Sensorer

Det här projektet innehåller en prototyp för ett smart hem, uppdelat i två olika nivåer för att visa skillnaden mellan procedurell och objektorienterad programmering.

## Projektstruktur

```text
Sensorer/
├── .gitattributes
├── .gitignore
├── README.md
└── src/
    ├── niva1/
    │   └── Main.java
    └── niva2/
        ├── Main.java
        ├── SmartLight.java
        └── DoorSensor.java
```

## Beskrivning av nivåerna
* **src/niva1/**: Innehåller en helt procedurell prototyp (`Main.java`). Alla variabler och all styrlogik för lampan och dörren ligger direkt i main-metoden utan några extra klasser eller objekt.
* **src/niva2/**: Bygger ut systemet till att bli objektorienterat. Här delas systemet upp i egna klasser (`SmartLight.java` och `DoorSensor.java`) som skapar fristående objekt i minnet med tillhörande instansmetoder.

## Tekniker som används
* **Procedurell kod**: Variabler och if-satser som körs i en rak lista direkt i main (Nivå 1).
* **Klasser och Objekt (OOP)**: Variabler och egenskaper är samlade inuti logiska modeller som representerar hårdvaran (Nivå 2).
* **Konstruktorer & Instansmetoder**: Initierar objekt med startvärden via `this` och styr enheternas beteende inifrån klassen med smarta metoder som `toggle()`.
* **Dimmerloop & Validering**: Använder for-loopar för att stega värden och if-else-satser för att kontrollera och avvisa ogiltig indata (Nivå 2).
    