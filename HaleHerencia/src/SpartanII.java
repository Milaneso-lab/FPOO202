public class SpartanII extends Spartan{

    // CONSTRUCTOR DE LA CALSE
    public SpartanII (String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,150);
    }

    // METODOS DE LA CLASE
    public void usarManejoAvanzado (){
        System.out.println(nombre + " usa tecnicas avanzadas y cuenta con mas Escudo");
    }

}// FIN DE LA CLASE
