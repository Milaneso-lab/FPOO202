import javax.swing.JOptionPane;

public class Conductor {

    private String nombre;
    private String identificacion;
    private String licencia;

    // CONSTRUCTOR DE LA CLASE
    public Conductor(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    // ZONA DE GETS Y SETS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    // METODOS DE LA CLASE
    public static void registrarConductor() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
        Conductor conductor = new Conductor(nombre, identificacion, licencia);
        JOptionPane.showMessageDialog(null, "Conductor registrado: " + conductor.getNombre() + ", " + conductor.getIdentificacion() + ", " + conductor.getLicencia());
    }

}// FIN DE LA CLASE

