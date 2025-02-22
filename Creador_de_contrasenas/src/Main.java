import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Generador nueva = new Generador();

        nueva.longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña:"));
        nueva.caracteresMin = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Desea usar MINUSCULAS:")));
        nueva.caracteresMay = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Desea usar MAYUSCULAS:")));
        nueva.especiales = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Desea usar caracteres ESPECIALES:")));

        nueva.generadorContra(nueva.longitud, Boolean.parseBoolean(nueva.caracteresMin), Boolean.parseBoolean(nueva.caracteresMay), Boolean.parseBoolean(nueva.especiales));
        

    }
}
