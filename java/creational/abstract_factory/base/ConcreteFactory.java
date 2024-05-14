package creational.abstract_factory.base;

/**
 * Concrete Factory
 * 
 * The concrete factory is the factory that creates the concrete products. this
 * implements of AbstractFactory
 * and overridde the abstract methods
 * 
 */
public class ConcreteFactory implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
