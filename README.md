Llanquihue Tour


LlanquihueTourApp es una aplicación desarrollada en Java para gestionar 
los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.
Durante esta etapa del proyecto se incorporaron los conceptos de herencia, 
polimorfismo y colecciones, permitiendo almacenar y administrar diferentes tipos 
de servicios turísticos mediante una estructura flexible y reutilizable.


Objetivo de la Semana

Implementar una colección polimórfica utilizando `List<ServicioTuristico>` 
para almacenar distintos tipos de servicios turísticos y recorrerlos aplicando polimorfismo 
mediante el método `mostrarInformacion()`.

Conceptos aplicados:

- Herencia simple
- Sobrescritura de métodos
- Polimorfismo
- Colecciones (`ArrayList`)
- Organización por paquetes
- Uso de la anotación `@Override`


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


Instrucciones para ejecutar el sistema

Expandir la carpeta src.
Abrir el paquete ui.
Seleccionar la clase Main.java.
Hacer clic en el botón Run (▶) ubicado junto al método main.
o Hacer clic derecho sobre Main.java y seleccionar Run 'Main.main()'.

Resultado esperado
Al ejecutar la aplicación, se mostrará en la consola la información
de los distintos servicios turísticos registrados, 
utilizando polimorfismo para desplegar los datos específicos 
de cada tipo de servicio.