import javax.swing.JOptionPane;

public class Cuenta {

    public int No_cuenta;
    public String titular, edad;
    public float saldo, monto;

    public void Consultar(){
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo actual:"));
        JOptionPane.showMessageDialog(null, "El saldo es de: " + saldo);
    }

    public void Ingresar (float monto) {
        monto = (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a ingresar:"));
        float total = saldo + monto;
        JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es: " + total);
    }

    public void Retirar (float Monto) {
        Monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
        if (saldo > 0) {
            float SaldoNuevo = saldo - Monto;
            JOptionPane.showMessageDialog(null, "El saldo actual es de: " + SaldoNuevo);
        } else {
            JOptionPane.showMessageDialog(null, "El saldo es insuficiente para el retiro");
        }
    }

    public void Depositar (Cuenta miCuenta, float montoDeposito) {
        Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de cuenta destinatario:"));
        montoDeposito = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
        if (saldo > 0) {
            float total = saldo - montoDeposito;
            JOptionPane.showMessageDialog(null, "El deposito fue exitoso");
            JOptionPane.showMessageDialog(null, "El saldo actual es de: " + total);
        } else {
            JOptionPane.showMessageDialog(null, "El saldo es insuficiente.");
        }
    }

}
