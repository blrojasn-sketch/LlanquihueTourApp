LlanquihueTourApp

Descripción de la actividad (Semana 6)

En esta semana se implementó una jerarquía de clases usando herencia simple en Java.  
El objetivo fue modelar distintos tipos de servicios turísticos ofrecidos por la agencia Llanquihue Tour, reutilizando atributos comunes y extendiendo funciones específicas en cada clase.

Se aplico:
- Herencia
- Uso de super()
- Sobrescritura de métodos (toString)
- Organización modular por paquetes

Clases creadas

Clase base
- ServicioTuristico
  - Atributos:
    - nombre
    - duracionHoras

Subclases

- RutaGastronomica
  - Atributo adicional:
    - numeroDeParadas

- PaseoLacustre
  - Atributo adicional:
    - tipoEmbarcacion

- **ExcursionCultural**
  - Atributo adicional:
    - lugarHistorico


Organización del proyecto

LlanquihueTourApp
│
├── model
├── data
└── ui

model: contiene la jerarquía de clases
data: contiene la clase GestorServicios
ui: contiene la clase Main

Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ
2. Ir al paquete "ui"
3. Ejecutar la clase "Main.java"
4. El programa mostrará en consola los servicios turísticos creados

Resultado esperado

Se visualizará en consola la información de cada servicio, incluyendo sus atributos específicos.
