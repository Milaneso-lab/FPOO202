import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Creación de una instancia con datos iniciales
        int noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        String titular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        float saldoInicial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial"));

        Cuenta milaneso = new Cuenta(noCuenta, titular, edad, saldoInicial);

        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar Efectivo", "Depositar a otra cuenta", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Administración de la cuenta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    milaneso.consultar();
                    break;
                case 1:
                    milaneso.ingresar();
                    break;
                case 2:
                    milaneso.retirar();
                    break;
                case 3:
                    int noCuentaDestino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuenta a depositar"));
                    String titularDestino = JOptionPane.showInputDialog("Ingrese el titular de la cuenta");
                    int edadDestino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular de la cuenta:"));
                    float saldoDestino = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial de la otra cuenta:"));

                    Cuenta miCuenta = new Cuenta(noCuentaDestino, titularDestino, edadDestino, saldoDestino);
                    milaneso.depositar(miCuenta);
                    break;
                case 4:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por su preferencia");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}

