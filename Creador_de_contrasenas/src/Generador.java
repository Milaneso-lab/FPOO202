import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Random;

public class Generador {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIALS = "!@#$%^&*()-_=+<>?";
    private int longitud;
    private String password;
    private final SecureRandom random = new SecureRandom();

    // CONSTRUCTOR DEL PROGRAMA
    public Generador(int longitud) {
        this.longitud = longitud;
        this.password = "";
    }

    // ZONA DE GETS Y SETS
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public void ingresarLongitud() {
        this.longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud de la contraseña:"));
    }

    public String generatePassword(boolean useUpper, boolean useSpecials) {
        String charPool = LOWERCASE + NUMBERS;
        if (useUpper) charPool += UPPERCASE;
        if (useSpecials) charPool += SPECIALS;

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            passwordBuilder.append(charPool.charAt(random.nextInt(charPool.length())));
        }
        this.password = passwordBuilder.toString();
        return this.password;
    }

    public String checkStrength() {
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



