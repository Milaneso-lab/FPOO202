import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Entrega {

    private String numeroGuia;
    private String estado;

    // CONSTRUCTOR DE LA CLASE
    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    // ZONA DE GETS Y SETS
    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    // METODOS DE LA CLASE
    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    private static List<Entrega> entregas = new ArrayList<>();

    static void registrarEntrega() {
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
        Entrega entrega = new Entrega(numeroGuia);
        entregas.add(entrega);
        JOptionPane.showMessageDialog(null, "Entrega registrada: " + entrega.getNumeroGuia() + ", Estado: " + entrega.getEstado());
    }

    static void actualizarEstadoEntrega() {
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega que desea actualizar:");
        Entrega entrega = null;
        for (Entrega e : entregas) {
            if (e.getNumeroGuia().equals(numeroGuia)) {
                entrega = e;
                break;
            }
        }
        if (entrega == null) {
            JOptionPane.showMessageDialog(null, "Entrega no encontrada.");
            return;
        }
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito/Entregado):");
        entrega.actualizarEstado(nuevoEstado);
        JOptionPane.showMessageDialog(null, "Estado de la entrega actualizado: " + entrega.getNumeroGuia() + ", Estado: " + entrega.getEstado());
    }

    public static void main(String[] args) {
        registrarEntrega();
        actualizarEstadoEntrega();
    }

}// FIN DE LA CLASE0
