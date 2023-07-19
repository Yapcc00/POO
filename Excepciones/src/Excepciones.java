import java.sql.SQLOutput;

public class Excepciones {

    public static void main(String[] args) {

        try {
            int resultado =  3/0;

        } catch (Exception e) {
            System.out.println("No se puede dividir por cero!!");
        }

        System.out.println("----------------------");

        try {
            int edades[] = {12, 24, 6, 8, 18};
            System.out.println("La edad de la posicion 5 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Intentastes acceder a un indice que no existe");
        }

    }

}
