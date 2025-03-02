import javax.swing.JOptionPane;

public class Envios {

    private String codigoEnvio;
    private String destino;
    private double peso;

    // CONSTRUCTOR DE LA CALSE
    public Envios(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public Envios(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    // ZONA DE GETS Y SETS
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // METODOS DE LA CLASE
    public static Envios crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso (opcional):");
        double peso = pesoStr.isEmpty() ? 0 : Double.parseDouble(pesoStr);
        return peso == 0 ? new Envios(codigoEnvio, destino) : new Envios(codigoEnvio, destino, peso);
    }

    public static void registrarEnvio() {
        Envios envio = Envios.crearEnvio();
        JOptionPane.showMessageDialog(null, "Envío registrado: " + envio.getCodigoEnvio() + ", " + envio.getDestino() + ", " + envio.getPeso());
    }

}// FIN DE LA CLASE
