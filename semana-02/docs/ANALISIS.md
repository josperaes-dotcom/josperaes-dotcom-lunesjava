# Comparativo: Programación Estructurada vs. Orientada a Objetos (POO)

El siguiente es un resumen de las diferencias clave entre los dos paradigmas de programación más comunes.

## 1. El Enfoque Principal

### Programación Estructurada
El enfoque es en el **proceso** o la **secuencia de pasos** (qué hacer).

**Organización:** El código se divide en **funciones** o **procedimientos** sueltos.

 **Datos:** Las variables son generalmente **independientes** o globales.

 **Mantenimiento:** A medida que el proyecto crece, se vuelve más **difícil de seguir**, ya que la lógica y los datos están separados.

 **Analogía:** Es como seguir una **lista de tareas** o una receta detallada de principio a fin.

### Programación Orientada a Objetos (POO)
El enfoque es en los **objetos** o las entidades del mundo real (con quién trabajar).

 **Organización:** El código se organiza en **Clases**, que son moldes para crear objetos. Una clase agrupa **datos** y **acciones** relacionadas.

 **Datos:** Los datos están **encapsulados** (protegidos) dentro de su objeto.

 **Mantenimiento:** Es más **ordenado y escalable**, porque cada objeto es una unidad completa e independiente. Se facilita la **reutilización** de código.

 **Analogía:** Es como un sistema donde **objetos independientes** se comunican y actúan.

## 2. Ejemplo Simple: El Caso de la Reserva

### Programación Estructurada (Variables Sueltas)
Enfoque: Usamos **variables sueltas** para cada dato (ej. nombreCliente, fechaEntrada, habitacion). La acción de mostrar esos datos es una **función separada** que recibe todos esos parámetros.

### POO (Objeto Cohesivo)
Enfoque: Creamos un **Objeto Reserva** que contiene en su interior tanto los **datos** de la reserva como la **acción** (mostrarDetalles()) para manejarlos. Para una segunda reserva, solo creas un **nuevo objeto Reserva**. Esto permite crear colecciones de reservas que son independientes y ordenadas. El objeto es una **unidad** cohesiva.
