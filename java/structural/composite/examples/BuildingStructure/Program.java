package structural.composite.examples.BuildingStructure;

public class Program {
    public static void main(String[] args) {
        Housing building = new Housing("Sunnydale");
        Housing floor1 = new Housing("123 Street - First Floor");

        int firstFloor = building.addStructure(floor1);

        Room washroom1m = new Room("Room 1 Men´s Washroom");
        Room washroom1w = new Room("Room 2 Women´s Washroom");
        Room commonroom = new Room("Room 3 Common Area");

        int firstM = floor1.addStructure(washroom1m);
        int secondW = floor1.addStructure(washroom1w);
        int common = floor1.addStructure(commonroom);

        building.enter(); // Enter the building
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter(); // Enter the first floor
        IStructure currentWashroom = currentFloor.getStructure(firstM);
        currentWashroom.enter(); // Enter the men‘s washroom
   

    }
}
