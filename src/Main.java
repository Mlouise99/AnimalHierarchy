//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a Bird object
        Bird myBird = new Bird("Parrot");
        System.out.println("Animal sound Testing");
        System.out.println("Bird name is: " + myBird.name);
        System.out.print("Bird says: ");
        myBird.MakeSound();
        System.out.print("Bird does: ");
        myBird.fly();

// try to access an name that is not set
        System.out.println("Polymorphism test:");
        Animal cat = new Cat("");
        System.out.println("Cat name is: " + cat.name);
        //display the sound of cat
        System.out.print("Cat says: ");
        cat.MakeSound();
        Animal dog = new Dog("Dog");
        System.out.print("Dog says: ");
        dog.MakeSound();


    }
}