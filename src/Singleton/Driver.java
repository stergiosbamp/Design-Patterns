package Singleton;

public class Driver {

    public static void main(String[] args) {

        // Ensure only one instance of class is created

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println("Instance is empty? Answer: " + chocolateBoiler.isEmpty());

        chocolateBoiler.setEmptyTrue();
        System.out.println("Instance is empty? Answer: " + chocolateBoiler.isEmpty());

        // chocolateBoiler2 is the same as chocolateBoiler
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        System.out.println("Instance is empty? Answer: " + chocolateBoiler2.isEmpty());


    }
}
