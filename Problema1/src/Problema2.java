import java.util.Scanner;
import java.util.function.Function;

public class Problema2 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba tu nombre: ");
        String nombre = scn.nextLine();

        System.out.println("Tu nombre en mayusculas: ");
        System.out.println( nombre.toUpperCase());

        System.out.println("Tu nombre en minisculas: ");
        System.out.println(nombre.toLowerCase());

        System.out.println("Tu nombre con iniciales mayusculas: ");
        System.out.println(FormateadorNombre.inicialesMayusculas(nombre));

        scn.close();
    }
}
class FormateadorNombre {

    public static String inicialesMayusculas(String texto) {
        String[] palabras = texto.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                resultado.append(Character.toUpperCase(palabra.charAt(0))) // Primera letra en mayúscula
                        .append(palabra.substring(1).toLowerCase()) // Resto en minúscula
                        .append(" ");
            }
        }

        return resultado.toString().trim();
    }
}
