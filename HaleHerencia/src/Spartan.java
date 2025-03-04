public class Spartan extends Soldado {

    private int escudo;

    // CONSTRUCTOR DE LA CLASE
    public Spartan (String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma);
        this.escudo = escudo;
    }

    // METODOS DE LA CLASE
    @Override //EJEMPLO DEL POLIMORFISMO
    public void recibirDano(int dano){
        if(escudo > 0){
            escudo -= dano;
            if(escudo < 0){
                salud += escudo;
                escudo = 0;
            }
            System.out.println(nombre + "Recibio daño: " + escudo + " Salud: " + salud);
        }else{
            super.recibirDano(dano);
        }
    }

    public void recargarEscudo(){
        this.escudo = 100;
        System.out.println(nombre + " el Sparta ha recargado su escudo al maximo");
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }


}// FIN DE LA CLASE
