package creational.singleton.Base;


/**
 * Singleton class
 * 
 * The Singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
 * Lazy singleton approach: this singleton type just is created on demand, when the client call to the getInstance method.
 * 
 * @author hxa.dev
 */
public class LazySingleton{
    private static LazySingleton instance=null;



    public static LazySingleton getInstance(){ // Lazy singleton
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    };


}