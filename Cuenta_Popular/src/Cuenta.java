import javax.swing.JOptionPane;

public class Cuenta {
    private int noCuenta;
    private String titular;
    private int edad;
    private float saldo;

    // Constructor
    public Cuenta(int noCuenta, String titular, int edad, float saldoInicial) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldoInicial;
    }

    // ZONA DE GETS Y SETS
    public int getNoCuenta() {
        return noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getEdad() {
        return edad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // METODOS DE LA CLASE
    public void consultar() {
        JOptionPane.showMessageDialog(null, "El saldo es de: " + saldo);
    }

    public void ingresar() {
        float monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a ingresar:"));
        saldo += monto;
        JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es: " + saldo);
    }

    public void retirar() {
        float monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
        if (saldo >= monto) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "El saldo actual es de: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para el retiro");
        }
    }

    public void depositar(Cuenta cuentaDestino) {
        float montoDeposito = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
        if (saldo >= montoDeposito) {
            saldo -= montoDeposito;
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + montoDeposito);
            JOptionPane.showMessageDialog(null, "El depósito fue exitoso. Saldo actual: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
    }

} // FIN DE LA CLASE
