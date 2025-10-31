🧠 Ejercicios de Arrays en Java

👨‍💻 Repositorio personal de práctica mientras aprendo Java Backend




📚 Descripción general

Este repositorio forma parte de mi proceso de aprendizaje en Java.
Aquí guardo ejercicios prácticos que realizo mientras estudio y fortalezco mis bases en programación backend.

Cada bloque representa una etapa de mi progreso:

🟢 Bloque 1: Arrays básicos

🔵 Bloque 2: Arrays combinados con bucles

🟣 Próximo: Métodos (diciembre 2025)


Mi objetivo es dominar cada tema a profundidad antes de avanzar al siguiente, aplicando lógica, estructura y buenas prácticas desde los fundamentos.




🧩 Ejercicios actuales

🔹 Bloque 1 — Arrays Básicos

Archivo: Programadores_Arrays_java.java

Simula una base de datos de programadores.

Muestra nombre, edad, especialidad, lenguaje y sueldo.

Calcula el total general de sueldos.
🧠 Enfocado en entender cómo almacenar y relacionar datos con distintos tipos de arrays (String, int, double).





🔹 Bloque 2 — Arrays con Bucles

Archivo: Array_ejercicios_Bloque2.java

Clasifica frutas por color (rojas, amarillas, verdes).

Usa bucles for y while anidados para recorrer cada grupo.

Combina arrays y condicionales if para mostrar resultados dinámicos.
🧠 Enfocado en combinar lógica de bucles con estructura de datos.





🚀 Objetivo general

Seguir desarrollando mi lógica y estructura mental como programador backend.
Este repositorio es parte de mi camino hacia convertirme en desarrollador Fullstack especializado en Java



1️⃣BLOQUE 1

🧠 Proyecto: Programadores y Arrays en Java

📘 Descripción

Este programa muestra el uso práctico de arreglos (arrays) en Java para manejar varios tipos de datos relacionados entre sí.
Simula una pequeña base de datos de programadores, mostrando su nombre, lenguaje, especialidad, edad y sueldo mensual, además de calcular el total general de sueldos.

⚙️ Funcionalidades

✅ Uso de múltiples arrays (String, int, double)
✅ Cálculo del total de sueldos
✅ Asociación de información entre diferentes arreglos
✅ Salida formateada en consola mostrando los datos de cada programador

🧩 Código principal

El programa utiliza diferentes tipos de arreglos para almacenar y relacionar datos:

String[] nombre = {"Francisco", "María", "José", "Ismael"};
String[] lenguajes = {"Java", "JavaScript", "Python", "C#"};
String[] especialidad = {"Backend APIs/Security", "Frontend", "Ciberseguridad", "Backend Cloud"};
int[] edades = {21, 25, 19, 23};
double[] sueldo = {1200, 800, 2000, 1500};

Luego, imprime toda la información de forma ordenada y calcula la suma total de los sueldos.

💡 Objetivo educativo

Este ejercicio forma parte del Bloque 1 de Arrays, dentro del aprendizaje progresivo de Java.
El objetivo es comprender cómo agrupar y manipular datos relacionados usando arreglos sin necesidad de bucles o estructuras avanzadas.

🧰 Tecnologías usadas

☕ Java 17+

🖥️ IntelliJ IDEA


📅 Etapa de aprendizaje

🔹 Etapa actual: Arrays – Bloque 1 (Ejercicios Básicos)
🔹 Próxima etapa: Arrays con bucles y combinaciones

👨‍💻 Autor

Jewery Francisco Espinal Cabrera

Jewery Francisco Espinal Cabrera
📍 República Dominicana
💼 LinkedIn:(https://www.linkedin.com/in/jewery-francisco-espinal-cabrera-a09205378)
📚 Backend Developer | Aprendiz de Java y POO

2️⃣BLOQUE 2🍎🍉🍍

📘 Descripción

Este programa combina arrays y bucles para organizar y mostrar diferentes tipos de frutas clasificadas por color.
Cada color (rojo, amarillo y verde) tiene su propio arreglo de frutas, y un bucle for junto con bucles while anidados se encargan de recorrerlos dinámicamente.

El objetivo principal es aprender a trabajar con múltiples arreglos y estructuras anidadas, entendiendo cómo automatizar procesos sin repetir código.




🧩 Funcionalidades

✅ Clasificación de frutas por color
✅ Uso de bucles for y while
✅ Lógica condicional con if
✅ Impresión automática de datos agrupados
✅ Ejemplo práctico del uso de arrays dentro de arrays




💻 Código principal

public class Array_ejercicios_Bloque2 {
    public static void main(String[] args) {
        String[] frutasRojas = {"manzanas", "fresas", "uvas"};
        String[] frutasAmarillas = {"piñas", "chinola", "mangos"};
        String[] frutasVerdes = {"sandías", "mangos", "peras"};
        String[] colores = {"rojo", "amarillo", "verde"};

        int R = 0, A = 0, V = 0;

        for (int f = 0; f < colores.length; f++) {
            System.out.println("Frutas de color: " + colores[f]);
            
            if (f == 0) {
                while (R < frutasRojas.length) {
                    System.out.println(frutasRojas[R]);
                    R++;
                }
            }
            if (f == 1) {
                while (A < frutasAmarillas.length) {
                    System.out.println(frutasAmarillas[A]);
                    A++;
                }
            }
            if (f == 2) {
                while (V < frutasVerdes.length) {
                    System.out.println(frutasVerdes[V]);
                    V++;
                }
            }

            System.out.println();
        }
    }
}




🧠 Conceptos aplicados

Arreglos múltiples (String[])

Bucles for y while

Lógica condicional con if

Estructura de control anidada

Organización de datos





🖥️ Ejemplo de salida

Frutas de color: rojo
manzanas
fresas
uvas

Frutas de color: amarillo
piñas
chinola
mangos

Frutas de color: verde
sandías
mangos
peras




🎯 Objetivo educativo

Comprender cómo recorrer múltiples arreglos relacionados utilizando bucles,
reducir código repetido y mejorar la organización de la información dentro de un programa Java.




🧩 Archivo

Array_ejercicios_Bloque2.java




💡 Autor

Jewery Francisco Espinal Cabrera
📍 Backend Learner | Java Developer en formación
📎 💼 LinkedIn: (https://www.linkedin.com/in/jewery-francisco-espinal-cabrera-a09205378)
📘 Repositorio creado como parte de mi proceso de aprendizaje para convertirme en Desarrollador Fullstack especializado en Backend (Java)



