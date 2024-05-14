package creational.singleton.example.SettingsObject;


/**
 * Singleton class
 * 
 * The Singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
 * This example shows how to use the Singleton pattern with an object.
 * @author hxa.dev
 */
public class Settings {

    private static Settings settings = new Settings(); // singleton created
    private String username;
    private String location;
    private String timezone;

    private Settings(){}

    public static Settings getInstance(){
        return settings;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    
}
