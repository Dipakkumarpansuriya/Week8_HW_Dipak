package methodoverriding23;

/*23. Example of method overriding (Create package name ‘methodoverriding23’ and
create all below classes in this package)*/

class Bike2 extends Vehicle{
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2();
        obj.run();
    }
}
