public class Main {
    public static void main(String[] args) {

        //creacion de una primera instancia
        Spartan MasterChief = new Spartan("Jhon", 100, 50, "Pistola de plasma");
        Spartan Reach = new Spartan("Antonio", 100, 0, "Espada de energia");

        //uso de los metodos
        MasterChief.mostrarInfo();
        MasterChief.Atacar("Covenat");
        MasterChief.RecargarArma(25);
        MasterChief.correr(true);

        // INTENTO DE USO DE UN METODO PRIVADO:
        // MasterChief.consultarCortana();

        // USO DEL GET Y SET PARA CAMBIAR ATRIBUTOS DE UN OBJETO
        MasterChief.setNombre("Antonio Madriz");
        MasterChief.mostrarInfo();
        System.out.println(MasterChief.getNombre());

        System.out.println();
        System.out.println();

        Reach.mostrarInfo();
        Reach.Atacar("Noble 6");
    }
}
