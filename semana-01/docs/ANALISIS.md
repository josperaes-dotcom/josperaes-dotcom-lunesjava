# Análisis Orientado a Objetos - Hotel Descanso Real

## 1. Identificación del Dominio

**Nombre del negocio:** Descanso Real
**Tipo:** Hotel de 4 estrellas
**Descripción:** Hotel ubicado en Bogotá que ofrece servicios de **hospedaje**, restaurante, salones de eventos y spa. Nuestro objetivo es modelar las dos entidades más importantes para el negocio de alojamiento: las habitaciones y los clientes.

## 2. Objetos Centrales Identificados

### Objeto Principal: Habitación

**¿Qué es?:** La unidad fundamental de hospedaje. Representa un espacio físico que se vende a un precio por noche.

**Atributos identificados:**
- `numero`: String - Identificador único (ej: "201").
- `tipo`: String - Clasificación de la habitación (ej: "Suite").
- `precioBase`: double - El costo de una noche sin impuestos ni descuentos.
- `capacidad`: int - El máximo de personas que pueden dormir en ella.
- `estaOcupada`: boolean - Si está `true`, hay alguien dentro; si está `false`, está libre.

**Métodos identificados:**
- `mostrarInformacion()`: Muestra todos los datos de la habitación en la pantalla.
- `calcularPrecioConDescuento(noches)`: Calcula cuánto costará la estadía total, aplicando un descuento del 10% automáticamente.
- `getNumero()`: Nos permite obtener el número de la habitación desde otras partes del programa.
- `setEstaOcupada(estado)`: Permite cambiar si la habitación está libre u ocupada.

### Objeto Secundario: Huésped

**¿Qué es?:** La persona que se aloja en el hotel y hace uso de los servicios. Es nuestro cliente.

**Atributos identificados:**
- `identificacion`: String - Documento de identidad del cliente.
- `nombreCompleto`: String - Nombre completo del cliente.
- `telefonoContacto`: String - Teléfono de contacto.
- `diasEstancia`: int - El número de noches reservadas.
- `tieneCheckIn`: boolean - Indica si el cliente ya se ha registrado y recibido las llaves.

**Métodos identificados:**
- `registrarLlegada()`: Realiza el proceso de Check-in, marcando al huésped como presente en el hotel.
- `esEstanciaLarga()`: Revisa si el huésped se queda más de 3 días para ver si aplica para beneficios especiales.
- `getIdentificacion()`: Nos permite obtener el documento de identidad del huésped.

## 3. Relación entre Objetos

**Tipo de relación:** **Asociación** (Relación de uso).

**Descripción:** Los objetos están asociados porque, en la vida real del hotel, un **Huésped** debe ocupar una **Habitación**. Cuando un huésped se registra (`registrarLlegada`), el estado de la habitación debe cambiar (`setEstaOcupada`). Ambos objetos son independientes (si eliminamos al huésped, la habitación sigue existiendo), pero trabajan juntos para gestionar el servicio de hospedaje.

## 4. Justificación del Diseño

**¿Por qué elegimos estos dos objetos?**
Porque modelar el **Alojamiento** es el corazón del negocio de un hotel. La `Habitación` es el producto que se vende y el `Huésped` es el cliente que lo compra. Todo el resto del hotel (restaurante, spa) depende de estas dos entidades.

**¿Por qué es útil la POO (Programación Orientada a Objetos)?**

| Sin POO (Programación Estructurada) | Con POO (Nuestro Diseño) |
| :--- | :--- |
| Tendríamos que manejar **listas separadas** (una lista para números, otra para precios, otra para si está ocupada). | Cada **objeto** (`Habitación`) guarda su precio, número y estado, lo que es mucho más organizado. |
| Sería difícil hacer cálculos porque tendríamos que pasar **muchas variables** a una función genérica: