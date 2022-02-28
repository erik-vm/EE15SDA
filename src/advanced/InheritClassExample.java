package advanced;

class Parent{
    protected int num1;
    protected int num2;

    public Parent(int num1, int num2){ //constructor dos not need return type
        this.num1 = num1;
        this.num2 = num2;
    }
    public void printInfo(){
        System.out.println("This is parent class");
    }
    public void printValues(){
        System.out.println(num1+num2);
    }
}

class Child extends Parent{

    public Child(int num1, int num2) {
        super(num1, num2);  // super is used when custom constructors are used
    }
    public void printChildInfo(){
        System.out.println("This is child class");
    }
    @Override
    public void printInfo(){
        System.out.println("This is modified printInfo method");
    }
}


public class InheritClassExample {
    public static void main(String[] args) {
        Parent parent = new Parent(12,23);
        parent.printInfo();
        parent.printValues();

        Child child = new Child(15,92);
        child.printInfo();   // this comes from parent class
        child.printChildInfo();   //this is from child class
        child.printValues();
    }
}
