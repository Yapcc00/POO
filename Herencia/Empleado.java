package herencia;

public class Empleado extends Persona {
    int num_legajo:
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int num_legajo, String cargo, Double sueldo) {
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
}
