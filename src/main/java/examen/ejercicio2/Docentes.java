package examen.ejercicio2;

public class Docentes extends Persona{

    public Docentes(IChatDeJuegos chatDeJuegos) {
        super(chatDeJuegos);
    }


    @Override
    public void send(String msg, String destino) {
        chatDeJuegos.send(msg,this, destino);
    }

    @Override
    public void received(String msg) {
        System.out.println("El jugador del equipo: " + getEquipo() + " con nombre: " + getNombre() );
        System.out.println("Recibio el mensaje: " + msg);
    }
}
