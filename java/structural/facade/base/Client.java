package structural.facade.base;

public class Client {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.addNewMessage("This is a message");
        facade.display(facade.getMessage());
    }
}
