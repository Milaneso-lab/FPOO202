public class Spartan {

    public String nombre;
    public int salud;
    public int escudo;
    public String  armaPrincipal;

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

}//llave de la clase
