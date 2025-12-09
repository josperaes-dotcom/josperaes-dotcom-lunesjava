# Semana 05: Polimorfismo - Hotel Descanso Real

## 🔄 Foco: Flexibilidad y Comportamiento Adaptativo

Se aplicó el polimorfismo mediante sobrecarga y sobrescritura para hacer que el código fuera más versátil, especialmente en la gestión de precios y reportes.

## ⚙️ Archivos Entregados

* `Habitacion.java` (Modificado con Sobrecarga)
* `Empleado.java`, `Recepcionista.java`, `Gerente.java` (Modificados con Sobrescritura de reportes)
* `HotelDescansoReal.java` (Modificado con `ArrayList` Polimórfico)
* `POLIMORFISMO.md`

## 🔑 Conceptos Implementados

1.  **Sobrecarga de Métodos (Polimorfismo Estático):** En `Habitacion.java`, se crearon múltiples versiones de `calcularPrecioTotal()` para manejar el descuento base, descuentos manuales y costos con servicios extra.
2.  **Sobrescritura de Reportes (Polimorfismo Dinámico):** Se sobrescribió el método `generarReportePersonal()` en las subclases de `Empleado` para incluir información específica de cada rol.
3.  **ArrayList Polimórfico:** La clase gestora `HotelDescansoReal` utiliza un `ArrayList<Empleado>` que puede almacenar cualquier objeto de la jerarquía (Gerente o Recepcionista).
4.  **Encadenamiento Dinámico:** La demostración prueba que al iterar sobre el `ArrayList<Empleado>`, el método `generarReportePersonal()` ejecutado es la versión específica de cada subclase.

## 🚀 Ejecución

Se demostró la flexibilidad en el cálculo de precios y cómo el sistema de reportes opera de forma abstracta sobre diferentes tipos de empleados.