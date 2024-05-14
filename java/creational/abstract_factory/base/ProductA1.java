package creational.abstract_factory.base;

/**
 * Concrete Product A
 * 
 * Concrete Product A defines the implementation that all concrete products must implement.
 * 
 * @author hxa.dev
 */

public class ProductA1 extends AbstractProductA{

    @Override
    public void display() {
        System.out.println("This is a ProductA1");
    }
    
}
