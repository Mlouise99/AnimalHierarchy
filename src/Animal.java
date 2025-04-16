public class Animal {
 protected String name;

    public Animal(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }
    public void  MakeSound() {
        System.out.println("Animal sound");
    }
}

