import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    // CONSTRUCTOR DE LA CLASE
    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    // ZONA DE GETS Y SETS
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    // METODOS DE LA CLASE
    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            System.out.println("El conductor ya ha sido asignado y no puede modificarse.");
        }
    }

    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static List<Conductor> conductores = new ArrayList<>();
    private static List<Envios> envios = new ArrayList<>();
    private static List<Entrega> entregas = new ArrayList<>();

    public static void registrarVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));
        Vehiculo vehiculo = new Vehiculo(placa, modelo, capacidadCarga);
        vehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null, "Vehículo registrado: " + vehiculo.getPlaca() + ", " + vehiculo.getModelo() + ", " + vehiculo.getCapacidadCarga());
    }

    public static void asignarConductorAVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo al que desea asignar el conductor:");
        Vehiculo vehiculo = null;
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                vehiculo = v;
                break;
            }
        }
        if (vehiculo == null) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
            return;
        }
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor que desea asignar:");
        Conductor conductor = null;
        for (Conductor c : conductores) {
            if (c.getIdentificacion().equals(identificacion)) {
                conductor = c;
                break;
            }
        }
        if (conductor == null) {
            JOptionPane.showMessageDialog(null, "Conductor no encontrado.");
            return;
        }
        vehiculo.asignarConductor(conductor);
        JOptionPane.showMessageDialog(null, "Conductor asignado al vehículo: " + vehiculo.getPlaca());
    }

    static void mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Vehículos:\n");
        for (Vehiculo vehiculo : vehiculos) {
            info.append("Placa: ").append(vehiculo.getPlaca()).append(", Modelo: ").append(vehiculo.getModelo()).append(", Capacidad: ").append(vehiculo.getCapacidadCarga()).append("\n");
            if (vehiculo.getConductor() != null) {
                info.append("  Conductor: ").append(vehiculo.getConductor().getNombre()).append(", Identificación: ").append(vehiculo.getConductor().getIdentificacion()).append("\n");
            }
        }
        info.append("\nConductores:\n");
        for (Conductor conductor : conductores) {
            info.append("Nombre: ").append(conductor.getNombre()).append(", Identificación: ").append(conductor.getIdentificacion()).append(", Licencia: ").append(conductor.getLicencia()).append("\n");
        }
        info.append("\nEnvíos:\n");
        for (Envios envio : envios) {
            info.append("Código: ").append(envio.getCodigoEnvio()).append(", Destino: ").append(envio.getDestino()).append(", Peso: ").append(envio.getPeso()).append("\n");
        }
        info.append("\nEntregas:\n");
        for (Entrega entrega : entregas) {
            info.append("Número de Guía: ").append(entrega.getNumeroGuia()).append(", Estado: ").append(entrega.getEstado()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }

    public static void main(String[] args) {
        registrarVehiculo();
        asignarConductorAVehiculo();
        mostrarInformacion();
    }
}
