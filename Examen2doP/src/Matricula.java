import javax.swing.JOptionPane;
import java.util.Random;

public class Matricula {

    private String nombre;
    private String AP;
    private String AM;
    private String carrera;
    private String ano;
    String curso = "2025";
    String num = "0123456789";

    // CONSTRUCTOR DE LA CLASE
    public Matricula(String nombre, String AP, String AM, String carrera, String ano) {
        this.nombre = nombre;
        this.AP = AP;
        this.AM = AM;
        this.carrera = carrera;
        this.ano = ano;
    }

    public void generador(String nombre, String AP, String AM, String carrera, String ano) {
        Random random = new Random();

        char numero1 = num.charAt(random.nextInt(num.length()));
        char numero2 = num.charAt(random.nextInt(num.length()));

        JOptionPane.showMessageDialog(null, "Su matrícula es: " + nombre.charAt(0) + AP.charAt(0) + AP.charAt(1) + AM.charAt(0)
                + AM.charAt(1) + ano.substring(2) + curso.substring(2) + carrera.charAt(0) + carrera.charAt(1) + carrera.charAt(2)
                + numero1 + numero2);
    }

} // Fin de la clase


