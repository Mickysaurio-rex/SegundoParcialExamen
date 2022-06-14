package examen.ejercicio4;

public class Estudiantes {
    private int ci;
    private String nombre;
    private String carrera;
    private String fechaDeNacimiento;

    public Estudiantes(int ci, String nombre, String carrera, String fechaDeNacimiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void showInfo(){
        System.out.println("************Infor estudiante*************");
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(ci);
    }
}
