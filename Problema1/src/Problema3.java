import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");
        int entero = scn.nextInt();

        int suma = calcularSuma(entero);
        System.out.println("La suma de los numeros es: "+suma);
    }

    public static int calcularSuma(int entero){
        int suma = 0;

        for (int i = 1; i <= entero; i++){
            suma += i;
        }
        return suma;
    }
}

