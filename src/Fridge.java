public class Fridge extends Appliance{
    public void orderFood(){

        if (isHasWorkToDo()){
            System.out.println("Ordering Food...");
            setHasWorkToDo(false);
        }
    }
}
