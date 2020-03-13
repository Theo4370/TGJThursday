import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    public List<Empleado> empleadosLista;

    public Restaurante() {
        this.empleadosLista = new ArrayList<>();
    }

    public List<Empleado> getEmpleadosLista() {
        return empleadosLista;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadosLista.add(empleado);
    }

    public void pagarSueldo() {
        for (Empleado empleado : empleadosLista) {
            empleado.decirInfoPersonal();
            empleado.calcularSueldo();
        }


    }
}
