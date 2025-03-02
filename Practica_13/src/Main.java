import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<Vehiculo> vehiculos = new ArrayList<>();
            List<Conductor> conductores = new ArrayList<>();
            List<Envios> envios = new ArrayList<>();
            List<Entrega> entregas = new ArrayList<>();

                while (true) {
                    String[] options = {
                            "Registrar Vehículo", "Registrar Conductor", "Asignar Conductor a Vehículo",
                            "Registrar Envío", "Registrar Entrega", "Actualizar Estado de Entrega",
                            "Mostrar Información", "Salir"
                    };
                    int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                    switch (choice) {
                        case 0:
                            Vehiculo.registrarVehiculo();
                            break;
                        case 1:
                            Conductor.registrarConductor();
                            break;
                        case 2:
                            Vehiculo.asignarConductorAVehiculo();
                            break;
                        case 3:
                            Envios.registrarEnvio();
                            break;
                        case 4:
                            Entrega.registrarEntrega();
                            break;
                        case 5:
                            Entrega.actualizarEstadoEntrega();
                            break;
                        case 6:
                            Vehiculo.mostrarInformacion();
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                }
            }

    } // FIN DEL MAIN
    


