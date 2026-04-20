//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Comentario de una sola línea

/* Comentario de varias líneas */

/** Comentario javadoc
 *  @author Nombre
 *  @version 1.0
 */
// Clases e interfaces (CamelCase)
        public class CocheRapido {}
        interface Volable {}

// Métodos y variables (camelCase)
        int velocidadMaxima = 200;
        void calcularVelocidad() {}

// Constantes (MAYÚSCULAS)
        final double PI = 3.1416;
        boolean activo = true;
        char letra = 'A';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000000000L;
        float f = 10.5f;
        double d = 20.99;
        int a = 10, b = 3;
        System.out.println(a + b); // Suma
        System.out.println(a - b); // Resta
        System.out.println(a * b); // Multiplicación
        System.out.println(a / b); // División
        System.out.println(a % b); // Módulo
        int x = 5;
        x++;   // Incrementa
        x--;   // Decrementa
        int y = -x; // Negativo
        int n = 5;
        System.out.println(n > 3);
        System.out.println(n == 5);
        System.out.println(n != 2);
        boolean p = true, q = false;
        System.out.println(p && q); // AND
        System.out.println(p || q); // OR
        System.out.println(!p);     // NOT
        System.out.println(p ^ q);  // XOR
        int edad = 20;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(resultado);
// Conversión implícita
        int num = 10;
        double valor = num;  // int → double

// Conversión explícita
        double precio = 9.99;
        int entero = (int) precio; // Pierde decimales
        int numero = 5;       // Variable local
        final double IVA = 0.21; // Constante
        int a = 5;
        a += 3;  // a = a + 3
        a -= 2;  // a = a - 2
        a *= 4;  // a = a * 4
        a /= 2;  // a = a / 2
    }
}