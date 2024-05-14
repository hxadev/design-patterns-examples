package structural.composite.examples.BuildingStructure;

import java.util.List;

/**
 * Housing class that represents the Composite Class
 * The compose pattern is used in this example 
 * 
 * @author hxa.dev
 */
public class Housing implements IStructure{
    private String address;
    private List<IStructure> structures;

    public Housing(String address) {
        this.address = address;
        this.structures = new java.util.ArrayList<IStructure>();
    }

    @Override
    public void enter() {
        System.out.println("YOu have entered the "+this.address);
    }
    @Override
    public void exit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exit'");
    }
    @Override
    public void location() {
        System.out.println("You are currently in "+this.getName()+". It has");
        for(IStructure struct:this.structures){
            System.out.println(struct.getName()+" in it");
        }
    }
    @Override
    public String getName() {
        return this.address;
    }
    public IStructure getStructure(int i) {
        return structures.get(i);
    }
    public int addStructure(IStructure structure) {
        this.structures.add(structure);
        return structures.size()-1;
    }

    



}
