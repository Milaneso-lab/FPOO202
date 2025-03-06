import javax.swing.JOptionPane;

public class Conductor extends Empleado{

    private String Tipo;

    // CONSTRUCTOR DE LA CLASE
    public Conductor (String nombre, int id, double Salario, String Tipo){
        super(nombre,id,Salario);
        this.Tipo = Tipo;
    }

    // METODO DE LA CLASE
    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "El tipo de licencia es: " + Tipo);
    }

    // ZONA DE GETS Y SETS
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

}// FIN DE LA CLASE
