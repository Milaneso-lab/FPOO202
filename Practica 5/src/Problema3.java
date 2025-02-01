import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa un numero del 1 al 10 para conocer tu tabla de multiplicacion: ");
        int numero = scn.nextInt();

        System.out.println("---------------------");
        System.out.println("La tabla de multiplicar de: " + numero);

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + numero*i);
        }
    }
}
