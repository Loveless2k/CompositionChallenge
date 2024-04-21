public class DishWasher extends Appliance{
    public void doDishes(){

        if (isHasWorkToDo()){
            System.out.println("Washing Dishes...");
            setHasWorkToDo(false);
        }
    }
}
