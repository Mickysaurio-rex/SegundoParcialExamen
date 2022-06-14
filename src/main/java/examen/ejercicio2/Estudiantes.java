package examen.ejercicio2;

public class Estudiantes extends Persona{

    public Estudiantes(IChatDeJuegos chatDeJuegos) {
        super(chatDeJuegos);
    }


    @Override
    public void send(String msg, String destino) {
        chatDeJuegos.send(msg,this, destino);
    }

    @Override
    public void received(String msg) {
        System.out.println("El jugador con nombre: " + getNombre() );
        System.out.println("Recibio el mensaje: " + msg);
    }
}
