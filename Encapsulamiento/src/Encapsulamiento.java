public class Encapsulamiento2 {

    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Yeison","Cordoba");

        System.out.println("Id:" + alu2.getId());
        System.out.println("Nombre:" + alu2.getNombre());
        System.out.println("Apellido:" + alu2.getApellido());
    }
}
