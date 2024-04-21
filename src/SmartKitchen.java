public class SmartKitchen {

    private Fridge fridge;
    private DishWasher dishWasher;
    private CofeeMaker cofeeMaker;

    public SmartKitchen() {
        this.fridge = new Fridge();
        this.dishWasher = new DishWasher();
        this.cofeeMaker = new CofeeMaker();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag){
        cofeeMaker.setHasWorkToDo(coffeeFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitcherWork(){
        cofeeMaker.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }

    public Fridge getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CofeeMaker getCofeeMaker() {
        return cofeeMaker;
    }
}
