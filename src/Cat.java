public class Cat extends Animal {
    public Cat(String name)
    {
        super(name);
    }
    @Override
    public void MakeSound() {
        System.out.println("Meow");
    }
}
