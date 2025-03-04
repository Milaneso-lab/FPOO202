public class SpartanIV extends Spartan{

    // CONSTRUCTOR DE LA CALSE
    public SpartanIV (String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,100);
    }

    // METODOS DE LA CLASE
    public void usarPropulsores (){
        System.out.println(nombre + " esta volviendo a la base con sus propulsores");
    }

}// FIN DE LA CLASE
