public class CofeeMaker extends Appliance{

    public void brewCoffee(){

        if (isHasWorkToDo()){
            System.out.println("Brewing Coffee...");
            setHasWorkToDo(false);
        }
    }
}
