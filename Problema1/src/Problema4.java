import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa tu nombre completo: ");
        String nombre = scn.nextLine();

        String nombreSin = nombre.replace(" ", "");

        System.out.println(nombre + " tiene " + nombreSin.length() + " letras.");

    }
}
