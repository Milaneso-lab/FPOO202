import javax.swing.JOptionPane;

public class Administrativo extends Empleado{

    private String Departamento;

    // CONSTRUCTOR DE LA CLASE
    public Administrativo (String nombre, int id, double Salario, String Departamento){
        super(nombre,id,Salario);
        this.Departamento = Departamento;
    }

    // METODOS DE LA CLASE
    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "El departamento es: " + Departamento);
    }

    // ZONA DE GETS Y SETS
    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

}// FIN DE LA CLASE
