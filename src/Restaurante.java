import java.util.List;

public class Restaurante {

    public List<Empleado> empleadosLista;


    public void agregarEmpleado(Empleado empleado) {
        empleadosLista.add(empleado);
    }

    public void pagarSueldo() {
        for (Empleado empleado : empleadosLista) {
            empleado.calcularSueldo();
            empleado.getInformacionPersonal();
        }


    }
}
