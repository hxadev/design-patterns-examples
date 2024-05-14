package creational.singleton.Base;

/**
 * Singleton class
 * 
 * The Singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
 * Eager singleton approach: this singleton type is created immediately, when the program starts.
 * 
 * @author hxa.dev
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton(); // Eager Singleton: Created immediately

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){ // Just call the existing instance
        return instance;
    }
    
}
