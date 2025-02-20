import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Creacion de una instancia
        Cuenta Milaneso = new Cuenta();

        Milaneso.No_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta: "));
        JOptionPane.showMessageDialog(null, "Bienvenido");

        Milaneso.Consultar();

    }
}