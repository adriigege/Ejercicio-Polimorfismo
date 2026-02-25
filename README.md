# Ejercicio de Polimorfismo — Juego Multijugador en Java
Ejercicio básico de polimorfismo con sobreescritura de métodos (overriding) hecho por mi, aprendido en el Ciclo Formativo Grado Superior de Desarrollo de Aplicaciones Web (DAW).

Este proyecto es una aplicación en **Java** que permite simular partidas de distintos juegos (Ajedrez, Damas y Tres en raya) entre dos jugadores. El código está organizado en varias clases que representan jugadores, un tablero, una clase base de juego y subclases específicas para cada tipo de juego.


---

## 📌 Contenido del programa

### 🎮 `Main.java`

Es la **clase principal** del programa.  
Desde aquí se controla toda la ejecución:

- Se crean dos jugadores.
- Se define el tamaño del tablero.
- Se elige el tipo de juego a ejecutar.
- Se muestra el resultado final del juego seleccionado.

---

## 🧱 Clases

### 👤 `Jugador.java`

Representa a un jugador del juego.

Contiene:
- Nombre del jugador
- Puntuación (generada de forma aleatoria)

Incluye métodos para acceder a los datos y mostrarlos por pantalla.

---

### 📏 `Tablero.java`

Representa el tablero del juego.

Contiene:
- Número de filas
- Número de columnas

Se utiliza en todos los juegos para definir el espacio de juego.

---

### 🕹️ `Juego.java`

Clase base de todos los juegos.

Contiene:
- Un tablero
- Dos jugadores
- Número de fichas
- Duración del juego

Define el método `jugar()`, que es sobrescrito por cada juego concreto.

---

## 🎲 Juegos disponibles

### ♟️ `Ajedrez.java`

Simula una partida de ajedrez.

Características:
- Número de peones
- Número de figuras

El método `jugar()` compara la puntuación de los jugadores y determina el ganador o si hay empate.

---

### 🔲 `Damas.java`

Simula una partida de damas.

Características:
- Fichas blancas
- Fichas negras

El método `jugar()` muestra el resultado según la puntuación de los jugadores y las fichas utilizadas.

---

### ❌ `Tres_en_raya.java`

Simula una partida de tres en raya con varias rondas.

Funcionamiento:
- Se generan puntuaciones aleatorias en cada movimiento.
- Se suman los puntos de cada jugador.
- Se muestra el resultado de cada ronda y el ganador final o empate.

---

## ▶️ Cómo ejecutar el programa

### 1️⃣ Requisitos

- Tener **Java JDK** instalado
- Un IDE como **IntelliJ IDEA**, **Eclipse** o **NetBeans**  
  (también se puede ejecutar desde consola)

---

### 2️⃣ Ejecución desde un IDE

1. Importa el proyecto en tu IDE.
2. Accede a la carpeta: u4-2-ejercicio 8/src
3. 3. Ejecuta la clase `Main.java`.
4. Sigue las instrucciones que aparecen por pantalla.

---
