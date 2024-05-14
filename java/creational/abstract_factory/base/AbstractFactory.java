package creational.abstract_factory.base;
/**
 * Abstract Factory
 * 
 * The Abstract Factory pattern is a software design pattern that provides an interface for creating families of related objects without specifying their concrete classes.
 * 
 * This interface represent the AbstractFactory in charge of creating the AbstractProducts.
 * @author hxa.dev
 */
public interface AbstractFactory {

    AbstractProductA createProductA();
    AbstractProductB createProductB();

}
