# Semana 02: Relaciones y Colecciones - Hotel Descanso Real

## 🔗 Foco: Conexión entre Entidades

Esta semana se introdujo la relación entre las clases a través de `Reserva` y la gestión de múltiples objetos mediante colecciones.

## ⚙️ Archivos Entregados

* `Habitacion.java` (Modificado)
* `Huesped.java` (Modificado)
* `Reserva.java` (Nuevo)
* `HotelDescansoReal.java` (Nuevo - Clase Gestora)
* `Main.java`

## 🔑 Conceptos Implementados

1.  **Agregación/Composición:** La clase `Reserva` modela la relación, conteniendo objetos de tipo `Habitacion` y `Huesped`.
2.  **Colecciones (`ArrayList`):** La clase gestora `HotelDescansoReal` utiliza un `ArrayList<Reserva>` para almacenar el conjunto de reservas activas.
3.  **Clase Gestora:** `HotelDescansoReal` actúa como el punto central para la lógica de negocio (ej. `agregarReserva()`).
4.  **Navegación de Objetos:** El sistema accede a la información de objetos relacionados a través de la Reserva (ej. obtener el precio de la Habitación desde la Reserva).

## 🚀 Ejecución

El programa demuestra cómo el sistema central (HotelDescansoReal) interactúa con colecciones de objetos `Reserva` para simular la operación de la recepción.