import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa la altura del triangulo: ");
        int numero = scn.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();

            }
        } else {
            System.out.println("Por favor, ingresa un número entero positivo.");
        }

        scn.close();
        }
    }

