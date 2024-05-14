package structural.facade.base;

import java.util.ArrayList;
import java.util.List;

public class Facade{
    private List<String> messages;

    public Facade(){
        messages = new ArrayList<>();
    }

    public void display(String message) {
       System.out.println(message);
    }

    public String getMessage() {
        return messages.getLast();
    }

    public void addNewMessage(String message) {
        messages.add(message);
    }
    
}
