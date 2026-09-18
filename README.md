# Projekt: Sensorer

Det här projektet innehåller en procedurell och objektorienterad prototyp för ett smart hem-system, uppdelat i två olika svårighetsnivåer.

## Projektstruktur

```text
Sensorer/
├── .gitattributes
├── .gitignore
├── README.md
└── src/
    ├── niva1/
    │   ├── Main.java
    │   └── SmartLight.java
    └── niva2/
        ├── Main.java
        ├── SmartLight.java
        └── DoorSensor.java
```

## Beskrivning av nivåerna
* **niva1**: Innehåller den grundläggande OOP-strukturen där vi deklarerar attribut för en smart lampa och skapar flera unika lampobjekt i `Main.java`.
* **niva2**: Bygger ut systemet med en fungerande dörrsensor (`DoorSensor.java`) och en `toggle()`-metod inuti lampklassen för att simulera att belysningen styrs när en dörr öppnas eller stängs.
  
  
  

 