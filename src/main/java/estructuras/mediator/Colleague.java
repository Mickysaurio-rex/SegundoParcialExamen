package estructuras.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String msg);
    public abstract void received(String msg);
}
