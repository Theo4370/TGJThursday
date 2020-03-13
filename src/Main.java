import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Restaurante elResto = new Restaurante();
        Empleado unEmpleado = new EmpleadoGeneral("Terry, 25 años, empleado normal.", 100);
        Empleado otroEmpleado = new EmpVajilla("Jose, 32 años, bachero.",120, Arrays.asList("plato", "vaso", "cuchillo"));
        Empleado otroMas = new EmpVajilla("Maria, 30 años, bachero", 150, Arrays.asList("vaso"));

        elResto.agregarEmpleado(unEmpleado);
        elResto.agregarEmpleado(otroEmpleado);
        elResto.agregarEmpleado(otroMas);

        //System.out.printf("La lista de empleados es: "+elResto.getEmpleadosLista());


elResto.pagarSueldo();
    }
}
