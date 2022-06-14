package examen.ejercicio4;

public class Client {
    public static void main(String[]args) {
        Universidad u = new Universidad("Upb");

        u.addEstudiante(new Estudiantes(123,"miguel", "comunicacion", "01 de abril"));
        u.addEstudiante(new Estudiantes(023,"jose", "comunicacion", "01 de abril"));

        //u.setEstrategiaBusqueda(AlgoPorCarnet);
    }
}
