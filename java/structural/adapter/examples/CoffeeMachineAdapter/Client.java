package structural.adapter.examples.CoffeeMachineAdapter;

public class Client {
    public static void main(String[] args) {

        CoffeeMachineInterface coffeeMachine = new CofeeTouchScreenAdapter(new OldCoffeeMachine());
        coffeeMachine.chooseMakeCoffee();
        coffeeMachine.chooseMakeCappuccino();
        coffeeMachine.ChooseMakeTea();
    }

}
