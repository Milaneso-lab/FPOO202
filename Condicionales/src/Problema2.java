import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");
        int numero = scn.nextInt();

        if (numero%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
