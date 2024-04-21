public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        // Option 1
        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.getCofeeMaker().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getFridge().orderFood();

        // Option 2
        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitcherWork();

    }
}
