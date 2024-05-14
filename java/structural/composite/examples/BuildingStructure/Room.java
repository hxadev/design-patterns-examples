package structural.composite.examples.BuildingStructure;

/**
 * Room class that represents the Leaf Class 
 * why? Because a Room is a part of the class that can not coontains another IStructure
 * 
 * @author hxa.dev
 */
public class Room implements IStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("YOu have entered the "+this.name);
    }

    @Override
    public void exit() {
        System.out.println("You have left the "+this.name);
    }

    @Override
    public void location() {
        System.out.println("You are currently in "+this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
