package estructuras.changeOfResponsability;

public class ConcreteHandler3 implements  IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        if(amount >= 200 && amount < 300){
            System.out.println("ConcreteHandler3 lo esta resolviendo: " + amount);
        }else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
