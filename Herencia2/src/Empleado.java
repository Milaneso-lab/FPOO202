import javax.swing.JOptionPane;

public class Empleado {

    private String nombe;
    private int id;
    private double Salario;

    // CONSTRUCTOR DE LA CLASE
    public Empleado(String nombe, int id, double salario) {
        this.nombe = nombe;
        this.id = id;
        Salario = salario;
    }

    // METODO DE LA CLASE
    public void mostrarInfo (){
        JOptionPane.showMessageDialog(null, "Nombre del empleado: " + nombe);
        JOptionPane.showMessageDialog(null, "Id del empleado: " + id);
        JOptionPane.showMessageDialog(null, "Salario del empleado: " + Salario);
    }

    // ZONA DE GETS Y SETS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

}// FIN DE LA CLASE
