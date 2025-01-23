//Zona de importacion
import java.util.Scanner;

//clase principal
public class Main {
    //metodo main-principal
    public static void main(String[] args) {

/*        System.out.println("Hello, Antonio Madriz");
        System.out.println("Hello, Antonio Madriz");
        System.out.println("Hello, Antonio Madriz");*/


        //2. Cadenas

/*        String cadena = "Antonio" + "Flores" + "Madriz";
        System.out.println(cadena);

        //conteo de longitud de cadena
        System.out.println(cadena.length());

        //Extraccion de caracteres con base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));*/

        //3. Variables

/*        String cadena = "333", cadena2, cadena3;
        int entero = 3, entero2, entero3;
        double decimal = 3.354, decimal2, decimal3;

        //convertir cadena a int
        entero2 = Integer.parseInt(cadena);
        System.out.println(entero2);

        //convertir double a int
        entero3 = (int) decimal;
        System.out.println(entero3);

        //convertir double a cadena
        cadena2 = String.valueOf(decimal);
        System.out.println(cadena2);

        //convertir int a double
        decimal2 = Double.valueOf(entero);
        System.out.println(decimal2);

        //conversion implicita
        int i = 12;
        double numd = i;
        System.out.println(numd);*/

        //  4. Solicitud de informacion

/*        Scanner scn= new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String cadena= scn.nextLine();

        System.out.println("Escribe un numero entero: ");
        int entero= scn.nextInt();

        System.out.println("Escribe un numero decimal: ");
        double decimal= scn.nextDouble();

        System.out.println("Nombre guardado: "+cadena);
        System.out.println("Entero guardado: "+entero);
        System.out.println("Decimal guardado: "+decimal);*/

        //  5. Boolean, operadores logicos y de comparacion

            //Los operadores de comparacion siempre
/*        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);*/

            //Operadores logicos
        int x=3;
        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x<5 && x>10));
        System.out.println(!(x<5 || x>10));
    }
}