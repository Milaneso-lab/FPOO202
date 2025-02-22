import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Random;

public class Generador {

    public String caracteresMin = "abcdefghijklmnopqrstuvwxyz";
    public String caracteresMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String numeros = "0123456789";
    public String especiales = "!@#$%^&*()-_=+<>?";
    public int longitud;
    public String Password;

    private final SecureRandom random = new SecureRandom();

    public void ingresarLongitud (int longitud){
        longitud = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingresa la longitud de la contraseña:"));

    }
    public void generadorContra(int longitud, boolean caracteresMin, boolean caracteresMay, boolean especiales) {
        String charPool = caracteresMin + numeros;
        if (caracteresMin) charPool += caracteresMay;
        if (especiales) charPool += especiales;

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            password.append(charPool.charAt(random.nextInt(charPool.length())));
        }
        JOptionPane.showMessageDialog(null, "La contrasena generada es: " + password);
    }

    public void Validacion(int longitud, int caracteresMin, int caracteresMay, int especiales) {
        int score = 0;
        if (longitud >= 8) score++;
        if (caracteresMay == 1) score++;
        if (caracteresMin == 1) score++;
        if (especiales == 1) score++;

        if (score == 4){
            JOptionPane.showMessageDialog(null, "La contrasena es: FUERTE");
        } else if (score == 3){
            JOptionPane.showMessageDialog(null, "La contrasena es: MEDIA");
        } else if (score == 2){
            JOptionPane.showMessageDialog(null, "La contrasena es: DEBIL");
        } else {
            JOptionPane.showMessageDialog(null, "La contrasena NO ES SEGURA");
        }
    }

}// Fin de la clase



