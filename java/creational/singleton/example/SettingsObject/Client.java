package creational.singleton.example.SettingsObject;

public class Client {

    public static void main(String[] args) {

        Settings settings = Settings.getInstance();
        settings.getLocation();
        
    }
}
