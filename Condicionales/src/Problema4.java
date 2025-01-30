import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese su palabra o frase: ");
        String palabra = scn.nextLine();

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equalsIgnoreCase(invertida)){
            System.out.println("La palabra \"" + palabra + "\" ES UN palindromo");
        }else {
            System.out.println("La palabra \"" + palabra + "\" NO ES UN palindromo");
        }
        scn.close();
    }
}
