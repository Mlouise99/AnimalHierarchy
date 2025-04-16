public class Bird extends Animal {
    public Bird(String name)
    {
        super(name);
    }
    @Override
    public void MakeSound() {
        System.out.println("Chirp");
    }
    public void fly() {
        System.out.println(name + " is flying.");
    }
}
