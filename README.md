Llanquihue Tour

Descripción
Este proyecto corresponde a una aplicación en Java que permite leer datos desde un archivo de texto (.txt), crear objetos a partir de esos datos y almacenarlos en una colección ArrayList.

El sistema simula la gestión de tours turísticos en la agencia Llanquihue Tour, permitiendo visualizar y filtrar información según distintos criterios.

Estructura del proyecto

llanquihue-tour/
│
├── src/
│   ├── model/        Clase Tour (modelo de datos)
│   ├── data/         Clase GestorDatos (lectura de archivo)
│   ├── ui/           Clase Main (ejecución del programa)
│
├── resources/        Archivo de datos
│   └── tours.txt
│
└── README.md

Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA
2. Verificar que el archivo `tours.txt` esté en la carpeta `resources`
3. Ejecutar la clase:ui.Main
4. El programa mostrará:
   - Lista completa de tours
   - Tours filtrados por precio
   - Tours filtrados por tipo
  

---
