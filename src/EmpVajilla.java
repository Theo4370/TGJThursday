import java.util.List;

public class EmpVajilla extends Empleado {
    public EmpVajilla(String informacionPersonal, Integer sueldo) {
        super(informacionPersonal, sueldo);
    }

    protected List<String> queRompio;
    protected Integer cantidadVajillaRota;

    public List<String> getQueRompio() {
        return queRompio;
    }

    public Integer getCantidadVajillaRota() {
        return cantidadVajillaRota;
    }
}
