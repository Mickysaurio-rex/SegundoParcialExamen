package examen.ejercicio3;

public interface ICanal {
    void suscribirse(IUser observer);
    void detach(IUser observer);
    void notifyObserver(Elemento elemento);
}
