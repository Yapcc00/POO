public class Alumno {
        //Clases con variables Globales
        int id;
        String nombre;
        String apellido;

        //Constructor vacio
        public Alumno() {}

        //Constructor con parametros
        public Alumno(int id, String nombre, String apellido) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
        }

        //Getter y setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

    //Metodo
        //modificador //TDato //NombreVariable
        public void mostrarNombre() {
            System.out.println("Hola,Soy un Alumno");
        }

    }

