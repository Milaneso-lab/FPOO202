public class Main {
    public static void main(String[] args) {

        //creacion de una primera instancia
        Spartan MasterChief = new Spartan();
        Spartan Reach = new Spartan();

        //uso de los atributos
        MasterChief.nombre = "John";
        MasterChief.salud = 100;
        MasterChief.escudo = 50;
        MasterChief.armaPrincipal = "Pistola de plasma";

        //uso de los metodos
        MasterChief.mostrarInfo();
        MasterChief.Atacar("Covenat");
        MasterChief.RecargarArma(25);
        MasterChief.correr(true);

        System.out.println();
        System.out.println();

        //Creacion de la segunda instancia
        Reach.nombre = "Milaneso";
        Reach.salud = 100;
        Reach.escudo = 0;
        Reach.armaPrincipal = "Espada de energia";

        Reach.mostrarInfo();
        Reach.Atacar("Noble 6");
    }
}