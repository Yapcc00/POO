public class POO {
    public static void main(String[] args) {

        //el new = sirve para atraer el constructor Alumno
        Alumno alu1 = new Alumno();

        //Colocando valores al constructor
        Alumno alu2 = new Alumno(5, "Yeison" , "Cordoba");

        //formas de mostrar con get
        System.out.println("El ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es " + alu2.getNombre());
        System.out.println("El apellidon es " + alu2.getApellido());
        System.out.println("-------------------------------------------");
        //colocar valores al metodo vacio
        alu1.setId(1);
        alu1.setNombre("Andres");
        alu1.setApellido("Parra");
        System.out.println("El ID del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre dea lumno1 es " + alu1.getNombre());
        System.out.println("El apellido de alumno1 es " + alu1.getApellido());

        System.out.println("-------------------------------------------");

        //nuevo valores para el alumno 2 sobre escribiendolo
        alu2.setId(2);
        System.out.println("El ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es " + alu2.getNombre());
        System.out.println("El apellidon es " + alu2.getApellido());
    }
}
