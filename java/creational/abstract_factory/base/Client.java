package creational.abstract_factory.base;

/**
 * Client
 * 
 * The client is the class that uses the factory. It uses the abstract factory
 * to create the products and call their display methods.
 * 
 * @author hxa.dev
 * 
 */
public class Client {
    public static void main(String[] args) {

        AbstractFactory factory = new ConcreteFactory();
        AbstractProductA productA = factory.createProductA();
        productA.display();
        AbstractProductB productB = factory.createProductB();
        productB.display();
    }
}
