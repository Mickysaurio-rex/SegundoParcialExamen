package estructuras.strategy;

public class ConcreteStrategy1 implements IStrategy{
    @Override
    public void execute() {
        System.out.println("Ejecutando Algoritmo 1");
    }
}
