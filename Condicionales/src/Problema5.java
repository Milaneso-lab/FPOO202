import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);

        float x, y, resultado = 0;
        String op;
        boolean valido = true;

        System.out.print("Ingresa el primer número: ");
        x = snc.nextFloat();

        System.out.print("Ingresa el segundo número: ");
        y = snc.nextFloat();

        snc.nextLine();  // Consumir el salto de línea pendiente

        System.out.print("Ingrese el símbolo de la operación a realizar (+, -, *, /): ");
        op = snc.nextLine();

        switch (op) {
            case "+":
                resultado = x + y;
                break;
            case "-":
                resultado = x - y;
                break;
            case "*":
                resultado = x * y;
                break;
            case "/":
                if (y != 0) {
                    resultado = x / y;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    valido = false;
                }
                break;
            default:
                valido = false;
        }

        if (valido) {
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("El operador no es válido.");
        }

        snc.close();
    }
}
