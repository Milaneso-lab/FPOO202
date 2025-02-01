import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero deseado: ");
        int numero = scn.nextInt();

        if (numero > 0){
            StringBuilder resultado = new StringBuilder();

            for (int i = 1; i <= numero; i += 2) {
                resultado.append(i).append(", ");
            }

            if (resultado.length() > 0) {
                resultado.setLength(resultado.length() - 2);
            }

            System.out.println("Lista de numeros impares: " + resultado);
        } else {
            System.out.println("Por favor, ingresa un número entero positivo.");
        }
        scn.close();
    }
}


