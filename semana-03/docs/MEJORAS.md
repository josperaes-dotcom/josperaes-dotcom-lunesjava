# 🚀 Mejoras Implementadas - Semana 03: Encapsulación y Sobrecarga

## 1. Justificación General

El código fue refactorizado para aplicar **Encapsulación completa** y **Sobrecarga de Constructores**, transformando el código funcional de las semanas anteriores en un **código robusto y seguro** para el Hotel Descanso Real.

## 2. Refactorización: Encapsulación (Seguridad de Datos)

| Clase | Cambio | Impacto |
| :--- | :--- | :--- |
| **Habitacion** | Todos los atributos (`precioBase`, `capacidad`, etc.) se hicieron `private`. | **Se evita la manipulación externa.** Ahora, solo se pueden modificar a través de los métodos `setter`, lo que asegura que las reglas de negocio se apliquen siempre. |
| **Huesped** | Todos los atributos (`nombreCompleto`, `diasEstancia`) se hicieron `private`. | Se impide que se cambie el estado `tieneCheckIn` directamente. El único camino es el método `registrarCheckIn()`. |

## 3. Implementación de Sobrecarga de Constructores (Flexibilidad)

| Clase | Constructores (Tipos) | Beneficio para el Hotel |
| :--- | :--- | :--- |
| **Habitacion** | **Completo** y **Parcial** (`solo número`). | Permite crear habitaciones estándar (`DOBLE`, precio fijo) de forma rápida en el sistema, reduciendo la entrada de datos. |
| **Huesped** | **Completo** y **Parcial** (`sin díasEstancia`). | Permite un registro ágil de "pasajeros de un día" (estancia por defecto de 1 día), simplificando la tarea de la recepcionista. |

## 4. Implementación de Validaciones (Robustez)

Se agregaron reglas de negocio clave a través de los `setters` para prevenir datos incorrectos:

* **Validación de Precio:** El método `setPrecioBase()` en `Habitacion` lanza un error si el precio es $\le 0$.
* **Validación de Capacidad:** El método `setCapacidad()` restringe el valor a un máximo de 4 personas.
* **Validación de Estado:** El método `cambiarEstado()` en `Habitacion` **impide que se asigne una habitación si su estado de limpieza no es "Limpia"**.
* **Validación de Nombre:** El método `setNombreCompleto()` exige que el nombre tenga al menos 3 caracteres.

---

**¡Con esto, has completado todos los requisitos de la Semana 03!** El código está encriptado, ordenado y preparado para manejar errores.

