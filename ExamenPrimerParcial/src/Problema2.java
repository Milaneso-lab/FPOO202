public class Problema2 {
    public static void main(String[] args){

        System.out.println("Multiplos de 10 entre el 10 y 100: ");

        for (int i = 10; i <= 1000; i++){
            if (i % 10 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
