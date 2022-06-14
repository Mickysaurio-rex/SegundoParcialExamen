package examen.ejercicio3;

public class Client {
    public static void main(String[]args){
        PaginaWeb p1 = new PaginaWeb();
        p1.suscribirse(new UserPagina("Video", new Persona("123","Nestor")));
        p1.suscribirse(new UserPagina("Todo", new Persona("124","Jose")));
        p1.suscribirse(new UserPagina("Video", new Persona("125","Carlos")));
        p1.suscribirse(new UserPagina("Todo", new Persona("126","Maria")));



    //p1.subirElemento(new Elemento("Hola", "Video"));
    p1.subirElemento(new Elemento("Hola", "Imagen"));

    }




}
