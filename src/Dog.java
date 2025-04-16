public class  Dog extends Animal {
    public Dog(String name)
    {
        super(name);
    }
    @Override
    public void MakeSound() {
        System.out.println("Woof");
    }
}
