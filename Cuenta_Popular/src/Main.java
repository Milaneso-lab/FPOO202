import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Creacion de una instancia
        Cuenta Milaneso = new Cuenta();

        Milaneso.No_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta:"));
        Milaneso.titular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta");
        Milaneso.edad = String.valueOf((int) Double.parseDouble(JOptionPane.showInputDialog("Ingerse la edad del titular")));
        Milaneso.saldo = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial"));

        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar Efectivo", "Depositar a otra cuenta", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Administración de la cuenta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    Milaneso.Consultar();
                    break;

                case 1:
                    float monto = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar: "));
                    if(monto > 0 ) {
                        Milaneso.Ingresar(monto);
                    }else {
                        JOptionPane.showMessageDialog(null, "La cantidad de ser positiva");
                    }

                    break;

                case 2:
                    float Monto = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                    if(Monto > 0) {
                        Milaneso.Retirar(Monto);
                    }else {
                        JOptionPane.showMessageDialog(null,"La cantidad debe de ser positiva");
                    }
                    break;

                case 3:
                    Cuenta MiCuenta = new Cuenta();
                    MiCuenta.No_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuenta a depositar"));
                    MiCuenta.titular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta");
                    MiCuenta.edad = String.valueOf(Integer.parseInt((JOptionPane.showInputDialog("Ingrese la edad del titular de la cuenta: "))));
                    MiCuenta.saldo = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de la otra cuenta: "));
                    float montoDeposito = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar: "));

                    Milaneso.Depositar(MiCuenta, montoDeposito);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida.");

                case 4 :
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por su preferencia");
            }

        }
    }
}

