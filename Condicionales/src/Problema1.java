import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

       String key = "milaneso123";
       String password;

       System.out.println("Ingresa la contraseña: ");
       password = scn.nextLine();

       if (key.equalsIgnoreCase(password)){
           System.out.println("La contraseña es correcta");
       } else {
           System.out.println("La contraseña es incorrecta");
       }

       scn.close();
    }
}
