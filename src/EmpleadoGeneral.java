public class EmpleadoGeneral extends Empleado{

    public EmpleadoGeneral(String informacionPersonal, Integer sueldo) {
        super(informacionPersonal, sueldo);

    }

    @Override
    public void calcularSueldo() {
        System.out.println("Su sueldo es: " +getSueldo());
    }
}
