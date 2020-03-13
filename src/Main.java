import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Empleado unEmpleado = new EmpleadoGeneral("Terry, 25 años.", 100);
        //Empleado otroEmpleado = new EmpVajilla("Jose, 32 años.", 120, Collections.singletonList(("plato", "vaso", "cuchillo")));
    //mpleado otroMas = new EmpVajilla("Maria, 30 años", 150, Collections.singletonList("copa"));
    unEmpleado.getInformacionPersonal();

    }
}
