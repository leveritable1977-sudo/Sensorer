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
* **src/niva2/**: Bygger ut systemet till att bli helt objektorienterat. Här samarbetar tre olika klasser (`Main.java`, `SmartLight.java`, `DoorSensor.java`) med hjälp av inkapsling, konstruktorer, getters/setters och en toggle-metod.

## Tekniker som används
* **Procedurell kod**: Variabler och if-satser som körs i en rak lista i main (Nivå 1).
* **Inkapsling (Encapsulation)**: Variabler skyddade med `private` som nås säkert utifrån via getters och setters (Nivå 2).
* **Konstruktorer & Metoder**: Sparar data smidigt i minnet med hjälp av `this` och styr enheter med smarta metoder som `toggle()`.
  