import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa tu edad antes de entrar: ");
        int edad = scn.nextInt();

        if (edad<4){
            System.out.println("Su entrada es GRATIS");
        } else if (edad<=18){
            System.out.println("Usted debe pagar $110");
        }else {
            System.out.println("Usted debe pagar $190");
        }
    }
}
