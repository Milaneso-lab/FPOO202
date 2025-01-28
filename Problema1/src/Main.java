import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca sus horas trabajadas al dia: ");
        int horas = scn.nextInt();
        System.out.println("Introduce el precio por hora: ");
        double precio = scn.nextDouble();

        double pago = horas * precio;

        System.out.println("El total a pagarte es: "+pago);
    }
}