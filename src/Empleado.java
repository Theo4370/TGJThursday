public abstract class Empleado {


    private String informacionPersonal;
    private Integer sueldo;

    public String getInformacionPersonal() {
        return informacionPersonal;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public Empleado(String informacionPersonal, Integer sueldo) {
        this.informacionPersonal = informacionPersonal;
        this.sueldo = sueldo;
    }

    public void decirInfoPersonal() {
        System.out.println("Su informacion personal es: " + getInformacionPersonal());
    }

    public void calcularSueldo() {

    }


}
