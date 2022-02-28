package advanced;

interface BugInterface{
    public void bugSound();
    public void bugSize();
}

interface Place{
    public void location();
}
interface Building{
    public void buildingPlan();
    public void costManagement();
}

class Ant1 implements BugInterface, Place{

    @Override
    public void bugSound() {
        System.out.println("Dzz");
    }

    @Override
    public void bugSize() {
        System.out.println("Small");
    }

    @Override
    public void location() {
        System.out.println("Anthill");
    }
}

class House implements Building, Place{

    @Override
    public void location() {
        System.out.println("City");
    }

    @Override
    public void buildingPlan() {
        System.out.println("Apartment");
    }

    @Override
    public void costManagement() {
        System.out.println("One euro :D");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Ant1 ant1 = new Ant1();
        ant1.bugSize();
        ant1.bugSound();
        ant1.location();

        House house = new House();
        house.buildingPlan();
        house.costManagement();
        house.location();

    }
}
