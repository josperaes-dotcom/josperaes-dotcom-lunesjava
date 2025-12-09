# Semana 03: Encapsulación Avanzada - Hotel Descanso Real

## 🛡️ Foco: Seguridad de Datos y Validación

Se reforzaron las clases con encapsulación estricta, validaciones de reglas de negocio y flexibilidad en la inicialización de objetos.

## ⚙️ Archivos Entregados

* `Habitacion.java` (Refactorizado con sobrecarga y validación)
* `Huesped.java` (Refactorizado con sobrecarga y validación)
* `MEJORAS.md`

## 🔑 Conceptos Implementados

1.  **Encapsulación Fuerte:** Todos los atributos de `Habitacion` y `Huesped` son estrictamente `private`.
2.  **Sobrecarga de Constructores:** Se implementaron múltiples constructores en `Habitacion` (completo y parcial/por defecto) y `Huesped`, permitiendo diferentes formas de inicialización.
3.  **Validaciones en Setters:** Los métodos `setter` incluyen lógica para asegurar la integridad de los datos (ej. precio > 0, capacidad limitada, nombre no vacío).
4.  **Excepciones de Argumento:** Uso de `throw new IllegalArgumentException` para manejar errores cuando se violan las reglas de negocio.
5.  **Validación Lógica:** Se implementó una regla clave: no se puede ocupar una `Habitacion` si su estado indica que está "Sucia".

## 🚀 Ejecución

El `Main.java` demuestra cómo la sobrecarga facilita la creación de objetos y cómo el sistema captura las excepciones cuando se intenta asignar un valor inválido.