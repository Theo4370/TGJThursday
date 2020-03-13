import java.util.List;

public class EmpVajilla extends Empleado {
    public EmpVajilla(String informacionPersonal, Integer sueldo, List<String> queRompio) {
        super(informacionPersonal, sueldo);
    }

    protected List<String> queRompio;


    public List<String> getQueRompio() {
        return queRompio;
    }


    public Integer getCantidadVajillaRota() {
        Integer numeroCantidadVajillaRota = 0;
        for (Integer i = 0; i < queRompio.size(); i++) {
            numeroCantidadVajillaRota = 1 + i;
        }
        return numeroCantidadVajillaRota;
    }


    @Override
    public void calcularSueldo() {
        Integer nuevoSueldo;
        nuevoSueldo = getSueldo() - 5 * getCantidadVajillaRota();

        System.out.printf("Su sueldo, contando la vajilla rota es de: "+nuevoSueldo);
    }
}

