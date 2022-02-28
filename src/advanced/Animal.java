package advanced;

public class Animal {
    protected String name;
    protected double weight;

    public void animalSound(){
        System.out.println("Roaaar");
    }
}

class Pig extends Animal{

    protected String colour;
    @Override
    public void animalSound(){
        System.out.println("Oink Oink");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalSound();

        Pig pig = new Pig();
        pig.name = "Babe";
        pig.weight = 70d;

        pig.animalSound();

    }
}
