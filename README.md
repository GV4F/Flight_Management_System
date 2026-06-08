# Flight Management System ✈️

Prototipo de un motor de software modular en consola para la gestión de vuelos, pasajeros y políticas de despacho de equipaje de una aerolínea internacional. Este proyecto ha sido diseñado aplicando principios sólidos de la **Programación Orientada a Objetos (POO)**, colecciones dinámicas y una arquitectura limpia y desacoplada en Java puro.

## 🚀 Propósito del Proyecto
El objetivo principal de este sistema es validar y procesar de forma automática las reglas de negocio de una aerolínea, simulando escenarios reales de carga física, asignación de asientos y penalizaciones financieras por equipaje excedentario sin depender de interfaces gráficas ni dependencias externas.

## 🛠️ Conceptos Clave Implementados
* **POO Avanzada:** Uso estricto de encapsulamiento, herencia de clases (`PassengerRegular` y `PassengerVIP`) y polimorfismo dinámico.
* **Estructuras de Datos Eficientes:** Implementación de `Map<String, Flight>` para búsquedas indexadas y óptimas de vuelos y `List<Passenger>` para el manejo dinámico de las listas de abordaje.
* **Manejo de Excepciones Robustas:** Creación y control de un árbol de excepciones personalizadas (*Checked Exceptions*) para evitar estados inconsistentes en la lógica de negocio.
* **Formateo Avanzado:** Generación de reportes limpios mediante consola utilizando `System.out.printf`.

## 📐 Arquitectura de Paquetes
Para demostrar madurez en el diseño de software, el proyecto se encuentra estructurado de forma modular bajo las convenciones de la industria:

```text
src/
└── com/
    └── airline/
        ├── controller/          # Controladores de validación de datos
        │   ├── FullFlightValidation.java
        │   ├── PassengerValidation.java
        │   ├── PassengerVIPValidation.java
        │   ├── UnregisteredFlightValidation.java
        │   └── UnregisteredPassengerValidation.java
        |
        ├── exceptions/          # Excepciones personalizadas del dominio
        │   ├── DuplicateFlightException.java
        │   ├── DuplicatePassengerException.java
        │   ├── ExcessLuggageWeightException.java
        │   ├── FullFlightException.java
        │
        ├── model/              # Modelos de datos y reglas de negocio del objeto
        │   ├── Airline.java
        │   ├── Passenger.java
        │   ├── PassengerVIP.java
        │   └── Flight.java
        │
        └── main/               # Punto de entrada y simulación automatizada (Seed Data)
            └── FlightManagementSystem.java
```