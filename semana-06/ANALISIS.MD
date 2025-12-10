# Semana 06: Abstracción e Interfaces - Hotel Descanso Real

## Foco: Diseño Orientado a Contratos y Principios SOLID

Se refactorizó el sistema para maximizar la flexibilidad y el desacoplamiento mediante el uso estratégico de clases abstractas e interfaces.

## Archivos Entregados

* abstractas/ServicioHotelAbstract.java
* interfaces/IReportable.java
* interfaces/ICancelable.java
* implementaciones/* (Clases modificadas)
* ANALISIS.md
* Main.java

## Cambios Realizados

### Clases Abstractas Creadas
- `ServicioHotelAbstract`: Define el contrato para el cálculo de costos (`calcularCostoFinal()`) y atributos comunes (`nombre`, `precioBase`) para todos los elementos facturables del hotel.

### Interfaces Implementadas
- `IReportable`: Define la capacidad de generar un reporte detallado. Implementada por la jerarquía `Empleado` y las clases `Reserva` y `ServicioAdicional`.
- `ICancelable`: Define la capacidad de aplicar una penalización por cancelación. Implementada por la clase `Reserva`.

### Jerarquía Final

La nueva estructura se basa en la doble conexión: Herencia vertical para servicios y Contratos de interfaz horizontal.

- **Herencia:** `ServicioAdicional` extiende de `ServicioHotelAbstract`.
- **Contratos:** `Reserva` implementa dos interfaces (`IReportable` y `ICancelable`), demostrando múltiple implementación de capacidades.
- **Refactorización:** El método de reporte de la jerarquía `Empleado` fue renombrado a `generarReporteDetallado()` para cumplir el contrato `IReportable`.

## Ejecución

Se demostró el **Polimorfismo de Interfaces**, donde objetos de tipos diferentes (`Recepcionista` y `ServicioAdicional`) pueden ser tratados como un tipo `IReportable` universal en el método `imprimirReporte()`.