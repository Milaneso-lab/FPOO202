import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    String[] tiposEmpleado = {"Conductor", "Administrativo"};
                    int tipoEmpleado = JOptionPane.showOptionDialog(null, "Seleccione el tipo de empleado", "Tipo de Empleado",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposEmpleado, tiposEmpleado[0]);

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                    if (tipoEmpleado == 0) {
                        String tipoLicencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
                        empleados.add(new Conductor(nombre, id, salario, tipoLicencia));
                    } else if (tipoEmpleado == 1) {
                        String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                        empleados.add(new Administrativo(nombre, id, salario, departamento));
                    }
                    break;

                case 1:
                    if (empleados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    } else {
                        StringBuilder infoEmpleados = new StringBuilder();
                        for (Empleado empleado : empleados) {
                            infoEmpleados.append("Nombre: ").append(empleado.getNombe()).append("\n")
                                    .append("ID: ").append(empleado.getId()).append("\n")
                                    .append("Salario: ").append(empleado.getSalario()).append("\n");

                            if (empleado instanceof Conductor) {
                                infoEmpleados.append("Tipo de Licencia (A, B, C o D): ").append(((Conductor) empleado).getTipo()).append("\n");
                            } else if (empleado instanceof Administrativo) {
                                infoEmpleados.append("Departamento: ").append(((Administrativo) empleado).getDepartamento()).append("\n");
                            }
                            infoEmpleados.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, infoEmpleados.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "GRACIAS.");
                    break;
            }
        } while (opcion != 2);

    }
}