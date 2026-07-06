LlanquihueTourApp

Descripción

LlanquihueTourApp es una aplicación desarrollada en Java para 
gestionar los distintos servicios turísticos ofrecidos por la 
agencia Llanquihue Tour.

Durante esta etapa del proyecto se incorporaron los conceptos 
de herencia, polimorfismo y colecciones, permitiendo almacenar 
y administrar diferentes tipos de servicios turísticos mediante 
una estructura flexible y reutilizable.


Objetivo de la Semana

Implementar una colección polimórfica utilizando `List<ServicioTuristico>` 
para almacenar distintos tipos de servicios turísticos y recorrerlos 
aplicando polimorfismo mediante el método `mostrarInformacion()`.

Conceptos aplicados:

- Herencia simple
- Sobrescritura de métodos
- Polimorfismo
- Colecciones (`ArrayList`)
- Organización por paquetes
- Uso de la anotación `@Override

Estructura del Proyecto

LlanquihueTourApp
│
├── model
│   ├── ExcursionCultural.java
│   ├── PaseoLacustre.java
│   ├── RutaGastronomica.java
│   └── ServicioTuristico.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java

