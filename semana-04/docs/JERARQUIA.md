# 📂 Jerarquía de Clases Implementada - Semana 04

## 1. Jerarquía Identificada (Relación "es-un")

Para la Semana 04, se identificó la jerarquía en la gestión del **Personal** del Hotel Descanso Real.

* **Clase Padre (Superclase):** `Empleado`
* **Clases Hijas (Subclases):** `Recepcionista`, `Gerente`



## 2. Implementación de Herencia

| Clase | Atributos Heredados | Lógica Específica |
| :--- | :--- | :--- |
| **Empleado** (Padre) | `identificacion`, `nombreCompleto`, `salarioBase`, `cargo`, `fechaContratacion` (Todos `protected`). | Define la acción base `realizarTrabajo()` y el cálculo `calcularSalarioAnual()`. |
| **Recepcionista** (Hijo) | Hereda todos los datos del `Empleado`. | Atributo único: `checkInsRealizados`. Sobrescribe `realizarTrabajo()` para indicar que gestiona reservas. |
| **Gerente** (Hijo) | Hereda todos los datos del `Empleado`. | Atributo único: `claveAcceso`. Sobrescribe `realizarTrabajo()` y llama al `super.realizarTrabajo()` para agregar su tarea administrativa. |

## 3. Uso de la Herencia

* **`extends`:** Utilizado en `public class Recepcionista extends Empleado` para establecer la relación de herencia.
* **`super()`:** Utilizado en el constructor de las clases hijas para inicializar los atributos definidos en el padre (ej: `super(id, nombre, salario, ...)`). Esto evita repetir código.
* **`@Override`:** Utilizado en el método `realizarTrabajo()` de las subclases para darle un comportamiento único y específico a cada tipo de empleado.

## 4. Demostración de Polimorfismo

El polimorfismo se demostró en `Main.java` al crear una colección (`ArrayList`) de tipo **`Empleado`** (el padre).

A pesar de que la lista es genérica, al llamar al método **`e.realizarTrabajo()`** en el bucle For-Each, Java sabe exactamente si debe ejecutar la versión del `Recepcionista` o la versión del `Gerente`. Esto permite crear sistemas flexibles donde el código se mantiene simple aunque los objetos internos sean diferentes.