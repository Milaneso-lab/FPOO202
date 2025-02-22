import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Generador nueva = new Generador();

        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del password (8 por defecto):");
        int length = (inputLength != null && !inputLength.isEmpty()) ? Integer.parseInt(inputLength) : 8;

        int useUpper = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        int useSpecials = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);

        String password = nueva.generatePassword(length, useUpper == JOptionPane.YES_OPTION, useSpecials == JOptionPane.YES_OPTION);
        String strength = nueva.checkStrength(password);

        JOptionPane.showMessageDialog(null, "Password generado: " + password + "\nFortaleza: " + strength);

    }
}
