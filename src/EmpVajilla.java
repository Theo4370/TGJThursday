import java.util.ArrayList;
import java.util.List;

public class EmpVajilla extends Empleado {
    public EmpVajilla(String informacionPersonal, Integer sueldo, List<String> queRompio) {
        super(informacionPersonal, sueldo);
        this.queRompio = queRompio;
    }

   protected List<String> queRompio = new ArrayList<>();


    public List<String> getQueRompio() {
        return queRompio;
    }


    public Integer getCantidadVajillaRota() {
        Integer numeroCantidadVajillaRota = 0;
        for (Integer i = 0; i <= queRompio.size(); i++) {
            numeroCantidadVajillaRota = i;
        }
        return numeroCantidadVajillaRota;
    }


    @Override
    public void calcularSueldo() {


        System.out.println("Cantidad de vajilla rota: "+getCantidadVajillaRota());

        System.out.println("La vajilla rota fue: " +getQueRompio());
        Integer nuevoSueldo;
        nuevoSueldo = getSueldo() - 5 * getCantidadVajillaRota();

        System.out.println("Su sueldo, contando la vajilla rota es de: "+nuevoSueldo);
    }
}

