import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scn.nextLine();

        System.out.print("Ingrese una letra: ");
        char letra = scn.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == Character.toLowerCase(letra)) {
                contador++;
            }
        }
        System.out.println("La letra dada aparece un total de: " + contador);
    }
}
