import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Escriba la primera palabra: ");
        String palabra1 = scn.nextLine();

        System.out.println("Escriba la segunda palabra: ");
        String palabra2 = scn.nextLine();

        String palabra1Sin = palabra1.replace(" ", "");
        String palabra2Sin = palabra2.replace(" ", "");

        if (palabra1Sin.length() > palabra2Sin.length()){
            int diferencia = palabra1Sin.length() - palabra2Sin.length();
            System.out.println("La palabra " + palabra1 + "es más larga.");
            System.out.println("Por: " + diferencia + " letras.");
        } else{
            int diferencia = palabra2Sin.length() - palabra1Sin.length();
            System.out.println("La palabra " + palabra2 + "es más larga");
            System.out.println("Por: " + diferencia + " letras.");
        }
        System.out.println();
    }
}
