public class EmpVajilla extends Empleado {
    public EmpVajilla(String informacionPersonal, Integer sueldo) {
        super(informacionPersonal, sueldo);
    }

    protected Integer cantidadVajillaRota;

    public Integer getCantidadVajillaRota() {
        return cantidadVajillaRota;
    }
}
