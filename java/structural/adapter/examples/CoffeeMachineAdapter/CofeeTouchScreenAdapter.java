package structural.adapter.examples.CoffeeMachineAdapter;

/**
 * Cofee Touch Screen Adapter
 * 
 */
public class CofeeTouchScreenAdapter implements CoffeeMachineInterface{

    private OldCoffeeMachine oldCoffeeMachine;

    public CofeeTouchScreenAdapter(OldCoffeeMachine newMachine) {
        oldCoffeeMachine = newMachine;
    }
    
    @Override
    public void chooseMakeCoffee() {
        oldCoffeeMachine.makeCoffee();
    }

    @Override
    public void chooseMakeCappuccino() {
        oldCoffeeMachine.makeCappuccino();
    }

    @Override
    public void ChooseMakeTea() {
        oldCoffeeMachine.makeTea();
    }
    
}
