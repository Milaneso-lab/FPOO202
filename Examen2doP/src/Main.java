import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String AP = JOptionPane.showInputDialog("Ingrese su apellido paterno:");
        String AM = JOptionPane.showInputDialog("Ingrese su apellido materno:");
        String carrera = JOptionPane.showInputDialog("Ingrese su carrera:");
        String ano = JOptionPane.showInputDialog("Ingrese su año de nacimiento:");

        Matricula m = new Matricula(nombre, AP, AM, carrera, ano);

        m.generador(nombre, AP, AM, carrera, ano);
    }
}
