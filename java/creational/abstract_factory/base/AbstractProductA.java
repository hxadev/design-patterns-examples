package creational.abstract_factory.base;

/**
 * Abstract Product A
 * 
 * Abstract Product A defines the abstraction that all concrete products must implement.
 * 
 * @author hxa.dev
 */
public abstract class AbstractProductA {
    protected String name;
    protected String description;
    protected float price;
    protected String department;

    public abstract void display();


}
