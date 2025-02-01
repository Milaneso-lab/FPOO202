import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese la altura del árbol: ");
        int altura = scn.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
5
        for (int i = 0; i < altura - 1; i++) {
            System.out.print(" ");
        }
    }
}
