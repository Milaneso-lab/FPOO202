import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");
        int numero = scn.nextInt();

        if (numero >= 0) {
            StringBuilder resultado = new StringBuilder();

            for (int i = numero; i >= 0; i--) {
                resultado.append(i).append(", ");
            }
            if (resultado.length() > 0) {
                resultado.setLength(resultado.length() - 2);
            }
            System.out.println("La cuenta atras es: " + resultado);
        } else {
            System.out.println("Por favor, ingresa un número entero positivo.");
        }
        scn.close();
    }
}

