import java.util.List;

public class EmpVajilla extends Empleado {
    public EmpVajilla(String informacionPersonal, Integer sueldo) {
        super(informacionPersonal, sueldo);
    }
protected List<String> queRopmio;
    protected Integer cantidadVajillaRota;

    public List<String> getQueRopmio() {
        return queRopmio;
    }

    public Integer getCantidadVajillaRota() {
        return cantidadVajillaRota;
    }
}
