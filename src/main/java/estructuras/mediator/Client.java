package estructuras.mediator;

public class Client {
    public static void main(String[]args){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.setUser1(c1);
        mediator.setUser2(c2);

        c1.sendMessage("Este mensaje es para C2" );
        c2.sendMessage("Mensaje Claro");
    }
}
