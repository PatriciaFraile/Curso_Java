
public class Main {

    public static void main(String[] args) {
        System.out.println("Introducción a los conceptos básicos de Java");

        // 1. Variables y Tipos de Datos
        int numeroEntero = 10;
        double numeroDecimal = 5.75;
        char caracter = 'A';
        boolean esVerdadero = true;
        String texto = "Hola, Java!";

        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Caracter: " + caracter);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Texto: " + texto);

        // 2. Operadores Aritméticos
        int suma = numeroEntero + 5;
        int resta = numeroEntero - 3;
        int producto = numeroEntero * 2;
        double division = numeroEntero / 2.0;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);

        // 3. Estructuras de Control - Condicionales
        if (numeroEntero > 5) {
            System.out.println("El número es mayor que 5");
        } else if (numeroEntero == 5) {
            System.out.println("El número es igual a 5");
        } else {
            System.out.println("El número es menor que 5");
        }

        // 4. Bucles - for y while
        System.out.println("Bucle for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("Bucle while:");
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // 5. Arrays
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Elemento en el índice 2: " + numeros[2]);

        // Iterar sobre un array con un bucle for-each
        System.out.println("Array completo:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // 6. Métodos
        int resultado = sumar(10, 20);
        System.out.println("Resultado de la suma: " + resultado);

        // 7. Clases y Objetos
        Persona persona = new Persona("Juan", 25);
        persona.presentarse();
    }

    // Método para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }
}

// Clase Persona para demostrar la creación de clases y objetos
class Persona {
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para que la persona se presente
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
