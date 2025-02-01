import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int saldo = 0;

        System.out.println("Ingrese las operaciones (D cantidad para depósito, R cantidad para retiro).");
        System.out.println("Deje una línea vacía para finalizar.");
        System.out.println();
        System.out.println("Su saldo actual es de: " + saldo);

        while (true) {
            String entrada = scn.nextLine().trim();
            if (entrada.isEmpty()) {
                break;
            }

            char tipo = entrada.charAt(0);
            int cantidad = Integer.parseInt(entrada.substring(2).trim());

            if (tipo == 'D') {
                saldo += cantidad;
            } else if (tipo == 'R') {
                saldo -= cantidad;
            } else {
                System.out.println("Operación no válida, use 'D' para depósito o 'R' para retiro.");
            }
        }

        System.out.println("Saldo final: " + saldo + " pesos.");
    }
}
