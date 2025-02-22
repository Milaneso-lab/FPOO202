import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Random;

public class Generador {

    public String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String NUMBERS = "0123456789";
    public String SPECIALS = "!@#$%^&*()-_=+<>?";
    public int longitud;
    public String Password;

    private final SecureRandom random = new SecureRandom();

    public void ingresarLongitud (int longitud){
        longitud = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingresa la longitud de la contraseña:"));

    }
        public String generatePassword(int length, boolean useUpper, boolean useSpecials) {
            String charPool = LOWERCASE + NUMBERS;
            if (useUpper) charPool += UPPERCASE;
            if (useSpecials) charPool += SPECIALS;

            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                password.append(charPool.charAt(random.nextInt(charPool.length())));
            }
            return password.toString();
        }

        public String checkStrength(String password) {
            int score = 0;
            if (password.length() >= 8) score++;
            if (password.matches(".*[A-Z].*")) score++;
            if (password.matches(".*[0-9].*")) score++;
            if (password.matches(".*[!@#$%^&*()-_=+<>?].*")) score++;

            switch (score) {
                case 4: return "Fuerte";
                case 3: return "Media";
                case 2: return "Débil";
                default: return "Muy débil";
            }
        }

}// Fin de la clase



