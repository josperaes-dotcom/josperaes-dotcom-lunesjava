# Semana 04: Herencia - Hotel Descanso Real

## 👪 Foco: Jerarquías de Clases y Reutilización de Código

Se identificó la jerarquía de **Personal** en el hotel para aplicar herencia, logrando reutilización de atributos y métodos comunes.

## ⚙️ Archivos Entregados

* `Empleado.java` (Clase Padre - Nueva)
* `Recepcionista.java` (Subclase - Nueva)
* `Gerente.java` (Subclase - Nueva)
* `JERARQUIA.md`

## 🔑 Conceptos Implementados

1.  **Clase Padre Abstracta:** Se creó `Empleado` como superclase, conteniendo atributos comunes (`nombreCompleto`, `salarioBase`, etc.) con modificador `protected`.
2.  **Herencia (`extends`):** Las clases `Recepcionista` y `Gerente` heredan de `Empleado`, obteniendo el comportamiento base.
3.  **Llamada al Padre (`super()`):** Utilizada en los constructores de las clases hijas para inicializar la parte heredada sin duplicar código.
4.  **Sobrescritura de Métodos (`@Override`):** Se sobrescribió el método `realizarTrabajo()` en las subclases para darle un comportamiento específico de su rol (ej. el Gerente revisa informes).

## 🚀 Ejecución

El `Main.java` demuestra cómo los objetos de las subclases pueden ejecutar métodos heredados y cómo los métodos sobrescritos proporcionan la lógica específica de cada rol.