# ParkPlus - Sistema de Gestión de Parqueo 🅿️

## Descripción del Proyecto

**ParkPlus** es un sistema de escritorio desarrollado en Java que permite la gestión completa de un estacionamiento o parqueo. El sistema está diseñado para manejar la entrada y salida de diferentes tipos de vehículos, asignar lugares, calcular tarifas de parqueo y generar reportes históricos de las transacciones.

## Características Principales ✨

* **Registro de Vehículos:** Manejo de vehículos con tarifas **Planas (Flat)** y **Variables**.
* **Tipos de Vehículos:** Soporte para Carros, Motos y un tipo especial para Catedráticos.
* **Gestión de Lugares:** Asignación automática de espacios disponibles y visualización en tiempo real del estado de los lugares (`MenuPrincipal`).
* **Cálculo de Tarifas:** Funcionalidad para calcular el costo total al momento de la salida, soportando diferentes lógicas de cobro.
* **Proceso de Pago:** Opciones para registrar pagos en **Efectivo** y con **Tarjeta**.
* **Reportes:** Generación de tablas de reportes de entradas, salidas y cierres de día (`Reportes`).
* **Exportación/Importación de Datos:** Herramientas para la carga y exportación de información de lugares en formato CSV (`CargaArchivo`).
* **Persistencia de Datos:** Conexión y almacenamiento de la información en una base de datos SQL Server.

## Estructura del Proyecto (Clases Principales) 🧱

El proyecto sigue una arquitectura con separación de responsabilidades:

| Clase | Responsabilidad |
| :--- | :--- |
| **`ParkPlus`** | Clase principal que inicia la aplicación y la conexión a la base de datos. |
| **`ConexionSQL`** | Manejo de la conexión JDBC con el servidor de base de datos SQL Server. |
| **`Vehiculo`** | Clase de modelo que representa la información de un vehículo (placa, carnet, nombre). |
| **`Ticket`** | Clase de modelo que encapsula los detalles de una transacción de parqueo (tarifa, fecha, lugar asignado). |
| **`LugarDAO`** | Data Access Object (DAO) para interactuar con las tablas de lugares y el historial, realizando operaciones de registro y liberación. |
| **`MenuPrincipal`** | Interfaz principal y visualización del mapa de lugares. |
| **`NuevaSalida`** | Gestión del proceso de salida y pago de un vehículo. |
| **`Reportes`** | Interfaz para la generación y consulta de reportes históricos. |

## Requisitos y Configuración ⚙️

1.  **Entorno de Java:** Se requiere **Java 8 o superior** para ejecutar el proyecto.
2.  **Base de Datos:** Se requiere una instancia de **SQL Server** en funcionamiento.
3.  **Configuración de BD:**
    * Asegúrate de que la cadena de conexión en `ConexionSQL.java` esté configurada correctamente para tu entorno:
        ```java
        private static final String URL = "jdbc:sqlserver://PABLO\\SQLEXPRESS;databaseName=PARKPLUS;encrypt=false;integratedSecurity=true;";
        ```
    * Debes crear la base de datos `PARKPLUS` y las tablas correspondientes (`lugaresCarros`, `lugaresMotos`, `lugaresCatedraticos`, `historico`).

## Cómo Ejecutar el Proyecto ▶️

1.  Compila y ejecuta la clase principal **`ParkPlus.java`**.
2.  El sistema intentará conectarse a la base de datos y luego lanzará la ventana de `MenuPrincipal`.