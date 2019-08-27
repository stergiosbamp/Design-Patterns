package Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){ }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // ﬁll the boiler with a milk/chocolate mixture
        }
    }

    public void setEmptyTrue(){
        empty = true;
    }
    //other methods...

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
