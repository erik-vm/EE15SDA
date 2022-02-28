package advanced;

abstract class Bug{
    protected String name; // using protected keyword, will allow to use it in subclasses. private keyword will not allow it

    public void bugSound(){
        System.out.println("Bzz");
    }
    public abstract void move();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Ant extends Bug{

    @Override
    public void move() {
        System.out.println("Ant is moving");
    }
}
class Bee extends Bug{

    @Override
    public void move() {
        System.out.println("Bee is flying");
    }
    public void gatherHoney(){
        System.out.println("Found some honey. Let's gather it.");
    }
}
class Caterpillar extends Bug{

    @Override
    public void move(){
        System.out.println("Caterpillar is crawling");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.move();
        ant.setName("Andy");
        System.out.println("Ant " + ant.getName() + "is eating sugar.");

        Bee bee = new Bee();
        bee.setName("Barry");
        bee.move();
        System.out.println(bee.getName() + " is looking for honey");
        bee.gatherHoney();

        Caterpillar caterpillar = new Caterpillar();
        caterpillar.move();
        caterpillar.bugSound();
    }
}
