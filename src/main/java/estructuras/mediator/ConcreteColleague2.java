package estructuras.mediator;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("ConcreteColleague2 received: [" + msg + "]");
    }
}
