package examen.ejercicio5;

public class Apagado implements IStateCompu{


    @Override
    public void resourgeManager(Computadora computadora) throws InterruptedException {
        System.out.println("*******Se apaga*******");

    }
}
