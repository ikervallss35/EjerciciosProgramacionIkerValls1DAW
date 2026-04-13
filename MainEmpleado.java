import com.google.gson.Gson;
class Empleado {
    private int num;
    private String nombre;
    private int departamento;
    private int edad;
    private double sueldo;
    public Empleado(int num, String nombre, int departamento, int edad, double sueldo) {
        this.num = num;
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.sueldo = sueldo;
    }public int getNum() {
        return num;
    }public void setNum(int num) {
        this.num = num;
    }public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public int getDepartamento() {
        return departamento;
    }public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }public int getEdad() {
        return edad;
    }public void setEdad(int edad) {
        this.edad = edad;
    }public double getSueldo() {
        return sueldo;
    }public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }@Override
    public String toString() {
        return "Empleado{" + "num=" + num + ", nombre='" + nombre + '\'' + ", departamento=" + departamento + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
}public class MainEmpleado {
    public static void main(String[] args) {
        final String json = "{\"num\": 1, " +
                "\"nombre\": \"Andreu\", " +
                "\"departamento\": 10, " +
                "\"edad\": 32, " +
                "\"sueldo\": 1000.0}";
        final Gson gson = new Gson();
        final Empleado empleado = gson.fromJson(json, Empleado.class);
        System.out.println(empleado);
    }
}