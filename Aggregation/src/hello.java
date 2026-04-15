class Car{
     String CarName;
     String CarColor;

    Car(String a, String b){
        CarName=a;
        CarColor=b;
    }


public String getname(){
    return CarName+" Color " +CarColor;

}}

class Driver{
    String Name;
    Car carDriver;

    Driver(String name, Car carDrive){
        this.Name=name;
        this.carDriver=carDrive;

    }
    String getDetails(){
        return Name+ " Drives " + carDriver.getname();
    }

}

public class hello {
    public static void main(String[] args) {
        Car c1 = new Car("Lamborghini", "Yellow");
        Car c2 = new Car("Toyota", "White");
        Driver d1= new Driver("Pranto",c1);
       System.out.println(c1.getname());
       System.out.println(d1.getDetails());

    }
}