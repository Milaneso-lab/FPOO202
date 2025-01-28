import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int pesoP = 112;
        int pesoM = 75;

        System.out.println("Escriba la cantidad de payasos enviados: ");
        int payasos = scn.nextInt();

        System.out.println("Escriba la cantidad de muñecas: ");
        int munecas = scn.nextInt();

        int pesoTotal = (payasos*pesoP) + (munecas*pesoM);

        System.out.println("El peso total en GRAMOS es de: "+ pesoTotal);
    }
}
