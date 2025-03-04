public class SpartanIII extends Spartan{

    // CONSTRUCTOR DE LA CLASE
    public SpartanIII (String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,80);
    }

    // METODOS DE LA CLASE
    public void camuflajeActivo (){
        System.out.println(nombre + " activo su Camuflaje");
    }

}// FIN DE LA CLASE
