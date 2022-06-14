package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Estudiantes> inventario = new ArrayList<>();
    private IBusqueda estrategiaBusqueda;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void addEstudiante(Estudiantes estudiante){
        inventario.add(estudiante);
    }

    public IBusqueda getEstrategiaBusqueda() {
        return estrategiaBusqueda;
    }

    public void setEstrategiaBusqueda(IBusqueda estrategiaBusqueda) {
        this.estrategiaBusqueda = estrategiaBusqueda;
    }

    public void iniciarAlgoritmo(){
        estrategiaBusqueda.estrategiaDeOrdenamiento(inventario);
    }
}
