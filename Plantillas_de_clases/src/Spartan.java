public class Spartan {

    private String nombre;
    private int salud;
    private int escudo;
    private String  armaPrincipal;

    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.armaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
        System.out.println("=========Informacion del Spartan=========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud actual: " + salud);
        System.out.println("Escudo actual: " + escudo);
        System.out.println("Arma principal equipada: " + armaPrincipal);
        System.out.println("----------------------------------------");
    }

    public void Atacar (String enemigo){
        System.out.println(nombre + " elimino a " + enemigo + " con " + armaPrincipal);
    }

    public void RecargarArma (int municion){
        int restantes = 10;
        int total = restantes + municion;
        System.out.println(armaPrincipal + " se esta recargando.");
        System.out.println(armaPrincipal + "ahora tiene " + total + " balas.");
    }

    public void correr (boolean status){
        if (status){
            System.out.println(nombre + " esta corriendo");
        }else {
            System.out.println(nombre + " esta detenido");
        }
    }

    private void consultarCortana (){
        System.out.println( "Consultando :(" );
    }

    // ZONA DE GETS Y SETS
    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

}//llave de la clase
