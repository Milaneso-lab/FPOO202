import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe una frase que te guste: ");
        String frase = scn.nextLine();

        String invertida = new StringBuilder(frase).reverse().toString();

        System.out.println("La frase al reves es: "+ invertida);
    }
}
