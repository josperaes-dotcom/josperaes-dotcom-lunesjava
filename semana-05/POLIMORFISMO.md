# 🌟 Polimorfismo Implementado - Semana 05

## 1. Aplicación de Sobrecarga de Métodos (Polimorfismo Estático)

La sobrecarga se implementó en la clase **`Habitacion.java`** en el método **`calcularPrecioTotal()`**. Esto permite que el sistema de facturación sea flexible y pueda manejar diferentes escenarios de precios con un solo nombre de método.

| Método Sobrecargado | Parámetros | Propósito |
| :--- | :--- | :--- |
| `calcularPrecioTotal` | `(int noches)` | Cálculo base con el 10% de descuento estándar. |
| `calcularPrecioTotal` | `(int noches, double desc)` | Aplica un descuento manual, útil para promociones especiales o compensaciones. |
| `calcularPrecioTotal` | `(int noches, double extra)` | Incluye el costo de un servicio adicional (como Spa o cena) más el IVA. |

## 2. Aplicación de Sobrescritura (Polimorfismo Dinámico)

Se sobrescribió el método **`generarReportePersonal()`** en la jerarquía `Empleado` para que cada tipo de empleado presente su información de manera única.

* **Clase Padre (`Empleado`):** Define el formato base del reporte.
* **Clase Hija (`Recepcionista`):** Extiende el reporte base (`super.generarReportePersonal()`) para incluir el dato **"Check-Ins en el Mes"**.
* **Clase Hija (`Gerente`):** Extiende el reporte base para incluir el dato **"Subordinados a Cargo"**.

## 3. Demostración del Polimorfismo en el Sistema Gestor

El polimorfismo dinámico se demostró en la clase **`HotelDescansoReal.java`** a través del método `generarReportesDePersonal()`:

1.  **`ArrayList<Empleado>`:** Se utiliza una lista polimórfica que guarda objetos de diferentes tipos (`Gerente` y `Recepcionista`).
2.  **Encadenamiento Dinámico:** Al iterar sobre esta lista y llamar a `empleado.generarReportePersonal()`, la Java Virtual Machine (JVM) determina en tiempo de ejecución **cuál versión** del método debe llamar (la del Recepcionista o la del Gerente). Esto mantiene el método gestor simple, limpio y escalable.